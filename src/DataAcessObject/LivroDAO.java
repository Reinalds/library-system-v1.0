package DataAcessObject;

import ValueObject.AutorVO;
import ValueObject.EditoraVO;
import ValueObject.EmprestimoGenericoVO;
import ValueObject.ExemplarLivroVO;
import ValueObject.LivroVO;
import ValueObject.RevistaVO;
import java.sql.*;
import java.util.ArrayList;

public class LivroDAO
{
    private Conexao c;
    
    public LivroDAO()
    {
        c = new Conexao();
    }
    
    public Conexao getConexao() 
    {
        return c;
    }
    
    public ArrayList<LivroVO> buscarLivros() throws ClassNotFoundException, SQLException
    {
        ArrayList<LivroVO> livros = new ArrayList();
        Connection con = c.conectar();
        String sql = "SELECT titulo, nomeeditora, localedicao, codigoisbn FROM livro";
        
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            livros.add(new LivroVO(res.getString("titulo"), res.getString("localedicao"), res.getString("codigoisbn"), new EditoraVO(res.getString("nomeeditora"))));
        }
        
        buscarAutoresLivros(livros);
        
        c.desconectar();
        return livros;
    }
    
    public void buscarAutoresLivros(ArrayList<LivroVO> livros) throws ClassNotFoundException, SQLException
    {
        for(LivroVO livro:livros)
        {
            buscarAutoresLivro(livro);
        }
    }
    
    public void inserirAutoresLivro(ArrayList<LivroVO> livros, AutorVO autor) throws ClassNotFoundException, SQLException
    {
        for(LivroVO livro:livros)
        {
            inserirAutorLivro(livro, autor);
        }
    }
    
    public int inserirAutorLivro(LivroVO livro, AutorVO autor) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "INSERT INTO autorlivro(titulo, nomeautor) VALUES ('"+ livro.getTitulo() +"', '"+ autor.getNome() +"')";

        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);

        c.desconectar();
        return res;
    }
    
    public int atualizarAutorLivro(LivroVO livro, AutorVO autor, AutorVO autorNew) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "UPDATE autorlivro SET autor = '"+ autorNew.getNome() +"' WHERE titulo = '"+ livro.getTitulo() +"', nomeautor = '"+ autor.getNome() +"'";
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public int deletarAutorLivro(LivroVO livro, AutorVO autor) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "DELETE FROM autorlivro WHERE titulo = '"+ livro.getTitulo() +"' AND nomeautor = '"+ autor.getNome() +"'";
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    private void inserirAutoresLivro(LivroVO livro) throws ClassNotFoundException, SQLException {
        ArrayList<AutorVO> autores = livro.getAutores();
        for(AutorVO autor:autores)
        {
            inserirAutorLivro(livro, autor);
        }
    }
    
    private void atualizarAutoresLivro(LivroVO livro, LivroVO livroNew) throws ClassNotFoundException, SQLException 
    {
        for(AutorVO autor:livro.getAutores())
        {
            deletarAutorLivro(livro, autor);
        }
        for(AutorVO autor:livroNew.getAutores())
        {
            inserirAutorLivro(livroNew, autor);
        }
    }
    
    private int deletarAutoresLivro(LivroVO livro) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "DELETE FROM autorlivro WHERE titulo = '"+ livro.getTitulo() +"'";
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public void buscarAutoresLivro(LivroVO livro) throws ClassNotFoundException, SQLException
    {
        ArrayList<AutorVO> autores = new ArrayList();
        Connection con = c.conectar();
        String sql = "SELECT nomeautor FROM autorlivro WHERE titulo = '"+ livro.getTitulo() +"'";
        
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            autores.add(new AutorVO(res.getString("nomeautor")));
        }
        
        c.desconectar();
        livro.setAutores(autores);
    }
    
    public int inserirLivro(LivroVO livro) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "INSERT INTO livro(titulo, nomeeditora, localedicao, codigoisbn";
        for(int i=0;i<livro.getPalavrasChave().size(); i++)
        {
            sql += ", pchave"+(i+1);
        }

        sql +=  ") VALUES ('"+ livro.getTitulo() 
                +"', '"+ livro.getEditora().getNome() 
                +"', '"+ livro.getLocalEdicao() 
                +"', '"+ livro.getCodigoISBN();
        for(String pChave:livro.getPalavrasChave())
        {
            sql += "', '"+ pChave;
        }
        
        sql += "')";
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        inserirAutoresLivro(livro);
        return res;
    }
    
    public int atualizarLivro(LivroVO livro, LivroVO livroNew) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "UPDATE livro SET titulo = '"+ livroNew.getTitulo() +"', nomeeditora = '"+ livroNew.getEditora().getNome()+"', localedicao = '"+ livroNew.getLocalEdicao() +"', codigoisbn = '"+ livroNew.getCodigoISBN() +"'";
        
        for(int i=0;i<livroNew.getPalavrasChave().size(); i++)
        {
            sql += ", pchave"+ (i+1) +" = '"+ livroNew.getPalavrasChave().get(i) +"'";
        }
        
        for(int i = livroNew.getPalavrasChave().size()+1; i<4; i++)
        {
            sql += ", pchave"+ i +" = null";
        }
        
        
        sql += " WHERE titulo = '"+ livro.getTitulo() +"'";
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        if(!livro.getAutores().equals(livroNew.getAutores()))
            atualizarAutoresLivro(livro, livroNew);
        return res;
    }
    
    public int deletarLivro(LivroVO livro) throws ClassNotFoundException, SQLException
    {
        deletarAutoresLivro(livro);
        
        Connection con = c.conectar();
        String sql = "DELETE FROM livro WHERE titulo = '"+ livro.getTitulo() +"'";
        
        Statement sessao  =con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }

    public void buscarLivro(LivroVO livro) throws SQLException, ClassNotFoundException 
    {
        Connection con = c.conectar();
        String sql = "SELECT nomeeditora, localedicao, codigoisbn, pchave1, pchave2, pchave3 FROM livro WHERE titulo = '"+ livro.getTitulo() +"'";
        
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            livro.setCodigoISBN(res.getString("codigoisbn"));
            livro.setLocalEdicao(res.getString("localedicao"));
            livro.setEditora(new EditoraVO(res.getString("nomeeditora")));
            
            ArrayList<String> pChave = new ArrayList();
            pChave.add(res.getString("pchave1"));
            pChave.add(res.getString("pchave2"));
            pChave.add(res.getString("pchave3"));
            livro.setPalavrasChave(pChave);
        }
        c.desconectar();
        buscarAutoresLivro(livro);
    }
    
    public int buscarQuantExemplaresDisponiveis(LivroVO livro) throws SQLException, ClassNotFoundException
    {
        Connection con = c.conectar();
        String sql = "SELECT COUNT(*) FROM exemplarlivro WHERE titulo = '"+ livro.getTitulo() +"' AND disponivel = true";
        
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        int quantExemplar = 0;
        while(res.next())
        {
            quantExemplar = res.getInt("count");
        }
        
        c.desconectar();
        return quantExemplar;
    }

    public void removerExemplares(LivroVO livro) throws ClassNotFoundException, SQLException
    {
    
        Connection con = c.conectar();
        String sql = "DELETE FROM exemplarlivro WHERE titulo = '"+ livro.getTitulo() +"'";
        
        Statement sessao = con.createStatement();
        sessao.executeUpdate(sql);
        
        c.desconectar();
    
    }
    
    public void removerExemplaresDisponiveis(LivroVO livro) throws ClassNotFoundException, SQLException
    {
    
        Connection con = c.conectar();
        String sql = "DELETE FROM exemplarlivro WHERE titulo = '"+ livro.getTitulo() +"' AND disponivel = TRUE";
        
        Statement sessao = con.createStatement();
        sessao.executeUpdate(sql);
        
        c.desconectar();
    
    }
    
    public ArrayList<EmprestimoGenericoVO> buscarExemplares(String titulo) throws ClassNotFoundException, SQLException {
        
        ArrayList<EmprestimoGenericoVO> exemplares = new ArrayList<>();
        EmprestimoGenericoVO exemplar;
        String sql = "select exemplar from exemplarLivro where titulo = '" + titulo + "'";
        
        Connection con = c.conectar();
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next()) {
            
            exemplar = new EmprestimoGenericoVO(res.getInt("exemplar"));
            exemplares.add(exemplar);
        
        }
        
        c.desconectar();
        return exemplares;
    
    }
    
    
}

package DataAcessObject;

import ValueObject.AutorVO;
import ValueObject.LivroVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AutorDAO
{
    private Conexao conexao;
    
    public AutorDAO()
    {
        conexao = new Conexao();
    }
    
    public Conexao getConexao() 
    {
        return conexao;
    }
    
    public int inserirAutor(AutorVO autor) throws ClassNotFoundException, SQLException
    {
        conexao = new Conexao();
        Connection con = conexao.conectar();
        
        String sql = "INSERT INTO autor(nomeautor) values ('"+autor.getNome()+"')";
        Statement sessao = con.createStatement();
        int resultado = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return resultado;
    }
    
    public int deletarAutor(AutorVO autor) throws ClassNotFoundException, SQLException
    {
        conexao = new Conexao();
        Connection con = conexao.conectar();
        
        String sql = "DELETE FROM autor WHERE nomeautor = '"+autor.getNome()+"'";
        Statement sessao = con.createStatement();
        int resultado = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return resultado;
    }
    
    public int atualizarAutor(AutorVO autor, AutorVO autorNew) throws ClassNotFoundException, SQLException
    {
        conexao = new Conexao();
        Connection con = conexao.conectar();
        
        String sql = "UPDATE autor SET nomeautor = '"+autorNew.getNome()+"' WHERE nomeautor = '"+autor.getNome()+"'";
        Statement sessao = con.createStatement();
        int resultado = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return resultado;
    }
    
    public void atualizarAutorLivros(AutorVO autor, AutorVO autorNew, ArrayList<LivroVO> livros) throws ClassNotFoundException, SQLException
    {
        deletarAutorLivros(autorNew);
        for(LivroVO livro:livros)
        {
            inserirAutorLivro(autorNew, livro);
        }
        
    }
    
    public int deletarAutorLivros(AutorVO autor) throws ClassNotFoundException, SQLException
    {
        conexao = new Conexao();
        Connection con = conexao.conectar();
        String sql = "DELETE FROM autorlivro WHERE nomeautor = '"+ autor.getNome() +"'";
        
        Statement sessao = con.createStatement();
        int resultado = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return resultado;
    }
    
    public ArrayList<AutorVO> buscarAutores() throws ClassNotFoundException, SQLException
    {
        ArrayList<AutorVO> autor = new ArrayList();
        conexao = new Conexao();
        Connection con = conexao.conectar();
        
        String sql = "SELECT nomeautor FROM autor ORDER  BY nomeautor";
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            autor.add(new AutorVO(res.getString("nomeautor")));
        }
        
        conexao.desconectar();
        return autor;
    }
    
    
    
    public ArrayList<LivroVO> buscarAutoresLivro(AutorVO autor) throws ClassNotFoundException, SQLException
    {
        ArrayList<LivroVO> livros = new ArrayList();
        Connection con = conexao.conectar();
        String sql = "SELECT titulo FROM autorlivro WHERE nomeautor = '"+ autor.getNome() +"'";
        
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            livros.add(new LivroVO(res.getString("titulo")));
        }
        
        conexao.desconectar();
        return livros;
    }

    private int inserirAutorLivro(AutorVO autor, LivroVO livro) throws ClassNotFoundException, SQLException 
    {
        Connection con = conexao.conectar();
        String sql = "INSERT INTO autorlivro(titulo, nomeautor) VALUES ('"+ livro.getTitulo() +"', '"+ autor.getNome() +"')";
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return res;
    }

    
    
    
}

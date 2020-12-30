package DataAcessObject;

import ValueObject.ExemplarLivroVO;
import ValueObject.LivroVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ExemplarLivroDAO
{
    Conexao c;
    
    public ExemplarLivroDAO()
    {
        c = new Conexao();
    }

    public Conexao getConexao() 
    {
        return c;
    }
    
    public int inserirExemplarLivro(ExemplarLivroVO livro) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "INSERT INTO exemplarlivro(titulo, exemplar, disponivel) VALUES ('"+ livro.getTitulo() +"', "+ livro.getNumExemplar() +", true)";
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public int removerExemplarLivro(ExemplarLivroVO livro) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "DELETE FROM exemplarlivro WHERE titulo = '"+ livro.getTitulo() +"', exemplar = "+ livro.getNumExemplar();
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public int atualizarExemplarLivro(ExemplarLivroVO livro, ExemplarLivroVO livroNew) throws SQLException, ClassNotFoundException
    {
        Connection con = c.conectar();
        String sql = "UPDATE exemplarlivro SET exemplar = "+ livroNew.getNumExemplar() +" WHERE titulo = '"+ livro.getTitulo() +"', exemplar = "+ livro.getNumExemplar();
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public int emprestarExemplarLivro(ExemplarLivroVO livro) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "UPDATE exemplarlivro SET disponivel = false WHERE titulo = '"+ livro.getTitulo() +"' and exemplar = "+ livro.getNumExemplar();
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public int devolverExemplarLivro(ExemplarLivroVO livro) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "UPDATE exemplarlivro SET disponivel = true WHERE titulo = '"+ livro.getTitulo() +"' and exemplar = "+ livro.getNumExemplar();
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public ArrayList<ExemplarLivroVO> buscarExemplaresLivro(LivroVO livro) throws ClassNotFoundException, SQLException
    {
        ArrayList<ExemplarLivroVO> exemplares = new ArrayList();
        Connection con = c.conectar();
        String sql = "SELECT exemplar, disponivel FROM exemplarlivro WHERE titulo = '"+ livro.getTitulo() +"'";
        
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            exemplares.add(new ExemplarLivroVO(res.getInt("exemplar"), res.getBoolean("disponivel"), livro.getTitulo()));
        }
        
        c.desconectar();
        return exemplares;
    }
    
    public int buscarNumExemplar(int numEx) throws SQLException, ClassNotFoundException 
    {
        int rs=0;
        Connection con = c.conectar();
        String sql = "SELECT exemplar FROM exemplarlivro WHERE exemplar = "+ numEx;
        
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            rs++;
        }
        
        c.desconectar();
        return rs;
    }
}

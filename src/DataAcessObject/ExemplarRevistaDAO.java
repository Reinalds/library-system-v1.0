package DataAcessObject;

import ValueObject.ExemplarRevistaVO;
import ValueObject.RevistaVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ExemplarRevistaDAO
{
    Conexao c;
    
    public ExemplarRevistaDAO()
    {
        c = new Conexao();
    }

    public Conexao getConexao() 
    {
        return c;
    }
    
    public int inserirExemplarRevista(ExemplarRevistaVO revista) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "INSERT INTO exemplarrevista(titulo, exemplar, disponivel) VALUES ('"+ revista.getTitulo() +"', "+ revista.getNumExemplar() +", true)";
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public int removerExemplarRevista(ExemplarRevistaVO revista) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "DELETE FROM exemplarrevista WHERE titulo = '"+ revista.getTitulo() +"', exemplar = "+ revista.getNumExemplar();
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public int atualizarExemplarRevista(ExemplarRevistaVO revista, ExemplarRevistaVO revistaNew) throws SQLException, ClassNotFoundException
    {
        Connection con = c.conectar();
        String sql = "UPDATE exemplarrevista SET exemplar = "+ revistaNew.getNumExemplar() +" WHERE titulo = '"+ revista.getTitulo() +"', exemplar = "+ revista.getNumExemplar();
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public int emprestarExemplarRevista(ExemplarRevistaVO revista) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "UPDATE exemplarrevista SET disponivel = false WHERE titulo = '"+ revista.getTitulo() +"' and exemplar = "+ revista.getNumExemplar();
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public int devolverExemplarRevista(ExemplarRevistaVO revista) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "UPDATE exemplarrevista SET disponivel = true WHERE titulo = '"+ revista.getTitulo() +"' and exemplar = "+ revista.getNumExemplar();
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public ArrayList<ExemplarRevistaVO> buscarExemplaresRevista(RevistaVO revista) throws ClassNotFoundException, SQLException
    {
        ArrayList<ExemplarRevistaVO> exemplares = new ArrayList();
        Connection con = c.conectar();
        String sql = "SELECT exemplar, disponivel FROM exemplarrevista WHERE titulo = '"+ revista.getTitulo() +"'";
        
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            exemplares.add(new ExemplarRevistaVO(res.getInt("exemplar"), res.getBoolean("disponivel"), revista.getTitulo()));
        }
        
        c.desconectar();
        return exemplares;
    }

    public int buscarNumExemplar(int numEx) throws SQLException, ClassNotFoundException {
        int rs=0;
        Connection con = c.conectar();
        String sql = "SELECT exemplar FROM exemplarrevista WHERE exemplar = "+ numEx;
        
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

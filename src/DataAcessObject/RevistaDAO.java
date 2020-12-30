package DataAcessObject;

import ValueObject.EmprestimoGenericoVO;
import ValueObject.LivroVO;
import ValueObject.RevistaVO;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class RevistaDAO
{
    Conexao c;
    
    public RevistaDAO()
    {
        c = new Conexao();
    }

    public Conexao getConexao() 
    {
        return c;
    }
    
    public int cadastrarRevista(RevistaVO revista) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "INSERT INTO revista(titulo, dataedicao) VALUES ('"+ revista.getTitulo()+ "', '"+ java.sql.Date.valueOf(revista.getDataEdicao()) +"')";
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public int deletarRevista(RevistaVO revista) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "DELETE FROM revista WHERE titulo = '"+ revista.getTitulo() +"'";
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
   }
    
    public int atualizarRevista(RevistaVO revista, RevistaVO revistaNew) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "UPDATE revista SET titulo = '"+ revistaNew.getTitulo() +"', dataedicao = '"+ java.sql.Date.valueOf(revistaNew.getDataEdicao()) +"' WHERE titulo = '"+ revista.getTitulo() +"'";
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public ArrayList<RevistaVO> buscarRevistas() throws ClassNotFoundException, SQLException
    {
        ArrayList<RevistaVO> revistas = new ArrayList();
        Connection con = c.conectar();
        String sql = "SELECT titulo, dataedicao FROM revista";
        
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            revistas.add(new RevistaVO(res.getString("titulo"), LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(res.getDate("dataedicao")))));
        }
        
        c.desconectar();
        return revistas;
    }
    
    public void buscarRevista(RevistaVO revista) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "SELECT dataedicao FROM revista WHERE titulo = '"+ revista.getTitulo() +"'";
        
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            revista.setDataEdicao(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(res.getDate("dataedicao"))));
        }
        
        c.desconectar();
    }
    
    public int buscarQuantExemplaresDisponiveis(RevistaVO revista) throws SQLException, ClassNotFoundException
    {
        Connection con = c.conectar();
        String sql = "SELECT COUNT(*) FROM exemplarrevista WHERE titulo = '"+ revista.getTitulo() +"' AND disponivel = true";
        
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
    
    public void removerExemplares(RevistaVO revista) throws ClassNotFoundException, SQLException
    {
        Connection con = c.conectar();
        String sql = "DELETE FROM exemplarrevista WHERE titulo = '"+ revista.getTitulo() +"'";
        
        Statement sessao = con.createStatement();
        sessao.executeUpdate(sql);
        
        c.desconectar();
    }

    public void removerExemplaresDisponiveis(RevistaVO revista) throws ClassNotFoundException, SQLException 
    {

        Connection con = c.conectar();
        String sql = "DELETE FROM exemplarrevista WHERE titulo = '"+ revista.getTitulo() +"' AND disponivel = true";
        
        Statement sessao = con.createStatement();
        sessao.executeUpdate(sql);
        
        c.desconectar();
    
    }
    
    public ArrayList<EmprestimoGenericoVO> buscarExemplares(String titulo) throws ClassNotFoundException, SQLException {
        
        ArrayList<EmprestimoGenericoVO> exemplares = new ArrayList<>();
        EmprestimoGenericoVO exemplar;
        String sql = "select exemplar from exemplarRevista where titulo = '" + titulo + "'";
        
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

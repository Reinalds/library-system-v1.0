/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAcessObject;

import ValueObject.EmprestimoGenericoVO;
import ValueObject.EmprestimoLivroVO;
import ValueObject.EmprestimoRevistaVO;
import ValueObject.EmprestimoVO;
import ValueObject.ExemplarLivroVO;
import ValueObject.ExemplarRevistaVO;
import ValueObject.LivroVO;
import ValueObject.MultaVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class EmprestimoDAO {
    
    private Conexao conexao;

    public EmprestimoDAO() {
        
        conexao = new Conexao();
    }
    
    
    
    public Conexao getConexao() 
    {
        return conexao;
    }
    
    public ArrayList<EmprestimoGenericoVO> consultarEmprestimosLivro() throws ClassNotFoundException, SQLException {
        conexao = new Conexao();
        String sql = "select * from emprestimoLivro";
        
        ArrayList<EmprestimoGenericoVO> meusEmprestimos = new ArrayList<>();
        EmprestimoGenericoVO emprestimo;
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next()) {
        
            emprestimo = new EmprestimoGenericoVO(res.getString("titulo"), res.getInt("exemplar"), res.getDate("dataEmprestimo"));
            meusEmprestimos.add(emprestimo);
            
        }
        
        conexao.desconectar();
        return meusEmprestimos;
   
    }
    
    public ArrayList<EmprestimoGenericoVO> consultarEmprestimosRevista() throws ClassNotFoundException, SQLException {
        conexao = new Conexao();
        String sql = "select * from emprestimoRevista";
        
        ArrayList<EmprestimoGenericoVO> meusEmprestimos = new ArrayList<>();
        EmprestimoGenericoVO emprestimo;
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next()) {
        
            emprestimo = new EmprestimoGenericoVO(res.getString("titulo"), res.getInt("exemplar"), res.getDate("dataEmprestimo"));
            meusEmprestimos.add(emprestimo);
            
        }
        
        conexao.desconectar();
        return meusEmprestimos;
   
    }
    
    public int emprestarLivro(EmprestimoLivroVO emprestimoLivroVO) throws SQLException, ClassNotFoundException {
        
        
        String sql = "insert into emprestimoLivro(idAssociado, titulo, exemplar, dataEmprestimo) values("
                + "" + emprestimoLivroVO.getAssociado().getIdAssociado() + ", '" + emprestimoLivroVO.getExemplarLivro().getTitulo()
                + "', " + emprestimoLivroVO.getExemplarLivro().getNumExemplar() + ", '" + new SimpleDateFormat("yyyy-MM-dd").format(emprestimoLivroVO.getDataEmprestimo()) + "')";
        
        conexao = new Conexao();
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return res;
        
    }
    
    public int emprestarRevista(EmprestimoRevistaVO emprestimoRevistaVO) throws SQLException, ClassNotFoundException {
        
        
        String sql = "insert into emprestimoRevista(idAssociado, titulo, exemplar, dataEmprestimo) values("
                + "" + emprestimoRevistaVO.getAssociado().getIdAssociado() + ", '" + emprestimoRevistaVO.getExemplarRevista().getTitulo()
                + "', " + emprestimoRevistaVO.getExemplarRevista().getNumExemplar() + ", '" + new SimpleDateFormat("yyyy-MM-dd").format(emprestimoRevistaVO.getDataEmprestimo()) + "')";
        
        conexao = new Conexao();
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return res;
    }
    
    public int devolverLivro(ExemplarLivroVO exemplarLivro) throws ClassNotFoundException, SQLException {
        
        String sql = "delete from emprestimoLivro where titulo = '" + exemplarLivro.getTitulo() + "' and exemplar = " +
                exemplarLivro.getNumExemplar();
        
        
        conexao = new Conexao();
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return res;
        
    }
    
    public int devolverRevista(ExemplarRevistaVO exemplarRevista) throws ClassNotFoundException, SQLException {
        
        String sql = "delete from emprestimoRevista where titulo = '" + exemplarRevista.getTitulo() + "' and exemplar = " +
                exemplarRevista.getNumExemplar();
        
        
        conexao = new Conexao();
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return res;
        
    }
    
    public boolean verificarMulta(ExemplarLivroVO livro) throws ClassNotFoundException, SQLException {
        conexao = new Conexao();
        String sql = "select dataEmprestimo from emprestimoLivro where titulo = '" + livro.getTitulo() + "' and exemplar = " +
                livro.getNumExemplar();
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date date1 = new Date();
        dateFormat.format(date1);
        Date date2=null;
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        while(res.next())
        {
            date2 = res.getDate("dataEmprestimo");
        }
        
        dateFormat.format(date2);
        conexao.desconectar();
               
        return date1.getDay() - date2.getDay() > 10 || (date1.getMonth() > date2.getMonth() && ((30 - date2.getDay()) + date1.getDay()) > 10);
        
    }
    
    public boolean verificarMulta(ExemplarRevistaVO revista) throws ClassNotFoundException, SQLException {
        conexao = new Conexao();
        String sql = "select dataEmprestimo from emprestimoRevista where titulo = '" + revista.getTitulo() + "' and exemplar = " +
                revista.getNumExemplar();
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date date1 = new Date();
        dateFormat.format(date1);
        
        Date date2=null;
        while(res.next())
        {
            date2 = res.getDate("dataEmprestimo");
        }
        dateFormat.format(date2);
        conexao.desconectar();
               
        return date1.getDay() - date2.getDay() > 10 || (date1.getMonth() > date2.getMonth() && ((30 - date2.getDay()) + date1.getDay()) > 10);
        
    }
    
    public int inserirMulta(ExemplarLivroVO livro, int idAssociado) throws ClassNotFoundException, SQLException {
        conexao = new Conexao();
        String sql = "insert into multaLivro(idAssociado, titulo, exemplar, estado) values (" + idAssociado + ", '" + 
                livro.getTitulo() + "', " + livro.getNumExemplar() + ", 'pendente')";
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        
        int res = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return res;
    
    }
    
    public int inserirMulta(ExemplarRevistaVO revista, int idAssociado) throws ClassNotFoundException, SQLException {
        conexao = new Conexao();
        String sql = "insert into multaRevista(idAssociado, titulo, exemplar, estado) values (" + idAssociado + ", '" + 
                revista.getTitulo() + "', " + revista.getNumExemplar() + ", 'pendente')";
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        
        int res = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return res;
    
    }
    
    public ArrayList<MultaVO> consultarMultas(int idssociado) throws ClassNotFoundException, SQLException {
        conexao = new Conexao();
        String sql = "select * from multaLivro where idAssociado = " + idssociado +
                "union select * from multaRevista where idAssociado = " + idssociado;
        
        MultaVO multa;
        ArrayList<MultaVO> multas = new ArrayList<>();
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        
        ResultSet res = sessao.executeQuery(sql);

        while(res.next()) {
            
            multa = new MultaVO(res.getInt("idMulta"), res.getString("titulo"), res.getInt("exemplar"), res.getString("estado"));
            multas.add(multa);
            
        }
    
        conexao.desconectar();
        return multas;
        
    }
    
    public ArrayList<MultaVO> consultarMultasLivro(int idssociado) throws ClassNotFoundException, SQLException {
        conexao = new Conexao();
        String sql = "select * from multaLivro where idAssociado = " + idssociado;
        
        MultaVO multa;
        ArrayList<MultaVO> multas = new ArrayList<>();
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        
        ResultSet res = sessao.executeQuery(sql);

        while(res.next()) {
            
            multa = new MultaVO(res.getInt("idMulta"), res.getString("titulo"), res.getInt("exemplar"), res.getString("estado"));
            multas.add(multa);
            
        }
    
        conexao.desconectar();
        return multas;
        
    }
    
    public ArrayList<MultaVO> consultarMultasRevista(int idssociado) throws ClassNotFoundException, SQLException {
        conexao = new Conexao();
        String sql = "select * from multaRevista where idAssociado = " + idssociado;
        
        MultaVO multa;
        ArrayList<MultaVO> multas = new ArrayList<>();
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        
        ResultSet res = sessao.executeQuery(sql);

        while(res.next()) {
            
            multa = new MultaVO(res.getInt("idMulta"), res.getString("titulo"), res.getInt("exemplar"), res.getString("estado"));
            multas.add(multa);
            
        }
    
        conexao.desconectar();
        return multas;
        
    }
    
    
    public int pagarMultaLivro(int idMulta) throws ClassNotFoundException, SQLException {
        conexao = new Conexao();
        String sql = "update multaLivro set estado = 'pago' where idMulta = " + idMulta;
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        
        int res = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return res;
        
    }
    
    public int pagarMultaRevista(int idMulta) throws ClassNotFoundException, SQLException {
        conexao = new Conexao();
        String sql = "update multaRevista set estado = 'pago' where idMulta = " + idMulta;
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        
        int res = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return res;
        
    }
    
    public int selecionarAssociadoMultaLivro(ExemplarLivroVO livroVO) throws ClassNotFoundException, SQLException {
        
        int id=-1;
        
        conexao = new Conexao();
        String sql = "select idAssociado from emprestimoLivro where titulo = '" + livroVO.getTitulo() + "' and exemplar = " +
                livroVO.getNumExemplar();
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        
        ResultSet res = sessao.executeQuery(sql);
        while(res.next())
        {
            id = res.getInt("idAssociado");
        }
        
        
        conexao.desconectar();
        return id;
    
    }
    
    public int selecionarAssociadoMultaRevista(ExemplarRevistaVO revistaVO) throws ClassNotFoundException, SQLException {
        
        int id=-1;
        
        conexao = new Conexao();
        String sql = "select idAssociado from emprestimoRevista where titulo = '" + revistaVO.getTitulo() + "' and exemplar = " +
                revistaVO.getNumExemplar();
        
        Connection con = conexao.conectar();
        Statement sessao = con.createStatement();
        
        ResultSet res = sessao.executeQuery(sql);
        while(res.next())
        {
            id = res.getInt("idAssociado");
        }
        
        
        conexao.desconectar();
        return id;
    
    }
    
}

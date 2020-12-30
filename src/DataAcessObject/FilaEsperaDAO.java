package DataAcessObject;

import ValueObject.AssociadoVO;
import ValueObject.FilaEsperaVO;
import ValueObject.LivroVO;
import ValueObject.RevistaVO;
import java.sql.*;
import java.util.ArrayList;

public class FilaEsperaDAO
{
    private Conexao c;
    
    public FilaEsperaDAO() {
        
        c = new Conexao();

    }
    
    public Conexao getConexao() 
    {
        return c;
    }
    
    public ArrayList<FilaEsperaVO> buscarFilaEspera(LivroVO livro) throws ClassNotFoundException, SQLException
    {
        ArrayList<FilaEsperaVO> filaEspera = new ArrayList<>();
        
        c = new Conexao();
        Connection con = c.conectar();
        String sql = "SELECT associado.nome, associado.idAssociado FROM associado NATURAL JOIN filaesperalivro WHERE titulo = '"+ livro.getTitulo() +"' ORDER BY posicao";
        
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            FilaEsperaVO item = new FilaEsperaVO();
            item.setIdAssociado(res.getInt("idAssociado"));
            item.setNomeAssociado(res.getString("nome"));
            item.setTitulo(livro.getTitulo());
            filaEspera.add(item);
        }
        
        c.desconectar();
        
        return filaEspera;
    }
    
    public ArrayList<FilaEsperaVO> buscarFilaEspera(RevistaVO revista) throws SQLException, ClassNotFoundException
    {
        
        ArrayList<FilaEsperaVO> filaEspera = new ArrayList<>();
        
        c = new Conexao();
        Connection con = c.conectar();
        String sql = "SELECT associado.nome, associado.idAssociado FROM associado NATURAL JOIN filaesperarevista WHERE titulo = '"+ revista.getTitulo() +"' ORDER BY posicao";
        
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            FilaEsperaVO item = new FilaEsperaVO();
            item.setIdAssociado(res.getInt("idAssociado"));
            item.setNomeAssociado(res.getString("nome"));
            item.setTitulo(revista.getTitulo());
            filaEspera.add(item);
        }
        
        c.desconectar();
       
        return filaEspera;
    }
    
    
    public ArrayList<Integer> ordemFilaEspera(LivroVO livro) throws SQLException, ClassNotFoundException {
        
        c = new Conexao();
        ArrayList<Integer> ordemDaFila = new ArrayList<>();
        String sql = "select idassociado from filaesperalivro where filaesperalivro.titulo = '" + livro.getTitulo() + "' order by posicao";
        
        Connection con = c.conectar();
        Statement sessao = con.createStatement();
        
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next()) {
            
            ordemDaFila.add(res.getInt("idassociado"));
            
        }
        
        c.desconectar();
        return ordemDaFila;
        
    }
    
    public ArrayList<Integer> ordemFilaEspera(RevistaVO revista) throws SQLException, ClassNotFoundException {
        
        c = new Conexao();
        ArrayList<Integer> ordemDaFila = new ArrayList<>();
        String sql = "select idassociado from filaesperarevista where filaesperarevista.titulo = '" + revista.getTitulo() + "' order by posicao";
        
        Connection con = c.conectar();
        Statement sessao = con.createStatement();
        
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next()) {
            
            ordemDaFila.add(res.getInt("idassociado"));
            
        }
        
        c.desconectar();
        return ordemDaFila;
        
        
    }
    
    public ArrayList<Integer> ordemFilaEsperaPosicao(LivroVO livro) throws SQLException, ClassNotFoundException {
        
        c = new Conexao();
        ArrayList<Integer> ordemDaFila = new ArrayList<>();
        String sql = "select posicao from filaesperalivro where filaesperalivro.titulo = '" + livro.getTitulo() + "' order by posicao";
        
        Connection con = c.conectar();
        Statement sessao = con.createStatement();
        
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next()) {
            
            ordemDaFila.add(res.getInt("posicao"));
            
        }
        
        c.desconectar();
        return ordemDaFila;
        
    }
    
    public ArrayList<Integer> ordemFilaEsperaPosicao(RevistaVO revista) throws SQLException, ClassNotFoundException {
        
        c = new Conexao();
        ArrayList<Integer> ordemDaFila = new ArrayList<>();
        String sql = "select posicao from filaesperarevista where filaesperarevista.titulo = '" + revista.getTitulo() + "' order by posicao";
        
        Connection con = c.conectar();
        Statement sessao = con.createStatement();
        
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next()) {
            
            ordemDaFila.add(res.getInt("posicao"));
            
        }
        
        c.desconectar();
        return ordemDaFila;
        
        
    }
    
    public int adicionarListaEsperaLivro(AssociadoVO associado, LivroVO livro) throws ClassNotFoundException, SQLException {
        
        FilaEsperaVO filaEsperaVO = new FilaEsperaVO(associado.getIdAssociado(), livro.getTitulo());
        
        String sql = "insert into filaEsperaLivro(idAssociado, titulo) values(" + associado.getIdAssociado() +
                ", '" + livro.getTitulo() + "')";
        
        c = new Conexao();
        Connection con = c.conectar();
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
        
    }
    
    public int adicionarListaEsperaRevista(AssociadoVO associado, RevistaVO revista) throws ClassNotFoundException, SQLException {
        
        FilaEsperaVO filaEsperaVO = new FilaEsperaVO(associado.getIdAssociado(), revista.getTitulo());
        
        String sql = "insert into filaEsperaRevista(idAssociado, titulo) values(" + associado.getIdAssociado() +
                ", '" + revista.getTitulo() + "')";
        
        c = new Conexao();
        Connection con = c.conectar();
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
        
    }
    
    public int removerPrimeiroFilaEsperaLivro(int posicao) throws ClassNotFoundException, SQLException
    {
        
        
        String sql = "delete from filaEsperaLivro where posicao = " + posicao;
        
        c = new Conexao();
        Connection con = c.conectar();
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
        
    }
    
    
    public int removerPrimeiroFilaEsperaRevista(int posicao) throws ClassNotFoundException, SQLException
    {
        
        
        String sql = "delete from filaEsperaRevista where posicao = " + posicao;
        
        c = new Conexao();
        Connection con = c.conectar();
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
        
    }
}

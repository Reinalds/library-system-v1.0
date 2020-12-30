package DataAcessObject;

import ValueObject.AssociadoVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AssociadoDAO
{
    
    
    Conexao c;
    
    public AssociadoDAO()
    {
        c = new Conexao();
    }
    
    public Conexao getConexao() 
    {
        return c;
    }
    
    public int efetuarLogin(AssociadoVO associado) throws ClassNotFoundException, SQLException
    {
        
        c = new Conexao();
        int resultado = 0;
        Connection con = c.conectar();
        String sql = "SELECT idassociado, nome, telefone, email FROM associado WHERE login = '"+ associado.getLogin() +"' AND senha = '"+ associado.getSenha() +"'";
        
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            resultado++;
            associado.setIdAssociado(res.getInt("idassociado"));
            associado.setNome(res.getString("nome"));
            associado.setTelefone(res.getString("telefone"));
            associado.setEmail(res.getString("email"));
        }
        
        c.desconectar();
        return resultado;
    }
    
    public int inserirAssociado(AssociadoVO associado) throws ClassNotFoundException, SQLException
    {
        c = new Conexao();
        Connection con = c.conectar();
        String sql = "INSERT INTO associado(nome, telefone, email, login, senha) VALUES ('"+ associado.getNome() +"', '"+ associado.getTelefone() +"', '"+ associado.getEmail() +"', '"+ associado.getLogin() +"', '"+ associado.getSenha() +"')";
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }

    public int verificarAssociadoCadastrado(AssociadoVO associado) throws ClassNotFoundException, SQLException
    {
        c = new Conexao();
        Connection con = c.conectar();
        String sql = "SELECT idassociado FROM associado WHERE login = '"+ associado.getLogin() +"'";
        
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        int resultado = 0;
        while(res.next())
        {
            resultado++;
        }
        
        c.desconectar();
        return resultado;
    }
    
    public int deletarAssociado(AssociadoVO associado) throws ClassNotFoundException, SQLException
    {
        
        c = new Conexao();
        Connection con = c.conectar();
        String sql = "DELETE FROM associado WHERE idassociado = '"+ associado.getIdAssociado() +"'";
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public int atualizarAssociado(AssociadoVO associado, AssociadoVO associadoNew) throws ClassNotFoundException, SQLException
    {
        
        c = new Conexao();
        Connection con = c.conectar();
        String sql = "UPDATE associado SET nome = '"+ associadoNew.getNome() +"', telefone = '"+ associadoNew.getTelefone() +"', email = '"+ associadoNew.getEmail() +"', login = '"+ associadoNew.getLogin() +"', senha = '"+ associadoNew.getSenha() +"'";
        
        Statement sessao = con.createStatement();
        int res = sessao.executeUpdate(sql);
        
        c.desconectar();
        return res;
    }
    
    public void buscarAssociado(AssociadoVO associado) throws ClassNotFoundException, SQLException
    {
        
        c = new Conexao();
        Connection con = c.conectar();
        String sql = "SELECT nome, telefone, email, login, senha FROM associado WHERE idassociado = "+ associado.getIdAssociado();
        
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            associado.setNome(res.getString("nome"));
            associado.setTelefone(res.getString("telefone"));
            associado.setEmail(res.getString("email"));
            associado.setLogin(res.getString("login"));
            associado.setSenha(res.getString("senha"));
        }
        
        c.desconectar();
    }
    
    public ArrayList<String> buscarAssociados() throws ClassNotFoundException, SQLException {
    
        
        c = new Conexao();
        ArrayList<String> associados = new ArrayList<>();
        String nomeAssociado;
        
        Connection con = c.conectar();
        String sql = "SELECT nome FROM associado";
    
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            
            associados.add(res.getString("nome"));
            
        }
        
        c.desconectar();
        return associados;
        
    }
    
    public int buscarIdAssociado(String nome) throws ClassNotFoundException, SQLException {
    
        
        c = new Conexao();
        String sql = "select idAssociado from associado where nome = '" + nome +"'";
        
        Connection con = c.conectar();
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        int id=-1;
        
        while(res.next()) {
	 
	  id = res.getInt("idAssociado");
        
        }
        
        c.desconectar();
        return id;
    
    }
    
}

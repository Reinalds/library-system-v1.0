package DataAcessObject;

import ValueObject.EditoraVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EditoraDAO
{
    private Conexao conexao;
    
    public EditoraDAO() {
        
        conexao = new Conexao();
    
    }
    
    public Conexao getConexao() 
    {
        return conexao;
    }
    
    public int inserirEditora(EditoraVO editora) throws ClassNotFoundException, SQLException
    {
        conexao = new Conexao();
        Connection con = conexao.conectar();
        
        String sql = "INSERT INTO editora(nomeeditora) values ('"+editora.getNome()+"')";
        Statement sessao = con.createStatement();
        int resultado = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return resultado;
    }
    
    public int deletarEditora(EditoraVO editora) throws ClassNotFoundException, SQLException
    {
        conexao = new Conexao();
        Connection con = conexao.conectar();
        
        String sql = "DELETE FROM editora WHERE nomeeditora = '"+editora.getNome()+"'";
        Statement sessao = con.createStatement();
        int resultado = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return resultado;
    }
    
    public int atualizarEditora(EditoraVO editora, EditoraVO editoraNew) throws ClassNotFoundException, SQLException
    {
        conexao = new Conexao();
        Connection con = conexao.conectar();
        
        String sql = "UPDATE editora SET nomeeditora = '"+editoraNew.getNome()+"' WHERE nomeeditora = '"+editora.getNome()+"'";
        Statement sessao = con.createStatement();
        int resultado = sessao.executeUpdate(sql);
        
        conexao.desconectar();
        return resultado;
    }
    
    public ArrayList<EditoraVO> buscarEditoras() throws ClassNotFoundException, SQLException
    {
        ArrayList<EditoraVO> editora = new ArrayList();
        conexao = new Conexao();
        Connection con = conexao.conectar();
        
        String sql = "SELECT nomeeditora FROM editora";
        Statement sessao = con.createStatement();
        ResultSet res = sessao.executeQuery(sql);
        
        while(res.next())
        {
            editora.add(new EditoraVO(res.getString("nomeeditora")));
        }
        
        conexao.desconectar();
        return editora;
    }

    
    
    
}

package DataAcessObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao
{
    private String driverpath, url, password, user;
    private Connection con;
    
    public Conexao()
    {
        driverpath = "org.postgresql.Driver";
        url = "jdbc:postgresql://localhost:5432/biblioteca";
        user = "postgres";
        password = "root";
    }
    
    public Connection conectar() throws ClassNotFoundException, SQLException
    {
        con = null;
        
        Class.forName(driverpath);
        con = DriverManager.getConnection(url, user, password);
        
        return con;
    }
    
    public void desconectar()
    {
        
    }

}

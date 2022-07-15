
package demodbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
    static Connection con;
    
    public static Connection createCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url="jdbc:mysql://localhost:3306/demo?useSSL=true";
            String user="Rutuja";
            String pass = "Rutu@123";
            
            con = DriverManager.getConnection(url,user,pass);
        }
        catch(Exception e)
        {
            System.out.println("Database is not Connected...!");
        }
        return con;
    }
    
}

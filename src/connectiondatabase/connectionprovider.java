
package connectiondatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;



public class connectionprovider {
    
    public static Connection getCon()
    {   
        Connection con;
        Statement st;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare", "root","arefin");
            st = con.createStatement();

        }catch(Exception e)
        {
            //System.exit(102);
            e.printStackTrace();
        }
        return null;
    }
    
    public static void main(String[] args) {
        
    }
}

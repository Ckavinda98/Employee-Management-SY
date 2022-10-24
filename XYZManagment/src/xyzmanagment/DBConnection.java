/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyzmanagment;
import java.sql.*;
/**
 *
 * @author mical
 */
public class DBConnection {
    public Connection GetConnection()
    {
        Connection con=null;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con=DriverManager.getConnection("jdbc:odbc:HNDJavaDB","","");
        }catch(Exception ex)
        {
        System.out.println("Error connecting to Database"+ ex);
        }
        return con;
    }
    
}

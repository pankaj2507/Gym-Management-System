/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author yadav
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "Pankaj@2003");
            return con;
        } 
        catch (Exception e) {
            // Print stack trace to understand the problem
            e.printStackTrace();
            return null;
        }
    }
}

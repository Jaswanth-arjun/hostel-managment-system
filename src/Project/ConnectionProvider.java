package Project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;

/**
 *
 * @author Windows 10
 */
public class ConnectionProvider {
    public static Connection getCon()
            
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","202122");
            return con;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}


class TestConnection {
    public static void main(String[] args) {
        // Get the database connection from the ConnectionProvider
        Connection con = ConnectionProvider.getCon();
        
        // Check if the connection is successful
        if (con != null) {
            System.out.println("Connection to the database was successful!");
        } else {
            System.out.println("Connection to the database failed.");
        }
    }
}

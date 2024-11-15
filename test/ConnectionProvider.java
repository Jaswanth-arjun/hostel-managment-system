/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author Windows 10
 */
public class ConnectionProvider {
    public static void main(String[] args) {
        // Define the database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/hostel"; // Update with your DB URL
        String username = "root"; // Update with your DB username
        String password = "202122"; // Update with your DB password

        // Declare the Connection object
        Connection con = null;

        try {
            // Initialize the Connection object
            con = DriverManager.getConnection(url, username, password);
            
            // Check if the connection is established
            if (con != null) {
                System.out.println("Connection established successfully!");

                // Prepare the SQL statement
                String sql = "SELECT * FROM table"; // Your SQL query
                PreparedStatement stmt = con.prepareStatement(sql);

                // Execute the query
                ResultSet rs = stmt.executeQuery();
                
                // Process the result set
                while (rs.next()) {
                    System.out.println("Data: " + rs.getString("column_name")); // Replace with actual column names
                }
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Ensure the connection is closed properly
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

   /* public static Connection getCon()
            
    {
        Connection con=null;
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
}*/

package com.mycompany.aels;
import java.sql.*;
import javax.swing.JOptionPane;
public class Dbc {
    Connection conn;
    public static Connection connectDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ales","root","");
            System.out.println("Database Connection is successful!");
            return conn;
        }catch(Exception e ){
          JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    public static void main(String[] args) {
        connectDB();
    }
    
}

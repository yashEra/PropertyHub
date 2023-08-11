/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.*;

/**
 *
 * @author shach
 */
public class DBConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/propertyhub";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    
    public static Connection getConnection() throws Exception{
        Class.forName(DRIVER);
        Connection con = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
        return con;
    }
    
}

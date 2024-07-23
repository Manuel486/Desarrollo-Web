package org.mchunga.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {
    public static String url = "jdbc:mysql://localhost:3306/proyectomantenedorusuariosjdbc?serverTimezone=UTC";
    public static String username = "root";
    public static String password = "root";

    public static Connection cnn;

    public static Connection getInstance() throws SQLException {
        if( cnn == null){
            cnn = DriverManager.getConnection(url,username,password);
        }
        return cnn;
    }
}

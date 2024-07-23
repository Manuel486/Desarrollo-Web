package org.mchunga.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
    Driver -> Permite conectarse a una base de datos: cada gestor de base de datos requiere un driver
            distinto
    DriverManager -> Permite gestionar todos los drivers instalados en el sistema
    Connection ->  Representa una conexión con una base de datos. Una aplicación puede tener más de una
                    conexión a más de una base de datos
    Statement -> Permite ejecutar sentencias SQL sin parámetros
    PreparedStatement -> Permite ejecutar sentencias SQL con parámetros de entrada
    ResultSet -> Contiene las filas o registros obtenidos al ejecutar una sentencia SELECT
*/

public class ConexionBaseDatos {

    private static String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=UTC";
    private static String username = "root";
    private static String password = "root";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if (connection == null){
            connection = DriverManager.getConnection(url,username,password);
        }
        return connection;
    }
}

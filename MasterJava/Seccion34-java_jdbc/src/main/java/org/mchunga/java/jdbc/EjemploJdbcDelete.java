package org.mchunga.java.jdbc;

import org.mchunga.java.jdbc.modelo.Producto;
import org.mchunga.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.mchunga.java.jdbc.repositorio.Repositorio;
import org.mchunga.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcDelete {


    public static void main(String[] args) {

        // Autoclose -> cerramos cualquier sea el caso
        /*try(
            Connection conn = ConexionBaseDatos.getInstance();
            Statement stmt  = conn.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM productos");
            ) {
            while (resultado.next()){
                System.out.print(resultado.getString("id"));
                System.out.print(" ");
                System.out.print(resultado.getString("nombre"));
                System.out.print(" ");
                System.out.print(resultado.getString("precio"));
                System.out.print(" ");
                System.out.println(resultado.getString("fecha_registro"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }*/

        try(
                Connection conn = ConexionBaseDatos.getInstance();
        ) {
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("================ listar ===============");
            repositorio.listar().forEach(System.out::println);

            System.out.println("================ obtener por id ===============");
            System.out.println(repositorio.porId(1L));

            System.out.println("================ eliminar producto ===============");
            repositorio.eliminar(3L);
            System.out.println("Producto eliminado con exito");

            System.out.println("================ listar ===============");
            repositorio.listar().forEach(System.out::println);



        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

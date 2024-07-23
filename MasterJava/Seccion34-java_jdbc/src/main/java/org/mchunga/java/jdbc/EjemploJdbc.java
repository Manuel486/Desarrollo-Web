package org.mchunga.java.jdbc;

import org.mchunga.java.jdbc.modelo.Categoria;
import org.mchunga.java.jdbc.modelo.Producto;
import org.mchunga.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.mchunga.java.jdbc.repositorio.Repositorio;
import org.mchunga.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {


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

            System.out.println("================ insertar nuevo producto ===============");
            Producto producto = new Producto();
            producto.setNombre("Teclado Razer mecánico");
            producto.setPrecio(550);
            producto.setFecha_registro(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(3L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto guardado con exito");

            System.out.println("================ listar ===============");
            repositorio.listar().forEach(System.out::println);



        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

package org.mchunga.java.jdbc;

import org.mchunga.java.jdbc.modelo.Usuario;
import org.mchunga.java.jdbc.repositorio.UsuarioRepositorioImpl;
import org.mchunga.java.jdbc.util.ConexionBaseDatos;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int opcionIndice = 0;
        Map<String, Integer> operaciones = new HashMap();
        operaciones.put("Actualizar", 1);
        operaciones.put("Eliminar", 2);
        operaciones.put("Agregar", 3);
        operaciones.put("Listar", 4);
        operaciones.put("Salir", 5);

        Object[] opArreglo = operaciones.keySet().toArray();

        Object opcion = JOptionPane.showInputDialog(null,
                "Seleccione un Operación",
                "Mantenedor de Usuarios",
                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

        if (opcion == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
        } else {
            opcionIndice = operaciones.get(opcion.toString());

            switch (opcionIndice){
                case 4:
                    List<Usuario> usuarios = listarUsuarios();
                    StringBuilder mensaje = new StringBuilder("Lista de Usuarios:\n");
                    for (Usuario usuario : usuarios) {
                        mensaje.append(usuario.toString());
                    }
                    JOptionPane.showMessageDialog(null, mensaje.toString());
                    break;
            }
        }
    }

    public static List<Usuario> listarUsuarios(){
        try(Connection cnn = ConexionBaseDatos.getInstance()){
            UsuarioRepositorioImpl usuarioRepositorio = new UsuarioRepositorioImpl();
            return usuarioRepositorio.listar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
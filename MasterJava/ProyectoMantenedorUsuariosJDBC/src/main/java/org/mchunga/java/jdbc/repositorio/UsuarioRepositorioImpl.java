package org.mchunga.java.jdbc.repositorio;

import org.mchunga.java.jdbc.modelo.Usuario;
import org.mchunga.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorioImpl implements Repositorio<Usuario>{

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<>();

        try(Statement stmt = getConnection().createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM usuarios");
        ) {
            while (resultSet.next()){
                Usuario usuario = crearUsuario(resultSet);
                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    @Override
    public Usuario buscarId(Long id) {
        Usuario usuario = null;

        try(PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM usuarios WHERE id=?")){
            stmt.setLong(1,id);
            try(ResultSet resultSet = stmt.executeQuery()){
                usuario = crearUsuario(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
    }

    @Override
    public void guardar(Usuario usuario) {

    }

    @Override
    public void eliminar(Long id) {

    }

    private static Usuario  crearUsuario(ResultSet resultSet) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setId(resultSet.getLong(1));
        usuario.setUsername(resultSet.getString(2));
        usuario.setPassword(resultSet.getString(3));
        usuario.setEmail(resultSet.getString(4));
        return usuario;
    }
}

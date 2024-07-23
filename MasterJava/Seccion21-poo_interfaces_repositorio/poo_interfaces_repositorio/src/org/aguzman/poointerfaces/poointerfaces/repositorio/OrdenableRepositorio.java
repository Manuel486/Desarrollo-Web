package org.aguzman.poointerfaces.poointerfaces.repositorio;

import org.aguzman.poointerfaces.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);

}

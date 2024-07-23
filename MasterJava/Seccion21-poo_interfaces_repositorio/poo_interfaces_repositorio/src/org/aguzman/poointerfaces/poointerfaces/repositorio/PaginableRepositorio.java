package org.aguzman.poointerfaces.poointerfaces.repositorio;

import org.aguzman.poointerfaces.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}

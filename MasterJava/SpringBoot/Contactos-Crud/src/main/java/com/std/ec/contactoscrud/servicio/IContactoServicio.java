package com.std.ec.contactoscrud.servicio;

import com.std.ec.contactoscrud.models.Contacto;

import java.util.List;

public interface IContactoServicio {
    List<Contacto> listar();

    Contacto guardar(Contacto contacto);

    Contacto buscarPorId(Integer id);

    void eliminar(Contacto contacto);

    boolean existePorId(Integer id);
}

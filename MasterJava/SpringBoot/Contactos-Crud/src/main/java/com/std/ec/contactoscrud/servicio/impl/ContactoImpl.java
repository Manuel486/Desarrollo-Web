package com.std.ec.contactoscrud.servicio.impl;

import com.std.ec.contactoscrud.models.Contacto;
import com.std.ec.contactoscrud.repositorio.ContactoRepositorio;
import com.std.ec.contactoscrud.servicio.IContactoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoImpl implements IContactoServicio {

    @Autowired
    ContactoRepositorio contactoRepositorio;

    @Override
    public List<Contacto> listar() {
        return contactoRepositorio.findAll();
    }

    @Override
    public Contacto guardar(Contacto contacto) {
        return contactoRepositorio.save(contacto);
    }

    @Override
    public Contacto buscarPorId(Integer id) {
        return contactoRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Contacto contacto) {
        contactoRepositorio.delete(contacto);
    }

    @Override
    public boolean existePorId(Integer id) {
        return contactoRepositorio.existsById(id);
    }
}

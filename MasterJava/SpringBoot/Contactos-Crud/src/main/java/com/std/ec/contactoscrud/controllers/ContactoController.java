package com.std.ec.contactoscrud.controllers;

import com.std.ec.contactoscrud.models.Contacto;
import com.std.ec.contactoscrud.servicio.IContactoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.swing.*;
import java.util.List;

@Controller
public class ContactoController {

    @Autowired
    IContactoServicio contactoServicio;

    @GetMapping({"/",""})
    public String verPaginaDeInicio(Model modelo){
        List<Contacto> contactos = contactoServicio.listar();
        modelo.addAttribute("contactos",contactos);
        return "index";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioDeRegistrarContacto(Model modelo){
        modelo.addAttribute("contacto",new Contacto());
        return "nuevo";
    }

    // bindingResult -> obtiene todos los errores
    // cuidando con el oreden de los obejtos
    @PostMapping("/nuevo")
    public String guardarContacto(@Validated Contacto contacto,BindingResult bindingResult,RedirectAttributes redirect,Model modelo) {
        if(bindingResult.hasErrors()){
            modelo.addAttribute("contacto",contacto);
            return "nuevo";
        }

        contactoServicio.guardar(contacto);
        redirect.addFlashAttribute("msgExito","El contacto ha sido agregado con éxito");
        return "redirect:/"; // mandandolo al indice
    }

    @GetMapping("/{id}/editar")
    public String mostrarFormularioDeEditarContacto(@PathVariable Integer id, Model modelo){
        Contacto contacto = contactoServicio.buscarPorId(id);
        modelo.addAttribute("contacto",contacto);
        return "nuevo";
    }

    @PostMapping("/{id}/editar")
    public String actualizarContacto(@PathVariable Integer id,@Validated Contacto contacto,BindingResult bindingResult,RedirectAttributes redirect,Model modelo) {
        Contacto contactoDB = contactoServicio.buscarPorId(id);

        if(bindingResult.hasErrors()){
            modelo.addAttribute("contacto",contacto);
            return "nuevo";
        }

        contactoDB.setNombre(contacto.getNombre());
        contactoDB.setCelular(contacto.getCelular());
        contactoDB.setEmail(contacto.getEmail());
        contactoDB.setFechaNacimiento(contacto.getFechaNacimiento());


        contactoServicio.guardar(contactoDB);
        redirect.addFlashAttribute("msgExito","El contacto ha sido actualizado con éxito");
        return "redirect:/"; // mandandolo al indice
    }

    @PostMapping("/{id}/eliminar")
    public String eliminarContacto(@PathVariable Integer id,RedirectAttributes redirect) {
        Contacto contacto = contactoServicio.buscarPorId(id);
        contactoServicio.eliminar(contacto);
        redirect.addFlashAttribute("msgExito", "El contacto ha sido eliminado correctamente");
        return "redirect:/";
    }
}

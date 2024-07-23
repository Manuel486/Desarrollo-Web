package org.mchunga.app.hogar;

import org.mchunga.app.jardin.Perro;

import static org.mchunga.app.hogar.Persona.saludar;

public class EjemploHogar {

    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}

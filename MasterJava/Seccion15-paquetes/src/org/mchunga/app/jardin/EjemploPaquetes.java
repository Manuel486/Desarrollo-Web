package org.mchunga.app.jardin;

/*import org.mchunga.app.hogar.Gato;
import org.mchunga.app.hogar.Persona;*/

// Se guarda en memoria cuando utilicemos las clases
// revisar si realmente afecta el rendimiento
import org.mchunga.app.hogar.*;

import static org.mchunga.app.hogar.ColorPelo.*;
import static org.mchunga.app.hogar.Persona.*;


public class EjemploPaquetes {

    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Manuel");
        p.setApellido("Chunga");
        p.setColorPelo(CAFE);
        System.out.println("p.nombre = " + p.getNombre());
        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";
        
        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }
}

package org.mchunga.pooclasesabstractas.form;

import org.mchunga.pooclasesabstractas.form.elementos.ElementoForm;
import org.mchunga.pooclasesabstractas.form.elementos.InputForm;
import org.mchunga.pooclasesabstractas.form.elementos.SelectForm;
import org.mchunga.pooclasesabstractas.form.elementos.TextAreaForm;
import org.mchunga.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");
        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);
        SelectForm lenguaje = new SelectForm("lenguaje");

        lenguaje.addOpcion(new Opcion("1", "Java").setSelected())
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript"))
                .addOpcion(new Opcion("5", "PHP"));

        username.setValor("john.doe");
        password.setValor("a1b2c3");
        email.setValor("john.doe@correo.com");
        edad.setValor("28");
        experiencia.setValor("... más de 10 años de experiencia ...");

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje);

        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });


    }
}

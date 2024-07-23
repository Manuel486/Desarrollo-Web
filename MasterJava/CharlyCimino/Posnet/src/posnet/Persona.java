/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author Manuel
 */
public class Persona {
    private String DNI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;

    public Persona(String DNI, String nombre, String apellido, String telefono, String mail) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String nombreCompleto(){
        return this.nombre+" "+this.apellido;
    }
    
}

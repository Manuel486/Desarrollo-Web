/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public class Alumno implements Aprobable {
    private String DNI;
    private String apellido;
    private String nombre;
    private ArrayList<Examen> examenes;

    public Alumno(String DNI, String apellido, String nombre) {
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
        this.examenes = new ArrayList<>();
    }
    
    public void agregarExamen(Examen e) {
        this.examenes.add(e);
    }
    
    public String nombreCompleto(){
        return nombre + " " + apellido;
    }

    @Override
    public boolean aprobo() {
        int i = 0;
        while(i < this.examenes.size() && this.examenes.get(i).aprobo()) {
            i++;
        }
        return i == this.examenes.size();
    }
    
}

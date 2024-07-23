/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author Manuel
 */
public class Ticket {
    private String nombreApellido;
    private double montoPagar;
    private double montoCuota;

    public Ticket(String nombreApellido, double montoPagar, double montoCuota) {
        this.nombreApellido = nombreApellido;
        this.montoPagar = montoPagar;
        this.montoCuota = montoCuota;
    }

    @Override
    public String toString() {
        return "Ticket{" + "nombreApellido=" + nombreApellido + ", montoPagar=" + montoPagar + ", montoCuota=" + montoCuota + '}';
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg21_polimorfismo.java;

/**
 *
 * @author Manuel
 */
public class BicicletaElectrica extends Vehiculo {
    
    public void prenderPantalla(){
        System.out.println("Pantalla encendida");
    }
    
    public void energizarMotor(){
        System.out.println("Motor listo");
    }
    
    @Override
    public void encender(){
        prenderPantalla();
        energizarMotor();
    }
    
}

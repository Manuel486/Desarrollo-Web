/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg21_polimorfismo.java;

/**
 *
 * @author Manuel
 */
public class Main {

    /*
        - Redefinir un método implicará que ante un mismo mensaje, haya
        un comportamiento diferente al declarado en la superclase.
        - Java deduce en tiempo de ejecución que 'v' apunta a una Bicicleta
        Eléctrica y por eso invoca al 'encender' de tal clase.
        - El polimorfismo logro que cualquier vehicula se encienda de la forma
        que corresponda, porque java va a decidir que tipo de vehiculo esta
        llegando.
    */
    public static void main(String[] args) {
        // probar(new Vehiculo());
        probar(new Avion());
        System.out.println("===================");
        probar(new BicicletaElectrica());
    }
    
    public static void probar(Vehiculo v){
        // con el polimorfismo nos evitamos esto : 
        /*
        if (v instanceof Avion){
        } else if(v instanceof BicicletaElectrica){}
         */  
        v.encender();
    }
    
}

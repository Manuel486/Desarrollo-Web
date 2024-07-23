/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg22_super.polimorfismo.java;

import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Bicicleta> bicis = new ArrayList<>();
        
        bicis.add(new Bicicleta("Fake",20,30));
        bicis.add(new BicicletaElectrica("BiciE",16,65,250));
        
        bicis.add(new Bicicleta("UltraBije",28,35));
        bicis.add(new BicicletaElectrica("Elecleta",18,43,500));
        
        Taller t = new Taller();
        System.out.println("Servicios disponibles: "+t.cantServiciosPosibles(bicis));
    }
}

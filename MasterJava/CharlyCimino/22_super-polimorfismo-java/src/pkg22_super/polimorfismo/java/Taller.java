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
public class Taller {
    
    /* 
        Solo se brinda servicios a aquellas
        bicicletas de menos de 50kms recorridos y
        bicicletas eléctricas de hasta 400w y menos de
        50 kms recorridos, como el resto de las bicicletas
     */
    public int cantServiciosPosibles(ArrayList<Bicicleta> bicis) {
        int contador = 0;
        for (Bicicleta bici : bicis) {
            if (bici.cumpleRequisitos()) {
                contador++;
            }
        }
        return contador;
    }
}

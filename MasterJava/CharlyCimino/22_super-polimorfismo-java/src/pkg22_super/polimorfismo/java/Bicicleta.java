/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg22_super.polimorfismo.java;

/**
 *
 * @author Manuel
 */
public class Bicicleta {
    private final int CANT_KMS_MAX = 50;
    private String marca;
    private int rodado;
    private int cantKms;

    public Bicicleta(String marca, int rodado, int cantKms) {
        this.marca = marca;
        this.rodado = rodado;
        this.cantKms = cantKms;
    }
    
    public boolean cumpleRequisitos() {
        return this.cantKms < CANT_KMS_MAX;
    }
    
    public int getCantKms() {
        return cantKms;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg22_super.polimorfismo.java;

/**
 *
 * @author Manuel
 */
public class BicicletaElectrica extends Bicicleta{
    private final int CANT_POT_MAX = 400;
    private int potencia;

    public BicicletaElectrica(String marca,int rodado, int cantKms,int potencia) {
        super(marca, rodado, cantKms);
        this.potencia = potencia;
    }
    
    @Override
    public boolean cumpleRequisitos() {
        return this.potencia < CANT_POT_MAX && super.cumpleRequisitos();
    }
}

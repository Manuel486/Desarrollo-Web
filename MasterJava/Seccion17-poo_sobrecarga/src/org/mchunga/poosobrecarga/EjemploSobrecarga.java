package org.mchunga.poosobrecarga;

import static org.mchunga.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {

    public static void main(String[] args) {

        //Calculadora cal = new Calculadora();

        System.out.println("sumar int : "+ sumar(10,5));
        System.out.println("sumar float : "+ sumar(10.0F,5F));
        System.out.println("sumar float-int : "+ sumar(10f,5));
        System.out.println("sumar int-float : "+ sumar(10,5.0f));
        System.out.println("sumar double : "+ sumar(10D,5D));
        System.out.println("sumar string : "+ sumar("10","5"));
        System.out.println("sumar tres int : "+ sumar(10,5,5));
        System.out.println("sumar cuatro int : "+ sumar(10,5,5,1));
        System.out.println("sumar float + n int : "+sumar(10.5f,5,9,15));
        System.out.println("sumar 4 doouble : "+sumar(10.0,5.0,3.5,4.5));

        System.out.println("sumar long : "+sumar(10L,5L));
        System.out.println("sumar int : "+sumar(10,'@'));
        System.out.println("sumar float-int : "+sumar(10f,'@'));
    }
}

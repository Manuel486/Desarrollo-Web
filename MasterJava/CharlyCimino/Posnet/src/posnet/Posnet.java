/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posnet;

/**
 *
 * @author Manuel
 */
public class Posnet {
    public static double RECARGO_POR_CUOTA = 0.03;
    public static int MIN_CUOTAS = 1;
    public static int MAX_CUOTAS = 6;
    
    public Ticket efectuarPago(TarjetaDeCredito tarjeta,double montoAAbonar,int cantCuotas){
        Ticket ticket = null;
        
        if( datosValidos(tarjeta,montoAAbonar,cantCuotas) ){
            double montoFinal = montoAAbonar + montoAAbonar * recargoSegunCuotas(cantCuotas);
            if (tarjeta.saldoSuficiente(montoFinal)) {
                tarjeta.descontar(montoFinal);
                String nomApe = tarjeta.nombreCompletoDeTitular();
                double montoPorCuota = montoFinal / cantCuotas;
                ticket = new Ticket(nomApe, montoFinal, montoPorCuota);
            }
        }
        
        
        return ticket;
    }
    
    public boolean datosValidos(TarjetaDeCredito tarjeta,double monto,int cuotas){
        boolean esTarjetaValida = tarjeta != null;
        boolean esMontoValido = monto > 0;
        boolean cantCuotasValidas = cuotas >= MIN_CUOTAS && cuotas <= MAX_CUOTAS;

        return esTarjetaValida && esMontoValido && cantCuotasValidas;
    }
    
    public double recargoSegunCuotas(int cantCuotas){
        return (cantCuotas - 1) * RECARGO_POR_CUOTA;
    }
    
    
}

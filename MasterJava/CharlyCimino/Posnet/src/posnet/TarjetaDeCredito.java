/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author Manuel
 */
public class TarjetaDeCredito {
    private EntidadFinanciera entidadFinanciera;
    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private Persona titular;

    public TarjetaDeCredito(EntidadFinanciera entidadFinanciera, String entidadBancaria, String nroTarjeta, double saldo, Persona p) {
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.titular = p;
    }

    public boolean saldoSuficiente(double monto){
        return this.saldo > monto;
    }
    
    public void descontar(double monto){
        this.saldo = this.saldo - monto;
    }
    
    public String nombreCompletoDeTitular(){
        return this.titular.nombreCompleto();
    }
    
    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }
}

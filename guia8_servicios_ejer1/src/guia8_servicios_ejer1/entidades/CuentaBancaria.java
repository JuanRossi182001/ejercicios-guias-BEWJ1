/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_servicios_ejer1.entidades;

/**
 *
 * @author mtbst
 */
public class CuentaBancaria {
    
    private int nroCuenta;
    private long dniCliente;
    private double saldoActual;
    
    public CuentaBancaria () {
    }
    
    public CuentaBancaria (int nroCta, long dniCli, double saldo) {
        this.nroCuenta=nroCta;
        this.dniCliente=dniCli;
        this.saldoActual=saldo;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
     
}

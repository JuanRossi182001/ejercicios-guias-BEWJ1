/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_servicios_ejer1.servicios;

import guia8_servicios_ejer1.entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class CuentaServicios {
    
      
    Scanner leer = new Scanner(System.in);
    
    // Método para crear cuenta pidiéndole los datos al usuario.
    public CuentaBancaria crearCuenta(){
        //CuentaBancaria cBS = new CuentaBancaria();
        System.out.print("Ingrese nroCuenta: ");
        int a=leer.nextInt();
        //cBS.setNroCuenta();
        System.out.print("Ingrese DNI Cliente: ");
        long b=leer.nextLong();
        //cBS.setDniCliente();
        System.out.print("Ingrese saldo actual: ");
        double c=leer.nextDouble();
        //cBS.setSaldoActual();
        CuentaBancaria cBS = new CuentaBancaria(a,b,c);
        return cBS;
    }
    
    //Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    
    public void consultarDatos(CuentaBancaria cB){  // ahi entre los parentesis coloco de donde viene y un nombre de variable, no importa cual sea 
        System.out.println("Nro Cta: " + cB.getNroCuenta() + " - DNI: " + cB.getDniCliente() + " - Saldo: " + cB.getSaldoActual());
    }
    
    //Método ingresar(double): recibe una cantidad de dinero a ingresar y se le 
    //sumará al saldo actual.
    
    public void ingresar(double cantidad, CuentaBancaria cB){
        cB.setSaldoActual(cantidad+cB.getSaldoActual());
        System.out.println("Se ingresaron $" + cantidad);
    }
    
    //Método retirar(double): recibe una cantidad de dinero a retirar y se le 
    //restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a 
    //retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    
    public void retirar(double cantidad, CuentaBancaria cB){
        if (cantidad>cB.getSaldoActual()) {
            System.out.println("Saldo actual $" + cB.getSaldoActual());
            cB.setSaldoActual(0);
        } else {
            System.out.println("Se retiran $" + cantidad);
            System.out.println("Saldo actual $" + (cB.getSaldoActual()-cantidad));
            cB.setSaldoActual(cB.getSaldoActual()-cantidad);
        }
    }
    
    //Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. 
    //Validar que el usuario no saque más del 20%.
    
    public void extraccionRapida(CuentaBancaria cB){
        System.out.println("Se retiran $" + cB.getSaldoActual()*0.2);
        cB.setSaldoActual(cB.getSaldoActual()*0.8);
    }
    
    //Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    
    public void consultarSaldo(CuentaBancaria cB){
        System.out.println("Saldo $" + cB.getSaldoActual());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_servicios_ejer1;

import guia8_servicios_ejer1.entidades.CuentaBancaria;
import guia8_servicios_ejer1.servicios.CuentaServicios;
import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class Guia8_servicios_ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in);
        CuentaServicios cBSm = new CuentaServicios();
        
        System.out.println("------Red BLink------");
        System.out.println("");
        System.out.println("Bienvenido:");
        System.out.println("A continuación se creará su cuenta bancaria");
        
        
        CuentaBancaria cB1 = cBSm.crearCuenta();
        cBSm.consultarDatos(cB1);
        
        byte opcion;
        boolean estado=false;        
        while (!estado) {
            do {
                System.out.println("");
                System.out.println("");
                System.out.println("----$-Red BLink-$----");
                System.out.println("");
                System.out.println("Opciones:");
                System.out.println("0-Salir");
                System.out.println("1-Ingresar");
                System.out.println("2-Retirar");
                System.out.println("3-Extracción rápida");
                System.out.println("4-Consultar saldo");
                System.out.println("5-Consultar datos");
                System.out.println("");
                System.out.print(">");
                opcion = leer.nextByte();
                System.out.println("");
            switch (opcion){
                case 0:
                    estado=true;
                    break;
                case 1:
                    System.out.print("Cantidad a ingresar $");
                    cBSm.ingresar(leer.nextDouble(), cB1);
                    break;
                case 2:
                    System.out.print("Cantidad a retirar: ");
                    double cantidad=leer.nextDouble();
                    cBSm.retirar(cantidad, cB1);
                    break;
            case 3:
                cBSm.extraccionRapida(cB1);
                break;
            case 4:
                cBSm.consultarSaldo(cB1);
                break;
            case 5:
                cBSm.consultarDatos(cB1);
                break;
            default:
                break;
            }
        } while (opcion<0||opcion>5);
        }
    }
    
        
        
       
    }
    


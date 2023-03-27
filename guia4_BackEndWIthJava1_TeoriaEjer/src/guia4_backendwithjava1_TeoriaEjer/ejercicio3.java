/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_backendwithjava1_TeoriaEjer;

import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad de EUROS");
        int euros=read.nextInt();
        System.out.println("A que moneda desea convertir?");
        int eleccion;
        System.out.println("Opcion 1 = LIBRAS");
        System.out.println("Opcion 2 = DOLARES");
        System.out.println("Opcion 3 = YENES");
        eleccion=read.nextInt();
        switch(eleccion){
            case 1:
                libras(euros);
                break;
            case 2:
                dolares(euros);
                break;
            case 3:
                yenes(euros);
        }
        

        
        // TODO code application logic here
    }
    
    public static void libras(int euros){
        double libras=euros*0.86;
        System.out.print("La cantidad de: " + euros + "EUROS ");
        System.out.println("equivalen a " + libras + "LIBRAS");
    }
      public static void dolares (int euros){
        double dolares=euros*1.28611;
        System.out.print("La cantidad de: " + euros + "EUROS ");
        System.out.println("equivalen a " + dolares + "DOLARES");
    }
       public static void yenes (int euros){
        double yenes=euros*129.852;
        System.out.print("La cantidad de: " + euros + "EUROS ");
        System.out.println("equivalen a " + yenes + "YENES");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

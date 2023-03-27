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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("------------EJERCICIO 2--------------");
        Scanner read =new Scanner (System.in);
        String salida;
        String nombre;
        int edad;
        do {
            System.out.println("coloque un nombre");
            nombre=read.next();
            System.out.println("coloque la edad");
            edad=read.nextInt();
           
            subprograma(nombre,edad);
                
                System.out.println("Quiere seguir ingresando personas?");
                System.out.println("si=Continuar");
                System.out.println("no=salir");
                 salida=read.next();
            if (salida.equals("no")) {
                break;
            }
                
        } while (true);
        // TODO code application logic here
    }
    
    public static String subprograma (String nombre, int edad){
        String resultado;
         if (edad >= 18) {
                System.out.println("La persona es mayor de edad");
                System.out.println("El nombre es: " + nombre);
                System.out.println("La edad es: " + edad);
                return "";
            }
            else{
                 System.out.println("La persona es menor de edad");
                System.out.println("El nombre es: "+ nombre);
                System.out.println("La edad es: " + edad);
            return "";
                }
         
     }
        
   
       
}

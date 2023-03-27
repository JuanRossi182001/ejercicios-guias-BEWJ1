/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_ejercicios;

import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class Guia4_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        Scanner read = new Scanner(System.in);
        
        System.out.println("--------------------EJERCICIO 1--------------------------");
        int num1;
        int num2;
        System.out.println("Ingrese el primer numero");
        num1=read.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=read.nextInt();
        int  eleccion;
        System.out.println("que desea hacer?");
         System.out.println(" Las opciones son: ");
         System.out.println("Opcion 1: SUMAR");
         System.out.println("Opcion 2: RESTAR");
         System.out.println("Opcion 3: MULTIPLICAR");
         System.out.println("Opcion 4: DIVIDIR");
         eleccion=read.nextInt();
            switch(eleccion){
                case 1:
                       suma(num1,num2);
                break;
                case 2:
                    resta(num1,num2);
                    
                break;
             case 3:
                 multi(num1,num2);
                 break;
             case 4:
                    div(num1,num2);
    }      
}
        
    
public static int suma (int num1,int num2){
int resultado=num1 + num2;
    System.out.println("El resultado de la suma es: " + resultado);
    
return resultado;
}

public static int resta (int num1,int num2){
int resultado=num1 - num2;
    System.out.println("El resultado de la resta es: " + resultado);
    
return resultado;
}
    
public static int multi (int num1,int num2){
    int resultado= num1 * num2;
    System.out.println("El resultado de la multiplicacion es: " + resultado);
    return resultado;
}
    
public static double div (int num1, int num2){
    if (num2==0) {
        System.out.println("no se puede dividir por 0");
    }
    else{
        int resultado=num1/num2;
    System.out.println("El resultado de la division es: " + resultado);
    return resultado;
    }
       return 0;
       
}





















































}





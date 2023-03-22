/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1_java;

import static java.lang.Math.sqrt;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author mtbst
 */
public class Day1_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // EXERCISE 1 
        int num1;
        int num2;
        Scanner read = new Scanner(System.in); //* colocando eso importo la funcion para colocar cosas por teclado
        System.out.println("coloque el primer numero");
        num1 = read.nextInt();
        System.out.println("coloque el segundo numero");
        num2 = read.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los numeros es: " + suma);
        
           //EXERCISE 2   
           
        System.out.println("-----------COMIENZO EJERCICIO 2-----------");
        String name;
        System.out.println("Coloque su nombre");
         name = read.next(); // para los strings con usar el next solo me sirve 
        System.out.println("Su nombre es: " + name);
        
        System.out.println("-----------COMIENZO EJERCICIO 3-----------");
        
        System.out.println("coloque una frase");
        String frase;
        String frase1;
        String frase2;
        frase = read.next();
        frase1 = toUpperCase(frase);
        frase2 = toLowerCase(frase);
        System.out.println("La frase q coloque fue: " + frase);
        System.out.println("La frase en mayusculas es: " + frase1);
        System.out.println("La frase en minusculas es: " + frase2);
        
        System.out.println("-----------COMIENZO EJERCICIO 4-----------");
        int grados;
        int faren;
        System.out.println("Coloque la temperatura en grados");
        grados = read.nextInt();
        faren = 32 + (9 * grados/5);
        System.out.print("La temperatura colocada equivale a " + faren);
        System.out.println(" grados fahrenheit");
        
        System.out.println("-----------COMIENZO EJERCICIO 5-----------");
        int num;
        int doble;
        int triple;
        double raiz;
        System.out.println("Coloque un numero");
        num = read.nextInt();
        doble = num * 2;
        triple = num * 3;
        raiz = sqrt(num);
        System.out.println("El doble de su numero es; " + doble);
        System.out.println("El triple de su numero es:"+ triple);
        System.out.println("La raiz cuadrada de su numero es: " + raiz);
         
                
        
        
        
    }
    
}






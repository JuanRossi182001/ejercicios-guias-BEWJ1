/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_backendwithjava1;

import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class Guia3_BackEndWithJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--------------------------------------EJERCICIO 1-------------------------------------------");
        Scanner read = new Scanner(System.in);
        System.out.println("Coloque un numero");
        int num;
        num = read.nextInt();
        num=(num%2);
        if (num==0){
            System.out.println("Su numero es par");
        }
        else{
            System.out.println("Su numero es impar");
        }
        
        
        System.out.println("---------------------------------------EJERCICIO 2--------------------------------------------------");
        String frase;
        System.out.println("Coloque la palabra");
        frase=read.next();
        if (frase.equals("eureka")){ // UTILIZO .EQUALS que lo que hace es comprobas si la varibale es igual a lo q le ponga entre parentesis 
            System.out.println("Usted coloco la palabra correcta");
        }
        else{
            System.out.println("Usted coloco la palabra incorrecta");
        }
        
        System.out.println("--------------------------EJERCICIO 3-------------------------------");
        System.out.println("Coloque una palabra de 8 caracteres");
        String palabra;
        int largo;
        palabra=read.next();
        largo=palabra.length();
        if (largo==8){
            System.out.println("Felicitaciones conoce una palabra de 8 caracteres");
        }
        else{
            System.out.println("Incorrcto,aprenda a contar caracteres, puede usar .lenght xd");
        }
                    
        System.out.println("---------------------------EJERCICIO 4-----------------------------");
        System.out.println("Coloque una frase");
        String frrase;
        String flag;
        frrase = read.next();
        flag=frrase.substring(0, 1); // utilizo subtring para dividir un string, en el parentesis coloco en q index empeizo y en q index-1 termino)
        // como necesito solo la primera letra coloco un 0 y un 1
        if (flag.equals("A")){
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
        
        System.out.println("----------------------EJERCICIO 5-------------------------------");
        int valorr;
        int numm;
        int suma;
        System.out.println("Coloque un valor limite POSITIVO");
        valorr=read.nextInt();
        suma = 0;
        while (suma<=valorr){
            System.out.println("Ingrese un numero");
            numm=read.nextInt();
            suma += numm; // escribir suma += suma es una forma abreviada de escribir suma = suma + numm 
            
        }
                
          System.out.println("---------------------EJERCICIO 6-------------------------------");
        int num1;
        int num2;
        int eleccion;
        int resultado;
        String valisa;
        String salida;
        valisa="else";
         System.out.println("coloque un numero");
         num1=read.nextInt();
         System.out.println("coloque un segundo numero");
         num2=read.nextInt();
         System.out.println("Los numeros colocados son " + num1 + " y " + num2 );
             System.out.print("que desea hacer con estos numeros? ");
      do{
         System.out.println(" Las opciones son: ");
         System.out.println("Opcion 1: SUMAR");
         System.out.println("Opcion 2: RESTAR");
         System.out.println("Opcion 3: MULTIPLICAR");
         System.out.println("Opcion 1: DIVIDIR");
         System.out.println("Opcion 1: SALIR");
         eleccion=read.nextInt();
            switch(eleccion){
                case 1:
                    resultado=num1+num2;
                    System.out.println("El resultado es: " + resultado);
                break;
                case 2:
                    resultado=num1-num2;
                     System.out.println("El resultado es: " + resultado);
                break;
             case 3:
                 resultado=num1*num2;
                  System.out.println("El resultado es: " + resultado);
                 break;
             case 4:
                    resultado=num1/num2;
                     System.out.println("El resultado es: " + resultado);
                break;
                case 5:
                    System.out.println("Esta seguro que desea salir?");
                    System.out.println("Coloque s para si o n para no");
                    salida=read.next();
                if (salida.equalsIgnoreCase("s")){
                    valisa="salir";
                }
                else if (salida.equalsIgnoreCase("n")){
                    valisa="else";
                }
             }
      }while( valisa!="salir");
        
          System.out.println ("-------------------------------EJERCICIO 7----------------------------");
        String cadena;
        int sumaC;
        int sumaI;
        sumaC=0;
        sumaI=0;
        do {
             System.out.println("Ingrese la cadena");
             cadena=read.next();
             if (cadena.equals("&&&&&")) {
                break;
            }
             if (cadena.length()==5 && cadena.substring(0, 1).equals("x") && cadena.substring(4, 5).equals("o") ) {
                 System.out.println("correcto");
                 sumaC=sumaC + 1;
                 
            }
             else{
                 System.out.println("incorrecto");
                 sumaI=sumaI + 1;
             }
            
             
        } while (true);
        System.out.println("la cantidad de cadenas correctas fue de : " + sumaC );
        System.out.println("La cantidad de cadenas incorrectas fue de : " + sumaI);
        
        
        System.out.println ("-------------------------------EJERCICIO 8----------------------------");
          System.out.print("Ingrese el tamaño del cuadrado: ");
        int n = read.nextInt();

        // Dibuja la primera fila con todos los asteriscos
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Dibuja las filas intermedias con asteriscos en los extremos y espacios en el medio
        for (int i = 2; i <= n - 1; i++) {
            System.out.print("* ");
            for (int j = 2; j <= n - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

        // Dibuja la última fila con todos los asteriscos
       
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}

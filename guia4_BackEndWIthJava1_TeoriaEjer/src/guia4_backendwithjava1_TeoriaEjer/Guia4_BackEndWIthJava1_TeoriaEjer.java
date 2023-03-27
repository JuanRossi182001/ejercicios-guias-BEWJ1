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
public class Guia4_BackEndWIthJava1_TeoriaEjer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("------------------------ejercicio 1 TEORIA----------------------------");
        System.out.println("Coloque una frase");
        String frase;
        frase=read.nextLine(); // coloque nextLine para q no me lo corte cuando haga un espacio 
        read.close(); // eso hace q el string se corte cuando coloque un . 
        String convertida;
        convertida = recorredorConvertidor(frase);
        System.out.println("La frase codificada es: " + convertida);
	}

	

	public static String recorredorConvertidor (String frase) {
            String convertida;
         convertida="";
            // necesito hacer un bucle para recorrer letra por letra
            for (int i = 0; i < frase.length(); i++) {
                char letra = frase.charAt(i); // esto me va a separar caracter por caracter segun el index que va a ir aumentando porque es "i"
                if (Vocal(letra)) {
                   convertida += converter(letra);
                }
                else{
                    convertida+=letra;
                }
	}
        return convertida;
        }
        
        public static boolean Vocal (char letra) { // aca verifico se la letra ingresada es una vocal o no, si es vocal devuelve true e ingresa en el if dentro del for 
        return letra == 'a' || letra == 'A' ||
               letra == 'e' || letra == 'E' ||
               letra == 'i' || letra == 'I' ||
               letra == 'o' || letra == 'O' ||
               letra == 'u' || letra == 'U';
            }
        
        
       public static char converter(char caracter) { // aca con cada letra ya separada la encasillo en un case y le asigno el caracter modificado 
           switch(caracter){
               case 'a':
            case 'A':
                return '@';
            case 'e':
            case 'E':
                return '#';
            case 'i':
            case 'I':
                return '$';
            case 'o':
            case 'O':
                return '%';
            case 'u':
            case 'U':
                return '*';
            default:
                return caracter;
           }
}

}

        // TODO code application logic here
    
   
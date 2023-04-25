/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_utilidades_ejer1.servicios;

import guia9_utilidades_ejer1.entidades.Cadena;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class CadenaService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Cadena c1 = new Cadena();
    public Cadena inicioCadena (){
        
        System.out.println("ingrese una frase");
       c1.setFrase(read.nextLine()); 
       return c1;
    }
    
    public void mostrarVocales(Cadena c){
        int contadorVocales=0;
        for (int i = 0; i < c1.getLongitud(); i++) {
             char x = Character.toLowerCase(c1.getFrase().charAt(i));
             if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            contadorVocales++;
        }
    }
    System.out.println("La frase tiene " + contadorVocales + " vocales.");
}
             

    public void invertirCadena(Cadena c){
        String fraseInvertida = "";
            for (int i = c1.getFrase().length() - 1; i >= 0; i--) {
                fraseInvertida += c1.getFrase().charAt(i);
            }
            System.out.println(fraseInvertida);
    }
    
    
    
    public void vecesRepetido(Cadena c){
       System.out.println("Ingrese un carácter a buscar:");
    char letra = read.next().charAt(0);
    int contador = 0;
    for (int i = 0; i < c1.getLongitud(); i++) {
        if (c1.getFrase().charAt(i) == letra) {
            contador++;
        }
    }
    System.out.println("El carácter se repite " + contador + " veces.");
    
}    
    
 public void compararLongitud(Cadena c){
     System.out.println("Ingrese una frase");
     String frase1;
     frase1=read.next();
     if (frase1.length()>c1.getLongitud()) {
         System.out.println("La frase ingresada es mas larga");
     }else  {
         System.out.println("La frase ingresada es mas corta");
     }
                            
 }
    
    
 public void unirFrases(Cadena c){
    System.out.println("Ingrese una frase");
     String frase1;
     frase1=read.next();
     System.out.println(frase1 + " " + c1.getFrase());
 }
    
   
    public void reemplazar(Cadena c ){
        char let='a';
        String frasee;
        frasee=c1.getFrase();
        String fraseReemplazada = "";
         System.out.println("ingrese un caracter para reemplazar la letra a");
            char s = read.next().charAt(0);
         for (int i = 0; i < c1.getLongitud(); i++) {
        if (c1.getFrase().charAt(i) == let) {
                fraseReemplazada += s;
    } else {
        fraseReemplazada += frasee.charAt(i);
        }        
    }
         System.out.println("Frase original: " + frasee);
    System.out.println("Frase reemplazada: " + fraseReemplazada);
         
         
    }
    
    
    
    public void contiene (Cadena c){
           System.out.println("Ingrese un carácter a buscar:");
        char letra = read.next().charAt(0);
    boolean flag=false;
    for (int i = 0; i < c1.getLongitud(); i++) {
        if (c1.getFrase().charAt(i) == letra) {
         flag=true;
         break;
        }else{
            flag=false;
        }
       
    }
    System.out.println(flag);
    }
}

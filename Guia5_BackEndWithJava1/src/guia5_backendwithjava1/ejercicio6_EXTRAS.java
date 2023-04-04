/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_backendwithjava1;

import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class ejercicio6_EXTRAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner read = new Scanner(System.in);
          System.out.println("--------------ejercicio 6----------------");
          String palabras;
          int i=0;
          String [][] sopa= new String [20][20];
          
          do {
              System.out.println("coloque una palabra");
              palabras=read.next();
              if (palabras.length()>=3 && palabras.length()<=5) {
                  System.out.println("correcto");
              }
              i++;
        } while (i<5);
        
     
        // TODO code application logic here
    }
    
}



//* for (int j = 0; j < 20; j++) {
   //                  for (int k = 0; k < 20; k++) {
    //                      System.out.println(sopa[j][k]);
      //                }
        //              System.out.println(" ");
          //        }
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_backendwithjava1;

import java.util.Scanner;

/**
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
 * Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
 * El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.

 * @author mtbst
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] matriz =  new int [3][3];
        
        Scanner read = new Scanner(System.in);
        int num;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("escriba un numero para colocar en la poscion" + i + j);
                    num=read.nextInt();
                } while (num<1||num>9);
                matriz[i][j]=num;
            }
        }
        
        sumafila(matriz);
        sumaC(matriz);
        diag(matriz);
        
        
        if (sumafila(matriz)&&sumaC(matriz)&&diag(matriz)) {
            System.out.println("es una matriz magica");
        }else{
            System.out.println("no es matriz magica");
        }
        

        // TODO code application logic here
    }
    
    
    
    public static boolean sumafila(int[][]matriz){
        boolean flag=false;
        int valor=matriz[0][0]+ matriz[0][1]+matriz[0][2];
        for (int i = 1; i < 3; i++) {
            if (valor==matriz[i][0]+ matriz[i][1]+matriz[i][2]){
                flag=true;
            }
            else{
                return false;
            }
          
        }
        return flag;
}
    
    public static boolean sumaC(int[][]matriz){
        boolean flag=false;
        int valor=matriz[0][0]+ matriz[0][1]+matriz[0][2];
        for (int i = 1; i < 3; i++) {
            if (valor==matriz[0][i]+ matriz[1][i]+matriz[2][i]){
                flag=true;
            }
            else{
                return false;
            }
        }
       return flag; 
}
    
    public static boolean diag(int[][]matriz){
        int valor;
        valor=matriz[0][0]+matriz[1][1]+matriz[2][2];
        int valor1;
        valor1=matriz[0][2]+matriz[1][1]+matriz[2][0];
      return valor==valor1;
    }
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


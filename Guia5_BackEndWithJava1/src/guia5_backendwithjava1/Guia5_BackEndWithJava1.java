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
public class Guia5_BackEndWithJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--------------EJERCICIO 1-------------------");
        int vector1[] = new int [100];
        for (int i = 0; i<vector1.length; i++) {
            vector1[i]= 101-i;
        }
         for (int i = 1; i<vector1.length; i++) {
             System.out.println("[" + vector1[i] + "]");
        }
        System.out.println("-----------------EJERCICIO 2------------------");
        int N;
        Scanner read = new Scanner(System.in);
        System.out.println("coloque la dimension del vector");
        N=read.nextInt();
        int vector2[]=new int[N];
        for (int i = 0; i < N; i++) {
            int numeroAleatorio = (int) Math.round(Math.random() * 99 + 1);
            vector2[i]=numeroAleatorio;
        }
        for (int i = 0; i < N; i++) {
            System.out.println("[" + vector2[i] + "]");
        }
        int numm;
        System.out.println("ingrese el numero a buscar");
        numm=read.nextInt();
        int cant;
        cant=busqueda(vector2,N,numm);
        
        
        System.out.println("--------------------EJERCICIO 4-----------------------");
        int[][] matrizA=new int [4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               matrizA[i][j]= (int) Math.round(Math.random() * 99 + 1);
                
            }
            
        }
        mostrar(matrizA);
        System.out.println("-------transpuesta---------");
        transpuesta(matrizA);
        
        
        
        System.out.println("------------------EJERCICIO 5------------------");
         int[][] matrizT=new int [4][4];
        
        
        
        
        
        // TODO code application logic here
    }
    
    
    
    public static void mostrar(int[][] matrizA){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizA[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
    
    public static void transpuesta(int[][] matrizA){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizA[j][i]+ " ");
            }
            System.out.println(" ");
        }
    }
    
    
    
    
    
    
    
    
    
    public static int busqueda(int [] vector2,int N,int numm){
        int contador=0;
        for (int i = 0; i < N; i++) {
            if (numm==vector2[i]) {
                contador++;
                System.out.println("Numero econtrado en " + i + " posicion");
                
            }
        }
      System.out.println("el numero " + numm + "se encontro " + contador + " veces");

        return contador;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

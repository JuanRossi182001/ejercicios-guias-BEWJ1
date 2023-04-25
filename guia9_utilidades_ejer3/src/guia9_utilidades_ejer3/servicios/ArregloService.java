/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_utilidades_ejer3.servicios;

import java.util.Arrays;

/**
 *
 * @author mtbst
 */
public class ArregloService {
    public void inicializarA(double[] arregloA){
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i]=Math.random()*100+1;
        }
       
}
    
    public void mostrar(double[] arregloA){
         for (int i = 0; i < arregloA.length; i++) {
             System.out.println("ELEMENTO" + i +" de " + arregloA[i]);
    
        }
    }
    
    public void ordenar(double[] arregloA){
        Arrays.sort(arregloA);
    }
    
    public void inicializarB(double[] arregloA,double[] arregloB){
    for (int i = 0; i < 10; i++) { // Copiar los primeros 10 números del arreglo A en el arreglo B
        arregloB[i] = arregloA[i];
    }
    for (int i = 10; i < 20; i++) { // Llenar las últimas 10 posiciones del arreglo B con 0.5
        arregloB[i] = 0.5;
    }
    }
    
    
    
    
    
    
    
    
    
}

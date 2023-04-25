/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_utilidades_ejer3;

import guia9_utilidades_ejer3.servicios.ArregloService;

/**
 *
 * @author mtbst
 */
public class Guia9_utilidades_ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArregloService as = new ArregloService();
         double[] arregloA = new double[50];
         double[] arregloB = new double[20];
        
        as.inicializarA(arregloA);
        as.mostrar(arregloA);
        as.ordenar(arregloA);
        as.inicializarB(arregloA, arregloB);
        as.mostrar(arregloA);
        as.mostrar(arregloB);
        // TODO code application logic here
    }
    
}

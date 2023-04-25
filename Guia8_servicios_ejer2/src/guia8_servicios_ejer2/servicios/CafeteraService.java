/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_servicios_ejer2.servicios;

import guia8_servicios_ejer2.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class CafeteraService {
      private int maxima;
    private int actual;
    private Scanner read = new Scanner(System.in);
    
   
    public Cafetera IniciarCafetera(){
        System.out.println("Ingrese la capacidad maxima");
        maxima=read.nextInt();
        System.out.println("Ingrese la capacidad actual");
        actual=read.nextInt();
        Cafetera n1 = new Cafetera(maxima, actual);
        return n1;
    }
    
    
    public Cafetera llenarCafetera(Cafetera n1){
        actual=maxima;
        return n1;
       
    }
    
    
    public void servirTaza(Cafetera nx){
        int tamanioTaza;
        System.out.println("ingrese el tamanio de la taza");
        tamanioTaza=read.nextInt();
        if (tamanioTaza>actual) {
            System.out.println("su tamanio de taza es mayor a la capacidad actual");
            System.out.println("se servira hasta donde se llegue");
             System.out.println("*---SIRVIENDOO---*");
             System.out.println("se servio tamanio " + actual + " de " + tamanioTaza);
             actual=0;
        }
        else{
            System.out.println("*---SIRVIENDOO---*");
            System.out.println("su taza se sirivio completa, a disfrutar ");
            actual=actual-tamanioTaza;
            System.out.println("queda " + actual + " cantidad de cafe en la maquina");
        }
      
    }
    
    
    
        public void vaciarCafetera(Cafetera nx){
            actual= 0;
            System.out.println("la cafetera fue vaciada");
        }
    
    
    public void agregarCafe(Cafetera nx){
        System.out.println("ingrese la cantidad de cafe a agregar");
        int cantidad = read.nextInt();
        actual = actual + cantidad;
        System.out.println("la cafetera tiene " + actual + " cafe");
    }
    
 
    
}
     




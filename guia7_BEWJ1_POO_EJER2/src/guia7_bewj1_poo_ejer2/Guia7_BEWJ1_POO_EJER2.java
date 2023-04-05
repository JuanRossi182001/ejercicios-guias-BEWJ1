/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_bewj1_poo_ejer2;

import guia7_bewj1_poo_ejer2.entidades.Circunferencia;

/**
 *
 * @author mtbst
 */
public class Guia7_BEWJ1_POO_EJER2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Circunferencia ejer2 = new Circunferencia(); // creo ejer2 con el molde de la clase circunferencia 
        
        ejer2.CrearCircunferencia();
        ejer2.Area();                           // utilizo los metodos creados en la calse circunferencia 
        ejer2.Perimetro();
        
        // TODO code application logic here
    }
    
}

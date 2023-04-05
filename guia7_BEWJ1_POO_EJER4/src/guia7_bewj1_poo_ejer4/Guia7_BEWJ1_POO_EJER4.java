/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_bewj1_poo_ejer4;

import guia7_bewj1_poo_ejer4.entidades.Rectangulo;

/**
 *
 * @author mtbst
 */
public class Guia7_BEWJ1_POO_EJER4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Rectangulo ejer4 = new Rectangulo();
        
        ejer4.crearRectangulo();
        System.out.println(ejer4.calcularPerimetro());
        System.out.println(ejer4.calcularSuperficie());
        ejer4.dibujarRectangulo();
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}

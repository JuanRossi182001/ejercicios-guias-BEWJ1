/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_bewj1_poo_ejer3;

import guia7_bewj1_poo_ejer3.entidades.Operacion;

/**
 *
 * @author mtbst
 */
public class Guia7_BEWJ1_POO_EJER3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operacion ejer3 = new Operacion(); // creo la variable ejer3 usando el molde de la case Operacion
        ejer3.CrearOperacion();
        System.out.println(ejer3.Sumar());
        System.out.println(ejer3.Restar());
        System.out.println(ejer3.Multiplicar());
        System.out.println(ejer3.Dividir());
        
        // TODO code application logic here
    }
    
}

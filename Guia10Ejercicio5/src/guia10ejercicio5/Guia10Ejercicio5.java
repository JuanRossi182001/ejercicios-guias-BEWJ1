/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ejercicio5;

import PaisesServicio.PaisesServicio;

/**
 *
 * @author Digital
 */
public class Guia10Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PaisesServicio ps = new PaisesServicio();
       ps.ingresarPaises();
       ps.mostrarPaises();
       ps.paisesOrdenados();
       ps.eliminarPaises();
    }
    
}

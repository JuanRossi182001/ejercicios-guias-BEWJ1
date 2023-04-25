/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_utilidades_ejer2;

import guia9_utilidades_ejer2.ParService.ParService;
import guia9_utilidades_ejer2.entidades.ParDeNumeros;

/**
 *
 * @author mtbst
 */
public class Guia9_utilidades_ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ParService ps = new ParService();
        ParDeNumeros p = ps.mostrar();
        ps.devolverMayor(p);
        ps.calcularPotencia(p);
        ps.calcularRaiz(p);
        System.out.println(p);
    }
    
}

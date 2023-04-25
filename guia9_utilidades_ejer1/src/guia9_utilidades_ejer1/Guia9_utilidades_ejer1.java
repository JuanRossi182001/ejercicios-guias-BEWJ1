/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_utilidades_ejer1;

import guia9_utilidades_ejer1.entidades.Cadena;
import guia9_utilidades_ejer1.servicios.CadenaService;

/**
 *
 * @author mtbst
 */
public class Guia9_utilidades_ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CadenaService cs = new CadenaService();
        
       Cadena c = cs.inicioCadena();
       
        cs.mostrarVocales(c);
        
        cs.invertirCadena(c);
        
        cs.vecesRepetido(c);
        
        cs.compararLongitud(c);
        
        cs.reemplazar(c);
        
        cs.contiene(c);
        
    }
    
}

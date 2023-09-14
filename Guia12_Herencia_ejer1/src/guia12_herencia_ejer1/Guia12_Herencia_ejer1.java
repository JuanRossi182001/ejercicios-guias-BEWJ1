/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_herencia_ejer1;

import guia12_herencia_ejer1.entidades.Animal;
import guia12_herencia_ejer1.entidades.Caballo;
import guia12_herencia_ejer1.entidades.Gato;
import guia12_herencia_ejer1.entidades.Perro;

/**
 *
 * @author mtbst
 */
public class Guia12_Herencia_ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Animal perro1 = new Perro("borja", "CARNE","PERRO",3);
        
        
        Animal gato1 = new Gato("ona", "queso","GATO",2);
        
        Animal caballo1 = new Caballo("iko", "zanahoria","CABALLO",22);
        
        
        
        perro1.Alimentarse();
        gato1.Alimentarse();
        caballo1.Alimentarse();
    }
    
}

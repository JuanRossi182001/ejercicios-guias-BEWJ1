/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_servicios_ejer3;

import guia8_servicios_ejer3.Servicios.PersonaService;
import guia8_servicios_ejer3.entidades.Persona;

/**
 *
 * @author mtbst
 */
public class Guia8_servicios_ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaService p1s = new PersonaService();
        
        Persona p1 = p1s.crearPersona();
        p1s.calcularIMC(p1);
        p1s.esMayorDeEdad(p1);
       
        System.out.println(p1);
        // TODO code application logic here
    }
    
}

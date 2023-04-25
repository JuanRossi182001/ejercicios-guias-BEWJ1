/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_servicios_ejer2;

import guia8_servicios_ejer2.entidades.Cafetera;
import guia8_servicios_ejer2.servicios.CafeteraService;

/**
 *
 * @author mtbst
 */
public class Guia8_servicios_ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // en resumen como tengo los metodos en la calse servicio
        //lo q hago es traer el servicio y luego utilizarlo
        //modificando la variable q cree con la clase Cafetera
        CafeteraService n1 = new CafeteraService();
        
        Cafetera x = n1.IniciarCafetera();
        n1.llenarCafetera(x);
        n1.servirTaza(x);
        n1.vaciarCafetera(x);
        n1.agregarCafe(x);
        
        
        
        Cafetera x2 = n1.IniciarCafetera();
        n1.llenarCafetera(x2);
        n1.servirTaza(x2);
        n1.vaciarCafetera(x2);
        n1.agregarCafe(x2);
        
        
        
    }
    
}

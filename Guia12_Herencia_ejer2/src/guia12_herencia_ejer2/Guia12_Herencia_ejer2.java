    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_herencia_ejer2;

import guia12_herencia_ejer2.entidades.Electrodomestico;
import guia12_herencia_ejer2.entidades.Lavadora;
import guia12_herencia_ejer2.entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mtbst
 */
public class Guia12_Herencia_ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double total;
       Lavadora lavadora = new Lavadora();
        Televisor tele = new Televisor();
        
        
        lavadora.CrearLavadora();
        lavadora.comprobarColor();
        lavadora.comprobarConsumo();
        lavadora.precioFinal();
        
        
        
        tele.crearTelevisor();
        tele.comprobarColor();
        tele.comprobarConsumo();
        tele.precioFinal();
        
        ArrayList<Electrodomestico> pepe = new ArrayList();
     pepe.add(tele);
     pepe.add(lavadora);
     total=tele.getPrecio()+lavadora.getPrecio();
        System.out.println("el total de gasto es de: " + total);
        System.out.println(pepe.toString());
    }
    
}

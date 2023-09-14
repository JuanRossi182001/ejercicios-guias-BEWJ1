/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_colecciones_ejer6;

import guia10_colecciones_ejer6.Servicios.AppService;

/**
 *
 * @author mtbst
 */
public class Guia10_colecciones_ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        AppService as = new AppService();
        
        as.crearProductos();
        as.showProducts();
        as.changePrice();
        as.showProducts();
        as.deleteProducts();
        as.showProducts();
        
    }
    
}

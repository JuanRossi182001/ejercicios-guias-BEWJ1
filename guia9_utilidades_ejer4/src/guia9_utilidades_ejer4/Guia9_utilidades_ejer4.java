/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_utilidades_ejer4;

import guia9_utilidades_ejer4.Service.FechaService;
import java.util.Date;

/**
 *
 * @author mtbst
 */
public class Guia9_utilidades_ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FechaService fs = new FechaService();
        Date f = fs.fechaNacimiento();
        System.out.println(f);
       Date actual = fs.fechaActual();
       fs.comparacion(actual, f);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorr;

import integradorr.Servicios.EstServicio;
import integradorr.entidades.Estudiante;
import java.util.Vector;

/**
 *
 * @author mtbst
 */
public class Integradorr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         EstServicio p = new EstServicio();
         
          
          
          p.Escuela();
          p.calcularPromedio();
          p.obtenerAlumnosSobrePromedio();
          p.mostrarAlumnosSobrePromedio();
                  
        
        }
    }
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
}   

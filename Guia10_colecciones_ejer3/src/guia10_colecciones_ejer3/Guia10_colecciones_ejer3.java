/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_colecciones_ejer3;

import guia10_colecciones_ejer3.entidades.Alumno;
import guia10_colecciones_ejer3.servicios.AlumnoService;
import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class Guia10_colecciones_ejer3 {

    /**
     * @param args the command line arguments^
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        AlumnoService as = new AlumnoService();
      as.notaFinal(as.listaAlumnos());
     
        // TODO code application logic here
    }
    
}

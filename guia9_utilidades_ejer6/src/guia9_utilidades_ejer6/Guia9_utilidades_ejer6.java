/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_utilidades_ejer6;

import guia9_utilidades_ejer6.entidades.Curso;
import guia9_utilidades_ejer6.servicios.CursoServicios;

/**
 *
 * @author mtbst
 */
public class Guia9_utilidades_ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          CursoServicios cs = new CursoServicios();
        Curso c1 = new Curso();

        c1 = cs.crearCurso(c1);

        System.out.println(cs.calcularGananciaSemanal(c1));
        // TODO code application logic here
    }
    
}

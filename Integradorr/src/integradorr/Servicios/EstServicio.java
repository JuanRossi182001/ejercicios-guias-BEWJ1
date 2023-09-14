/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorr.Servicios;

import integradorr.entidades.Estudiante;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author mtbst
 */
public class EstServicio {
   // Estudiante x = new Estudiante();
    Scanner read = new Scanner(System.in);
    
    
   // public Estudiante crearEstudiante(Estudiante x){
  //      System.out.println("Ingrese el nombre del estudiante");
  //      x.setNombre(read.next());
    //    System.out.println("Ingrese la nota del estudiante");
      //  x.setNota(read.nextInt());
        
      //  return x;
    //}
  
 //   public void CalcularPromedio(Estudiante a ,Estudiante b ,Estudiante c ,Estudiante d ,Estudiante e , Estudiante f ,Estudiante g, Estudiante h){
   //    double total;
     //  double promedio; 
       //     total=a.getNota()+b.getNota()+c.getNota()+d.getNota()+e.getNota()+f.getNota()+g.getNota()+h.getNota();
         //   promedio=total/8;
        
       // System.out.println("el promedio de notas es de: " + promedio );
    //}
    
    private Estudiante[] estudiantes;

    public void  Escuela() {
        estudiantes = new Estudiante[8];
        estudiantes[0] = new Estudiante("Juan", 8.0);
        estudiantes[1] = new Estudiante("Maria", 7.8);
        estudiantes[2] = new Estudiante("Pedro", 3.2);
        estudiantes[3] = new Estudiante("Luisa", 9.0);
        estudiantes[4] = new Estudiante("Ana", 7.9);
        estudiantes[5] = new Estudiante("Santiago", 8.1);
        estudiantes[6] = new Estudiante("Carla", 6.7);
        estudiantes[7] = new Estudiante("Pablo", 2.8);
    }

    public double calcularPromedio() {
        double total = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            total += estudiantes[i].getNota();
        }
        System.out.println("el promedio de notas de todos los estudiantes es: " + (total/estudiantes.length) );
        return total / estudiantes.length;
        
    }

    public String[] obtenerAlumnosSobrePromedio() {
        double promedio = calcularPromedio();
        ArrayList<String> nombres = new ArrayList<String>();
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedio) {
                nombres.add(estudiantes[i].getNombre());
            }
        }
        String[] resultado = new String[nombres.size()];
        for (int i = 0; i < nombres.size(); i++) {
            resultado[i] = nombres.get(i);
        }
        return resultado;
    }

    public void mostrarAlumnosSobrePromedio() {
        double promedio = calcularPromedio();
        System.out.println("Alumnos con nota mayor al promedio (" + promedio + "):");
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedio) {
                System.out.println(estudiantes[i].getNombre() + " (" + estudiantes[i].getNota() + ")");
            }
        }
    }
    
    
}

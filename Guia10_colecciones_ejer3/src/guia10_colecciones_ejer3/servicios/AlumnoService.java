/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_colecciones_ejer3.servicios;

import guia10_colecciones_ejer3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class AlumnoService {
     Scanner read = new Scanner(System.in);
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
        boolean crearAlumno = false;
   public  ArrayList<Alumno> listaAlumnos(){
    
        do {
          //  crear();
            listaAlumnos.add(crear());
            
            System.out.println("¿Desea crear otro alumno? (S/N)");
            String respuesta = read.next();
            if (!respuesta.equalsIgnoreCase("S")) {
                crearAlumno = false;
            }
            else{
                crearAlumno=true;
            }
        } while (crearAlumno);
        
        System.out.println("Lista de alumnos creados:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
      
       return listaAlumnos;
}
   
   public Alumno crear(){
       Alumno a = new Alumno();
       System.out.println("Ingrese el nombre del alumno");      
       a.setNombre(read.next());
       
       
       System.out.println("Ingrese la primer nota");
       double nota1 = read.nextDouble();
       System.out.println("Ingrese la segunda nota");
       double nota2= read.nextDouble();
       System.out.println("Ingrese la tercera nota");
       double nota3= read.nextDouble();
       
       ArrayList<Double> notas = new ArrayList();
       notas.add(nota1);
       notas.add(nota2);
       notas.add(nota3);
       a.setNotas(notas);
       
       
       return a;
   }
   
   
   public double notaFinal(ArrayList<Alumno> listaAlumnos){
       System.out.println("Indique alumno a evaluar");
       double promedio=0;
      String nombreAlumno=read.next();
        for (Alumno alumno : listaAlumnos) {
        if (alumno.getNombre().equals(nombreAlumno)) {
            double sumaNotas = 0.0;
            for (double nota : alumno.getNotas()) {
                sumaNotas += nota;
            }
           promedio= sumaNotas / alumno.getNotas().size();
            System.out.println(promedio);
            return promedio= sumaNotas / alumno.getNotas().size();     
        }
    }
        return -1;
   }
   
   
   
}
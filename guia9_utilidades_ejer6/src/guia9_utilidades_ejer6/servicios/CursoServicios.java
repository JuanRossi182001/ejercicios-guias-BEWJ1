/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_utilidades_ejer6.servicios;

import guia9_utilidades_ejer6.entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class CursoServicios {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.*/
    Curso nc = new Curso();
    public String[] cargarAlumnos(){
        String[] alumnos = new String[5];
        for  (int i=0;i<5;i++){
            System.out.println("Ingrese el nombre del alumno: ");
            alumnos[i]=leer.next();
            
        }
        
        return alumnos;
        
        
    }
    
    /*) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos*/
    public Curso crearCurso(Curso nc){
        System.out.println("Ingrese el nombre del curso");
        nc.setNombreCurso(leer.next());
        System.out.println("Ingrese el turno");
        nc.setTurno(leer.next());
        System.out.println("Ingrese la cantidad de hs por dia");
        nc.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana");
        nc.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el precio por hora");
        nc.setPrecioPorHora(leer.nextDouble());
        
        nc.setAlumnos(cargarAlumnos());
        
        return nc;
        
    }
    /*) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.*/
    
    public double calcularGananciaSemanal(Curso nc){
        
        double ganancia = nc.getCantidadHorasPorDia()*nc.getCantidadDiasPorSemana()*nc.getPrecioPorHora()*5;
        
        return ganancia;
        
        
        
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_utilidades_ejer5.PersonaService;

import guia9_utilidades_ejer5.entidades.Persona;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author mtbst
 */
public class PersonaService {
    Scanner read = new Scanner(System.in);
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre");
        String nombre = read.next();
        int anio;
        int mes;
        int dia;
        System.out.println("Ingrese su anio de nacimiento");
        anio=read.nextInt() - 1900 ; // Restamos 1900 porque en Java los años comienzan en 1900
        System.out.println("Ingrese, en numero, su mes de nacimiento  ");
        mes=read.nextInt() - 1 ;// Restamos 1 porque los meses en Java comienzan desde 0 (enero = 0)
        System.out.println("Ingrese, en numero, su dia de nacimiento");
        dia=read.nextInt();
        Date f = new Date(anio,mes,dia);
        Persona p =new Persona(nombre,f);
        return p;
    }
    
    public Date fechaActual(){
        Date fechaactual = new Date();
        System.out.println(fechaactual);
        return fechaactual;
        
    }
    
      public void comparacion(Date c, Date x){
        long resultadoP;
        resultadoP=Math.abs(c.getTime() - x.getTime());
        long resultado = TimeUnit.DAYS.convert(resultadoP, TimeUnit.MILLISECONDS)/365;
        System.out.println("La edad del usuario es " + resultado);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

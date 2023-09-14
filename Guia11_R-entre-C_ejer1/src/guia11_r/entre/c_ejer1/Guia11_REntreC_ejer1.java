/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_r.entre.c_ejer1;

import guia11_r.entre.c_ejer1.entidades.Perro;
import guia11_r.entre.c_ejer1.entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class Guia11_REntreC_ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        Persona p5 = new Persona();
        Persona p6 = new Persona();
        Perro primero = new Perro();
        Perro segundo = new Perro();
        Perro tercero = new Perro();
        Perro cuarto = new Perro();
        Perro quinto = new Perro();
        ArrayList<Perro> listaperros = new ArrayList();
        listaperros.add(quinto);
         listaperros.add(cuarto);
         listaperros.add(tercero);
         listaperros.add(segundo);
         listaperros.add(primero);
        
        // creacion manual de personas
        p1.setNombre("juan");
        p1.setApellido("Rossi");
        p1.setEdad(22);
        p1.setDni(43490537);
        
        p2.setNombre("danna");
        p2.setApellido("Magrini");
        p2.setEdad(22);
        p2.setDni(43434343);
        
        // creacion manual de perros
        primero.setEdad(2);
        primero.setName("FLOFY");
        primero.setRaza("bichon");
        primero.setTamanio(3);
        
        segundo.setEdad(4);
        segundo.setName("bruno");
        segundo.setRaza("facherito");
        segundo.setTamanio(4);
        
        tercero.setEdad(3);
        tercero.setName("auka");
        tercero.setRaza("grandanes");
        tercero.setTamanio(10);
        
        cuarto.setEdad(2);
        cuarto.setName("borja");
        cuarto.setRaza("mastin");
        cuarto.setTamanio(8);
        
        quinto.setEdad(5);
        quinto.setName("renata");
        quinto.setRaza("collie");
        quinto.setTamanio(6);
        
        
        
        
        
        
        
        
        // ahora le asigno los perros a adoptar a cada persona
        
        //p1.setPerro(primero);
        
       // p2.setPerro(segundo);
        
        
        
        // utilizo el metodo mostrar creado en persona para mostrar los datos 
        
       // p1.mostrar(p1);
       // p2.mostrar(p2);
        
        
        
        
        // Mejora del ejercicio, ahora vamos a preguntarle a cada persona que perro quiere adoptar
        
        String nombredog;
        System.out.println("Hola, mire la lista de perros y decida que perro quiere adoptar");
        System.out.println(listaperros);
        System.out.println("ingrese el nombre del perro que desea adoptar");
        nombredog=read.next();
        for (Perro perro : listaperros) {
            if (nombredog.equals(perro)) {
                listaperros.remove(perro);
            }
        }
        System.out.println(listaperros);
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

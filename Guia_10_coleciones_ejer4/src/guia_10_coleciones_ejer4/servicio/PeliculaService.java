/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_coleciones_ejer4.servicio;

import guia_10_coleciones_ejer4.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class PeliculaService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> listapelis = new ArrayList();
    
    
    public ArrayList<Pelicula> crearpelis(){
       String resp;
       boolean flag=false;
        do {
            listapelis.add(crear());
            
            System.out.println("desea seguir agregando peliculas");
            resp=read.next();
            if (resp.equalsIgnoreCase("si")) {
                flag=true;
            }
            else{
                flag=false;
            }
        } while (flag);
        System.out.println("------LISTA COMPLETA DE PELICULAS--------");
        for (Pelicula listapeli : listapelis) {
            System.out.println(listapeli);
        }
        
        return listapelis;   
    }

    public Pelicula crear(){
     Pelicula a = new Pelicula();
      ArrayList<Pelicula> pelis = new ArrayList();
     String flag;
             
        System.out.println("Ingrese el nombre de la pelicula");
        a.setTitulo(read.next());
        System.out.println("Ingrese el director de la pelicula");
        a.setDirector(read.next());
        System.out.println("Ingrese la duracion de la pelicula");
        a.setDuracion(read.nextDouble());
        pelis.add(a);
   
        return a;
             
        
        
 }
  
    public void mostrarlargas(ArrayList<Pelicula> listapelis ){
        
        System.out.println("------Lista de peliculas de mas de una hora");
        for (Pelicula pelicula : listapelis) {
            if (pelicula.getDuracion()>1) {
                System.out.println(pelicula);
            }
        }
     
}
    
    
    
    public ArrayList<Pelicula> ordenarmasAmenos(){
         Collections.sort(listapelis, Comparator.comparing(Pelicula::getDuracion));
         System.out.println("---listapelis ordenadas---");
         for (Pelicula listapeli : listapelis) {
             System.out.println(listapelis);
        }
         return listapelis;
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Comparadores.Comparadores;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

/**
 *
 * @author Digital
 */
public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList();

    public Pelicula crearPelicula() {

        String respuesta = "";

        do {
            Pelicula p = new Pelicula();

            System.out.println("Ingrese el título de la película");
            String titulo = leer.next();

            System.out.println("Ingrese el director de la película");
            String director = leer.next();

            System.out.println("Ingrese la duración de la película");
            int duracion = leer.nextInt();

            p.setTitulo(titulo);
            p.setDirector(director);
            p.setDuración(duracion);

            peliculas.add(p);

            System.out.println("Quiere ingresar otra película?");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("si"));

        return new Pelicula();

    }

    public void mostrarPeliculas() {
        System.out.println("Las películas actuales en la lista son");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = " + peliculas.size());

    }

    public void mostrarPeliculasMayorAMenor() {
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionDesc);
        System.out.println("Las películas actuales ordenadas de mayor a menor según su duración en la lista son");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }

    }

    public void mostrarPeliculasMenorAMayor() {
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionAsc);
        System.out.println("Las películas actuales ordenadas de menor a mayor según su duración en la lista son");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }

    }

    public void mostrarPeliculasTitulo() {
        Collections.sort(peliculas, Comparadores.ordenarPorTitulo);
        System.out.println("Las películas actuales ordenadas por título en la lista son");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }

    }

    public void mostrarPeliculasDirector() {
        Collections.sort(peliculas, Comparadores.ordenarPorDirector);
        System.out.println("Las películas actuales ordenadas por director en la lista son");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
    }

}

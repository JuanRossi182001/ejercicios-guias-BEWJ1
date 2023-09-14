/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ejercicio4;



import Servicios.PeliculaServicio;

/**
 *
 * @author Digital
 */
public class Guia10Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio pelis = new PeliculaServicio();
       
        pelis.crearPelicula();
        pelis.mostrarPeliculas();
        pelis.mostrarPeliculasMayorAMenor();
        pelis.mostrarPeliculasMenorAMayor();
        pelis.mostrarPeliculasTitulo();
        pelis.mostrarPeliculasDirector();
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Digital
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Integer duración;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duración) {
        this.titulo = titulo;
        this.director = director;
        this.duración = duración;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Integer getDuración() {
        return duración;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duraci\u00f3n=" + duración + '}';
    }
    
    
}

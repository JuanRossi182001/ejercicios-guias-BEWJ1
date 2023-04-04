/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_bewj1_poo_ejer1.entidades;

import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class Libro {
    // creo los atrivutos 
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPag;
    // defino el constructor 

    public Libro() {
        // contructor vacio 
    }

    public Libro(int ISBN, String titulo, String autor, int numeroPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
    }
// creo los setters
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }
    
// creo los getters 

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPag() {
        return numeroPag;
    }
  
    
// creo la funcion cargar libro
 public void CargarLibro(){
     Scanner read = new Scanner(System.in);
     
     System.out.println("colpque el ISBN de el libro");
     ISBN=read.nextInt();
    
     System.out.println("coloque el autor del libro");
        autor=read.next();
        
     System.out.println("coloque el numero de paginas del libro ");
     numeroPag=read.nextInt();
     
       
     System.out.println("coloque el titulo del libro");
     titulo=read.next();
     
 }
    
    public void informarLibro(){
        System.out.println("ISBN: " + ISBN);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroPag);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


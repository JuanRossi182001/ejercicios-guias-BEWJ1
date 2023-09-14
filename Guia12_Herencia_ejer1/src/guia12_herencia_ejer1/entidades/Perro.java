/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_herencia_ejer1.entidades;

/**
 *
 * @author mtbst
 */
public class Perro extends Animal  {

    public Perro(String nombre, String alimento, String Raza, int edad) {
        super(nombre, alimento, Raza, edad);
    }
    
    @Override
    public void Alimentarse(){
        
      System.out.println("el "  + Raza + " se alimenta de: " +  alimento);
    }
}

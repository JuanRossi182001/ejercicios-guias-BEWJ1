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
public class Animal {
    protected String nombre;
    protected String alimento;
    protected String Raza;
    protected int edad;

    public Animal() {
    }

    public Animal(String nombre, String alimento, String Raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.Raza = Raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public String getRaza() {
        return Raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", Raza=" + Raza + ", edad=" + edad + '}';
    }
    
    
    public void Alimentarse(){
        
    }
    
    
    
}

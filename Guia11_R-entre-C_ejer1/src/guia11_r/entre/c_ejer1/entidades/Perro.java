/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_r.entre.c_ejer1.entidades;

/**
 *
 * @author mtbst
 */
public class Perro {
    private String name;
    private String raza;
    private int edad;
    private int tamanio;

    public Perro() {
    }

    public Perro(String name, String raza, int edad, int tamanio) {
        this.name = name;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getName() {
        return name;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "name=" + name + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }
    
    
    
}

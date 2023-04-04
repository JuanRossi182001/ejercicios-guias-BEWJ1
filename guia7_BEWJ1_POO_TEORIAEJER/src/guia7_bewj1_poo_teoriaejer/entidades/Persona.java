/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_bewj1_poo_teoriaejer.entidades;

/**
 *
 * @author mtbst
 */
public class Persona {
    // una vez ya creada la clase aca adentro coloco todos los atributos del objeto 
    // en este caso Persona
 
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private int energia;
    // Luego de los atributos van los CONSTRUCTORES
    // el constructor tiene q tener el mismo nombre q el objeto
    public Persona(){
        
    }
// aca defini el constructor, el anterior es vacio, este tiene todos los atributos 
    public Persona(String nombre, String apellido, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.energia=1000;   // colocando esto le estoy dando por defecto 1000 de energia a cada variable q cree con el obgeto persona 
        
    }
    
    
    // ahora coloco el setter o set para poder acceder a los atributos,ya q estn privados.

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    // ahora creo los getters o get 
    public String getNombre(){
    return nombre;
}

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }
    
    
    
    
    
    // ahora como ejemplo voy a crear una funcion o metodo dentro del objeto persona 
    
    public int correr(int energiaRestar){ // va a restar la cantidad de energia q le pongan entre parentesis cuando llamen la funcion 
        this.energia-=energiaRestar;              // con esta funcion cree que cuando el objeto utilice la funcion correr
                                                  // perdera energia 
        return energia;
    }
    
    public int correrPro(int energiaRestar, int vueltas){
        for (int i = 0; i < vueltas; i++) {
            energia -=energiaRestar;
        }
        return energia;
    }
    
    
    // ahora necesito crear el ToString para cuando llame a la varibale creada con el objeto
    // me muestre todos los atributos

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", energia=" + energia + '}';
    }
    
}

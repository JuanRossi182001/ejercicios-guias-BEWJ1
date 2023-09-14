/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_herencia_ejer2.entidades;

import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class Electrodomestico {
    Scanner read = new Scanner(System.in);
    protected double precio;
    protected String color;
    protected String ConsE;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, String ConsE, int peso) {
        this.precio = precio;
        this.color = color;
        this.ConsE = ConsE;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public String getConsE() {
        return ConsE;
    }

    public int getPeso() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsE(String ConsE) {
        this.ConsE = ConsE;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void comprobarConsumo(){
        if (ConsE.equalsIgnoreCase("a") || ConsE.equalsIgnoreCase("b") || ConsE.equalsIgnoreCase("c") || ConsE.equalsIgnoreCase("d") ||  ConsE.equalsIgnoreCase("e") ||  ConsE.equalsIgnoreCase("f")   ) {
          
        }else{
            System.out.println("la letra de consumo que coloco no existe, se colocara consumo F por defecto");
            ConsE="F";
        }
    }
    
    
    
    public void comprobarColor(){
        if (color.equalsIgnoreCase("blanco") ||color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris") ) {
            
        }else{
            System.out.println("el color ingresado es incorrecto, se colocara color blacno por defecto");
            color="blanco";
        }
    }
    
    
    
    public void crearE(){
        System.out.println("ingrese el color de su electrodomestico");
        color=read.next();
        System.out.println("ingrese el consumo energetico de su electrodomestico");
        System.out.println("Las opciones son: A, B, C, D, E, F");
        ConsE=read.next();
        System.out.println("Indique el peso de su electrodomestico");
        peso=read.nextInt();
    }
    
    
    
    public void precioFinal(){
        precio=1000;
        if (ConsE.equalsIgnoreCase("a")) {
            precio +=1000;
        }else if (ConsE.equalsIgnoreCase("b")) {
            precio +=800;
        }else if (ConsE.equalsIgnoreCase("c")) {
            precio +=600;
        }else if (ConsE.equalsIgnoreCase("d")) {
              precio +=500;
        }else if (ConsE.equalsIgnoreCase("e")) {
            precio +=300;
        }else if (ConsE.equalsIgnoreCase("f")) {
            precio+=100;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "read=" + read + ", precio=" + precio + ", color=" + color + ", ConsE=" + ConsE + ", peso=" + peso + '}';
    }
    
    
    
    
}

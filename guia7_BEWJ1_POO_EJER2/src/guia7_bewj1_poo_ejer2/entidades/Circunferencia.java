/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_bewj1_poo_ejer2.entidades;

import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia() {
        // creo atributos de la clase
        
        this.radio = 0;
    }
    
    public double CrearCircunferencia(){ // creo  constructor 
        System.out.println("ingrese el radio de la circunferencia");
        radio=read.nextDouble();
        return radio;
    }
      
   Scanner read = new Scanner(System.in);
   // creo getters y setters 

    public double getRadio() {
        return radio;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }
    // creo los metodos para sacar area y perimetro 
   
    public void Area(){
        double area;
        area=2.1416*radio*radio; 
        System.out.println("El area de la circunferencia es:" + area);
        
    }
   
    public void Perimetro(){
        double peri;
        double pi = 2.1416;
        peri=2*pi*radio;
        System.out.println("El perimetro de la circunferencia es: " + peri);
    }
   
   
}

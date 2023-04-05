/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_bewj1_poo_ejer3.entidades;

import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class Operacion {
    // ATRIBUTOS
    
    private double num1;
    private double num2;
    
    // CONSTRUCTORES
    
    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
        this.num1=0;
        this.num2=0;
    }
    
// GETTERS Y SETTERS

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public Scanner getRead() {
        return read;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    Scanner read = new Scanner(System.in);
    
    // METODOS 
    
    public void CrearOperacion(){
        System.out.println("coloque el numero 1");
        num1=read.nextInt();
        System.out.println("coloque el numero 2");
        num2=read.nextInt();
        
    }
    
    public double Sumar(){
        return num1 + num2;
    }
    
    public double Restar(){
        return num1-num2;
    }
    
    public double Multiplicar(){
        if (num2==0) {
            System.out.println("FATAL ERROR, no se puede multiplicar por 0");
            return 0;
        }
        else{
            return num1 * num2;
        }
    }
    
    public double Dividir(){
        if (num2==0) {
            System.out.println("FATAL ERROR, no se puede dividir por 0");
           return 0;
        }
        else{
           return num1/num2;
            
        }
    }

   
    
    
    
    
}

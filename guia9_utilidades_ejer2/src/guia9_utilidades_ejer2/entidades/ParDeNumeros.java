/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_utilidades_ejer2.entidades;
import java.util.Random;
/**
 *
 * @author mtbst
 */
public class ParDeNumeros {
    
    private double num1;
    private double num2;
 // constructor 
    public ParDeNumeros() {
        this.num1= Math.random() *100 + 1;
        this.num2 = Math.random() *100 + 1;
    }
    
    // gettters & setters 

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "ParDeNumeros{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_utilidades_ejer2.ParService;

import guia9_utilidades_ejer2.entidades.ParDeNumeros;

/**
 *
 * @author mtbst
 */
public class ParService {
 
    public ParDeNumeros mostrar(){
        ParDeNumeros p = new ParDeNumeros();
        System.out.println(p.getNum1());
        System.out.println(p.getNum2());
        return p;
    }
    
    
    
    public void devolverMayor(ParDeNumeros p){
        if (p.getNum1()>p.getNum2()) {
            System.out.println("El numero mas grande es numero 1 " + p.getNum1());
        }else{
            System.out.println("El numero mas grande es numero 2 " + p.getNum2());
        }
        
    }
    
    public void calcularPotencia(ParDeNumeros p){
         if (p.getNum1()>p.getNum2()) {
           double result;
           result=Math.pow(p.getNum1(), p.getNum2());
            result = Math.round(result * 100.0) / 100.0;
             System.out.println("El resultado de la potencia de num1 elevado a num2 es: " + result);
        }else{
            double result;
            result=Math.pow(p.getNum2(), p.getNum1());
            result = Math.round(result * 100.0) / 100.0;
             System.out.println("El resultado de la potencia de num2 elevado a num1 es: " + result);
        }
    }
    
    public void calcularRaiz(ParDeNumeros p){
         if (p.getNum1()<p.getNum2()) {
           Math.abs(p.getNum1());
             System.out.println("El resultado de la raiz cuadrada de num1 es: ");
             System.out.println(Math.sqrt(p.getNum1()));
           
        }else{
            Math.abs(p.getNum2());
            System.out.println("El resultado de la raiz cuadrada de num2 es: ");
             System.out.println(Math.sqrt(p.getNum2())); 
        }
    }
    
}

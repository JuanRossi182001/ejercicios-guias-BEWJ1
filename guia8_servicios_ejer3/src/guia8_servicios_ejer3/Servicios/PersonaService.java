/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_servicios_ejer3.Servicios;

import guia8_servicios_ejer3.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class PersonaService {
    private int edad;
    private double peso;
    private double altura;
    private Scanner read = new Scanner(System.in);
    public Persona crearPersona(){    // todos los metodos de creacion deben ser con return por q sino no voy a poder inniciar en el main
        System.out.println("ingrese su nombre");
        String a= read.next();
        System.out.println("ingrese su edad");
        edad =read.nextInt();
        System.out.println("ingrese su sexo");
        char c = read.next().charAt(0);
        System.out.println("ingrese su altura");
      altura= read.nextDouble();
        System.out.println("ingrese su peso");
        peso = read.nextInt();
        Persona p1 = new Persona(a,edad,c,altura,peso);
        return p1;
    }
    
    
    public void esMayorDeEdad(Persona px){
        boolean x;
        if (edad>18) {
            x=true;
        }
        else{
            x=false;
        }
       
    }
    
    public void calcularIMC(Persona px){
        double IMC;
      IMC= peso/altura*altura;
        if (IMC<20) {
            IMC=-1;
        }
        if (IMC>20 && IMC<25) {
            IMC=0;
        }
        else{
            IMC=1;
        }  
}

}








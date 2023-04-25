/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_bewj1_poo_ejerx3.ENTIDADES;

import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class Juego {
    private String jugador1;
    private String jugador2;
    private int NumeroP1;
    private int NumeroP2;
    
    
    // constructores 

    public Juego() {
    }

    public Juego(String jugador1, String jugador2, int NumeroP1, int NumeroP2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.NumeroP1 = NumeroP1;
        this.NumeroP2 = NumeroP2;
    }
    
    // getters & setters 

    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public int getNumeroP1() {
        return NumeroP1;
    }

    public int getNumeroP2() {
        return NumeroP2;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public void setNumeroP1(int NumeroP1) {
        this.NumeroP1 = NumeroP1;
    }

    public void setNumeroP2(int NumeroP2) {
        this.NumeroP2 = NumeroP2;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // creamos metodo iniciar juego, donde va a ir toda la logica del programa
    
    public void Iniciar_juego(){
        Scanner read = new Scanner(System.in);
        int cont=0;
        System.out.println("----------Welcome to the guessing game--------------");
        System.out.println("player 1 put the number to guess");
        NumeroP1=read.nextInt();
        System.out.println("player 2 please try to guess the magic number");
        NumeroP2=read.nextInt();
        do {
            if (NumeroP2==NumeroP1) {
                System.out.println("excellent you guessed the number");
                cont = cont + 1;
                break;
            }
            else if (NumeroP2>NumeroP1) {
                System.out.println("fail,the magic number is smaller ");
                  cont = cont + 1;
                  System.out.println("try again");
                   NumeroP2=read.nextInt();
            }
            else if (NumeroP2<NumeroP1) {
                System.out.println("fail,the magic number is bigger");
                  cont = cont + 1;
                  System.out.println("try again");
                   NumeroP2=read.nextInt();
            }
        } while (cont<5); 
        
        if (cont<5) {
            System.out.println("congratuliations you did it in " + cont +" tries");
        }
        if (cont==5) {
            System.out.println("you fail player 1 wins");
        }
        
        
    }

    @Override
    public String toString() {
        return "Juego{" + "jugador1=" + jugador1 + ", jugador2=" + jugador2 + ", NumeroP1=" + NumeroP1 + ", NumeroP2=" + NumeroP2 + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}






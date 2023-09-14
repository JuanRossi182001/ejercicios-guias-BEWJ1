/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_r.entre.c_ejer2;


import guia11_r.entre.c_ejer2.entidades.Juego;
import guia11_r.entre.c_ejer2.entidades.Jugador;
import guia11_r.entre.c_ejer2.entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class Guia11_REntreC_ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de jugadores, entre 1 y 6");
        int cantJugadores=read.nextInt();
        
        if (cantJugadores < 1 || cantJugadores > 6) { // con esto si pone menos q 1 o mas q 6 por defecto pone 6
            
            cantJugadores = 6;
        }
        
        ArrayList<Jugador> jugadores = new ArrayList();
        
        for (int i = 1; i < cantJugadores; i++) {
            Jugador n  = new Jugador();
            jugadores.add(new Jugador(i));
        }   
        System.out.println("Los jugadores son: " + jugadores);
        
        
        
        Revolver revolver = new Revolver();
        revolver.llenarrevolver();
        
        Juego j = new Juego();
        j.llenarjuego(jugadores, revolver);
        j.ronda();
    
        
        
    }
    
}

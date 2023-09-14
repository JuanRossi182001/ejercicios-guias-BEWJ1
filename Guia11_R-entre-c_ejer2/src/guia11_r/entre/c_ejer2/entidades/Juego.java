/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_r.entre.c_ejer2.entidades;

import java.util.ArrayList;

/**
 *
 * @author mtbst
 */
public class Juego {
   private ArrayList<Jugador> jugadores;
   private Revolver revolver;
   
   public Juego() {
    }
    
    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
   
   
   // methods
    
    
    public void llenarjuego(ArrayList<Jugador> jugadores,Revolver r){
       this.jugadores = jugadores;
        this.revolver = r;
    }
   
   public void ronda(){
        boolean alguienMojado = false;

        while (!alguienMojado) {
            for (Jugador jugador : jugadores) {
                System.out.println(jugador);
                alguienMojado = jugador.disparo(revolver);
                System.out.println(revolver);

                if (alguienMojado)
                    break;
            }
        }

        for (Jugador jugador : jugadores) {
            if (jugador.estaMojado()) {
                System.out.println("¡" + jugador + " se ha mojado!");
                break;
            }
        }
   }
}

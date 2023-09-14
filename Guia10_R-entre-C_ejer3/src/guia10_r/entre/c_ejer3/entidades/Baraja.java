/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_r.entre.c_ejer3.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mtbst
 */
public class Baraja {
     private List<Carta> cartas;
     private int indice=0;
     
     
    public Baraja() {
        cartas = new ArrayList<>();
        String[] palos = {"espadas", "bastos", "oros", "copas"};

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    Carta carta = new Carta(numero, palo);
                    cartas.add(carta);
                }
            }
        }
        indice=0;
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }

    public Carta siguienteCarta() {
        if (indice < cartas.size()) {
            Carta siguienteCarta = cartas.get(indice);
            indice++;
            return siguienteCarta;
        } else {
            System.out.println("No hay más cartas disponibles.");
            return null;
        }
    }

    public int cartasDisponibles() {
        return cartas.size() - indice;
    }
    
    
}

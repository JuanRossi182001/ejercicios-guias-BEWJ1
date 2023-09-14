/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaisesServicio;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import java.util.Iterator;

/**
 *
 * @author Digital
 */
public class PaisesServicio {

    Scanner leer = new Scanner(System.in);
    HashSet<String> paises = new HashSet();

    String resp = "";

    public void ingresarPaises() {
        do {
            System.out.println("Ingrese nombre del país");
            String nombrePais = leer.next();

            paises.add(nombrePais);

            System.out.println("Quiere guardar otro país?");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("Si"));
    }

    public void mostrarPaises() {
        for (String aux : paises) {
            System.out.println(aux);
        }
        System.out.println("------------------------------------------");
    }

    public void paisesOrdenados() {
        TreeSet<String> paisOrdenado = new TreeSet(Collections.reverseOrder());
        paisOrdenado.addAll(paises);

        for (String aux : paisOrdenado) {
            System.out.println(aux);
        }

    }

    public void eliminarPaises() {
        
        System.out.println("Ingrese país que quiera eliminar");
        String pais = leer.next();
        Iterator<String> iterador = paises.iterator();
        boolean encontrado = false;
        while (iterador.hasNext()) {
            String p = iterador.next();
            
            if (p.equalsIgnoreCase(pais)) {
                iterador.remove();
                encontrado = true;
                System.out.println("Pais eliminado: " + p);
                mostrarPaises();
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El pais no esta en el conjunto.");
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_backendwithjava1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Leer 5 palabras del usuario
        String[] palabras = new String[5];
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese la palabra " + (i+1) + " (entre 3 y 5 caracteres): ");
            palabras[i] = scanner.next();
            // Verificar que la palabra tenga entre 3 y 5 caracteres
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("Error: la palabra debe tener entre 3 y 5 caracteres. Ingrese nuevamente: ");
                palabras[i] = scanner.next();
            }
        }
        scanner.close();

        // Crear la sopa de letras
        char[][] sopa = new char[20][20];

        // Colocar las palabras en posiciones aleatorias
        for (String palabra : palabras) {
            // Seleccionar una posición aleatoria para la primera letra de la palabra
            int fila = random.nextInt(20);
            int columna = random.nextInt(20);
            // Verificar que la palabra se pueda colocar en esa posición (no se sale de la matriz ni choca con otra palabra)
            while (columna + palabra.length() > 20 || 
                   Arrays.stream(sopa[fila], columna, columna+palabra.length()).anyMatch(c -> c != 0)) {
                fila = random.nextInt(20);
                columna = random.nextInt(20);
            }
            // Colocar la palabra en la matriz
            for (int i = 0; i < palabra.length(); i++) {
                sopa[fila][columna+i] = palabra.charAt(i);
            }
        }

        // Rellenar los espacios no utilizados con '0'
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = '0';
                }
            }
        }

        // Imprimir la sopa de letras por pantalla
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
        
        // TODO code application logic here
    }
}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_backendwithjava1_TeoriaEjer;

import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = input.nextInt();
        input.close();
        boolean esPrimo = esPrimo(numero);
        if (esPrimo) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i ==0) {
                return false;
            }
        }
        return true;
    }
        

        // TODO code application logic here
    }
    


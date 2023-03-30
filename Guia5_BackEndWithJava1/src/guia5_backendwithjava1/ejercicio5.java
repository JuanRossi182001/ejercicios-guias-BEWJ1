/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_backendwithjava1;

/**
 *
 * @author mtbst
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
        y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
        se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
         */

        int[][] matriz = {{0, 1, -2}, {-1, 0, 3}, {2, -3, 0}};
        int[][] matrizT = new int[3][3];
        
        mostrar(matriz);
        mostrarT(matriz);
        matrizT = hacerT(matriz);

        if (compararM(matriz, matrizT)) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }

    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void mostrarT(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println(" ");
        }
    }

    public static int[][] hacerT(int[][] matriz) {
        int[][] transp = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transp[j][i] = matriz[i][j];
            }
        }
        return transp;
    }

    public static boolean compararM(int[][] mat1, int[][] mat2) {
        boolean bool = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat2[i][j] == -(mat1[i][j])) {
                    bool = true;
                } else {
                    return false;
                }
            }
        }
        return bool;
    }
}

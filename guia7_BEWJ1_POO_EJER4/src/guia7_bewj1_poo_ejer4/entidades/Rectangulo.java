/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_bewj1_poo_ejer4.entidades;

import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class Rectangulo {
    
    private double base;
    private double altura;

    // Constructor con todos los atributos pasados por parámetro
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Constructor sin los atributos pasados por parámetro
    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    // Métodos get y set
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para crear el rectángulo con los datos del usuario
    public void crearRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        this.base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        this.altura = scanner.nextDouble();
        scanner.close();
    }

    // Método para calcular la superficie del rectángulo
    public double calcularSuperficie() {
        return this.base * this.altura;
    }

    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }

    // Método para dibujar el rectángulo con asteriscos
    public void dibujarRectangulo() {
        for (int i = 1; i <= this.altura; i++) {
            for (int j = 1; j <= this.base; j++) {
                if (i == 1 || i == this.altura || j == 1 || j == this.base) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_colecciones_ejer6.Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class AppService {
    Scanner read = new Scanner(System.in);
    HashMap<String, Double> productos = new HashMap();
    
    
    
    public void crearProductos() {
        double precio;
        String producto;
        String resp = "";

        do {
            System.out.println("Ingrese el producto");
            producto = read.next();
            System.out.println("Ingrese el valor del producto");
            precio = read.nextDouble();

            productos.put(producto, precio);

            System.out.println("Desea ingresar otro producto?");
            resp = read.next();

        } while (resp.equalsIgnoreCase("si"));

    }
    
    
    
    
    
    public void changePrice() {
        do {
              System.out.println("Ingrese el nombre del producto para modificar su precio");
        String producto;
        Double precio;
        producto = read.next();
          if (productos.containsKey(producto)) {
            System.out.println("Ingrese el precio nuevo");
        precio = read.nextDouble();
        productos.put(producto, precio);
           System.out.println("El nuevo precio para " + producto + "es de: " + precio);
           break;
        }
        else{
            System.out.println("El producto no fue encontrado");
        }
        } while (true);
        
      
       
        
    }
    
    
    
       public void showProducts() {
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            System.out.println("El producto es: " + aux.getKey());
            System.out.println("Su precio es: " + aux.getValue());
        }
    }


    public void deleteProducts(){
        System.out.println("Ingrese el nombre del producto a eliminar");
        String deleteproducto;
        deleteproducto=read.next();
        if (productos.containsKey(deleteproducto)) {
            productos.remove(deleteproducto);
        }
        else{
            System.out.println("El producto no fue encontrado");
        }
    }
    
}

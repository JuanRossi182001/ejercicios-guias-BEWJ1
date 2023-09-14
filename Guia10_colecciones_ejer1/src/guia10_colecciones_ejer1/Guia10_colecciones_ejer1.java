/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_colecciones_ejer1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mtbst
 */
public class Guia10_colecciones_ejer1 {
    // Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
   // programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
   // después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    //salir, se mostrará todos los perros guardados en el ArrayList.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        boolean flag = false;
        String res;
         ArrayList<String> razasperro = new ArrayList();
        
        while(flag==false){
            System.out.println("ingrese una raza de perro");
            String raza;
            raza=read.next();
            razasperro.add(raza);
            System.out.println("Genial,Desea agregar otra raza de perro?");
            System.out.println("ingrese SI para continuar o NO para salir y mostrar la lista");
            res=read.next();
            if (res.equalsIgnoreCase("si")) {
                flag=false;
            }
            else if(res.equalsIgnoreCase("no")){
                  Iterator it = razasperro.iterator();
                while(it.hasNext()){ // siempre q hasnext sea true, va a dar true siempre que tenga un elemento que no haya leido todavia 
                    System.out.println(it.next() + " "); // utilizo it.next en un sout para mostrar los elementos de la lista
                }
                flag=true;
            }
            else{
                System.out.println("respuesta incorrecta");
                flag=false;
            }
        }
        
        
        
        
        
        Iterator it = razasperro.iterator();
        String perro;
        System.out.println("ingrese una raza a eliminar");
        perro=read.next();
        while(it.hasNext()){
            if (it.next().equals(perro)) {
                it.remove();
                Collections.sort(razasperro);
                it=razasperro.iterator(); // reiniciar el iterator para mostrar los elementos actualizados
                 while(it.hasNext()){ // siempre q hasnext sea true, va a dar true siempre que tenga un elemento que no haya leido todavia 
                    System.out.println(it.next() + " "); // utilizo it.next en un sout para mostrar los elementos de la lista
                }
            }
            else {
                
                System.out.println("su raza no se encuentra en la lista");
                Collections.sort(razasperro);
                it=razasperro.iterator();
                 while(it.hasNext()){ // siempre q hasnext sea true, va a dar true siempre que tenga un elemento que no haya leido todavia 
                    System.out.println(it.next() + " "); // utilizo it.next en un sout para mostrar los elementos de la lista
                }
            }
        }
        
        
        
        
        
        
    }
    
}

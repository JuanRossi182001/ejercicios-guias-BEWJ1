/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_bewj1_poo_teoriaejer;

import guia7_bewj1_poo_teoriaejer.entidades.Persona;

/**
 *
 * @author mtbst
 */
public class Guia7_BEWJ1_POO_TEORIAEJER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // utilizo el constructor 
        Persona juan = new Persona("juan", "Rossi", 21, "43.490.537"); // haciendo esto creo juan utilizando el objeto (molde) persona 
        
      // supongamos q ahora quiero modificar el atributo nombre de el objeto persona 
      // lo hago utilizando un setter, que ya esta creado anteriormente en el objeto 
      juan.setNombre("pedro");
        System.out.println(juan); // con este sout gracias a q cree el ToString me muestra todos los atributos del objeto persona
        // si no creara el metodo ToString en el objeto persona, con este sout me mostraria el espacio en memoria de la variable juan 
        
        // si yo quisiera mostrar un atributo con un sout o algo necesito usar un getter o get, ya q los atrivutos son privados
        System.out.println(juan.getNombre());
        
        
        // utilizo la funcion que le agrege al objeto persona, en este caso es correr
        juan.correr(100);
        
        System.out.println(juan);
        // ahora con ese sout se va a ver como se le resto 100 de energia 
        
        juan.correrPro(100, 5); // aca utilizando el pro le hice gastar 100 de energia por 5 vueltas 
        
        
        System.out.println(juan);
        
        
        // TODO code application logic here
    }
    
}

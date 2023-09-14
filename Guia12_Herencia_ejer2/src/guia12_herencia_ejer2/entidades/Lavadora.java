/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_herencia_ejer2.entidades;

/**
 *
 * @author mtbst
 */
public class Lavadora  extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int precio, String color, String ConsE, int peso, int carga) {
        super(precio, color, ConsE, peso);
        this.carga=carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void CrearLavadora(){
        crearE();
        System.out.println("Ingrese la carga de la lavadora");
        carga=read.nextInt();
    }
    
    @Override
    public void precioFinal(){
          precio=1000;
        if (ConsE.equalsIgnoreCase("a")) {
            precio +=1000;
        }else if (ConsE.equalsIgnoreCase("b")) {
            precio +=800;
        }else if (ConsE.equalsIgnoreCase("c")) {
            precio +=600;
        }else if (ConsE.equalsIgnoreCase("d")) {
              precio +=500;
        }else if (ConsE.equalsIgnoreCase("e")) {
            precio +=300;
        }else if (ConsE.equalsIgnoreCase("f")) {
            precio+=100;
        }
        if (carga>30) {
            precio=precio+500;
        }
        else{
            
        }
         System.out.println("El precio de su lavadora es de: " + precio);
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    
    
    
}

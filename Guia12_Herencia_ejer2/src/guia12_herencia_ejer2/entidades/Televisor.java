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
public class Televisor extends Electrodomestico {
    private int res;
    private boolean tdt;

    public Televisor(int res, boolean tdt, int precio, String color, String ConsE, int peso) {
        super(precio, color, ConsE, peso);
        this.res = res;
        this.tdt = tdt;
    }

    public Televisor() {
    }

    public int getRes() {
        return res;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
    public void crearTelevisor(){
        crearE();
        System.out.println("Ingrese la resolucion en pulgadas de su televisor ");
        res=read.nextInt();
        System.out.println("su televisor tiene tdt?, coloque true o false");
        tdt=read.nextBoolean();
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
        if (res>40) {
            precio=precio*0.3;
        }else if(tdt==true) {
            precio=precio+500;
        }else if(res>40 && tdt==true){
            precio=precio+500;
            precio=precio + precio*0.3;
        }
        
        System.out.println("El precio de su televisor es de: " + precio);
    }

    @Override
    public String toString() {
        return "Televisor{" + "res=" + res + ", tdt=" + tdt + '}';
    }
    
    
    
}

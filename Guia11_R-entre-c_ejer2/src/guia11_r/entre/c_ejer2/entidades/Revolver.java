/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_r.entre.c_ejer2.entidades;

import java.util.Random;

/**
 *
 * @author mtbst
 */
public class Revolver {
    private int posactual;
    private int posagua;

    public Revolver() {
    }

    public Revolver(int posactual, int posagua) {
        this.posactual = posactual;
        this.posagua = posagua;
    }

    public int getPosactual() {
        return posactual;
    }

    public int getPosagua() {
        return posagua;
    }

    public void setPosactual(int posactual) {
        this.posactual = posactual;
    }

    public void setPosagua(int posagua) {
        this.posagua = posagua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posactual=" + posactual + ", posagua=" + posagua + '}';
    }
    
    //methods
    
    
    public void llenarrevolver(){
        Random random = new Random();
        posactual=random.nextInt(6) + 1;
        posagua=random.nextInt(6) + 1;
    }
    
    public boolean mojar(){
        boolean flag;
        if (posactual==posagua) {
            flag=true;
        }else{
            flag=false;
        }
            
        return flag;
    }
    
    public void siguientebala(){
        if (posactual>5) {
             posactual=1;
        }
        else if (posactual==5) {
            posactual=posactual+1;
        }
        else if (posactual<5) {
             posactual=posactual+1;
        }
    }
    
    
    public void mostrar(Revolver r){
        System.out.println(r);
    }
    
}

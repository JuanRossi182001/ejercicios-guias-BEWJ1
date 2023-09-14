/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_r.entre.c_ejer2.entidades;

/**
 *
 * @author mtbst
 */
public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Jugador() {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    // methods
    
    public boolean disparo(Revolver R){
       R.siguientebala();
        if (R.mojar()) {
            mojado=true;
            return true;
        }
        else{
            return false;
        }
    }
    
      public boolean estaMojado() {
        return mojado;
    }
    
    
}

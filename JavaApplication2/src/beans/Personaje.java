/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

/**
 *
 * @author black
 */
public class Personaje {
    private String nombre;
    private int energia;

    public Personaje(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
    }
    public Personaje(){
    }
    
    public void alimentarse(){
    }
    
    public void toNumPersonajes(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public void atacar(){
        this.energia -= 20;
    }
    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", energia=" + energia + '}';
    }
    
}

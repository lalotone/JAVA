/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

/**
 *
 * @author lalotone
 */
public abstract class Personaje implements IPersonaje{
    private String nombre;
    private int energia; 
    private int contPersonajes;

    public Personaje(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
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
    static void toNumPersonajes(){};
    abstract void tipoDePersonaje();

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", energia=" + energia + '}';
    }
    
}

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
abstract class  Personaje implements IPersonaje{
    //Atributos
    private String nombre;
    private int energia;

    //Constructor
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.energia = cantEnergia;
    }
    public Personaje(){
    }
    //Metodos
    static void toNumPersonajes(){}
    abstract void tipoDePersonaje();

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", energia=" + energia + '}';
    }
    
}

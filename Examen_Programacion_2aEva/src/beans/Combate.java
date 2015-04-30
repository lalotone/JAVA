/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import beans.Personaje;
import beans.Combate;
import beans.Mago;
import beans.Guerrero;
/**
 *
 * @author lalotone
 */
public class Combate{

    private String nombre;
    private ArrayList<Personaje> operar;

    public Combate(ArrayList<Personaje> operar) {
        this.operar = operar;
    }

   

    public Combate() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addPersonaje() {
        
    }

    public void delPersonaje() {

    }

    public void ejecutarCombate() {
        
    }

    public void mostrarVs() {
        for (int i = 0; i < operar.size(); i++) {
            System.out.println(operar.get(i).toString());
        }
    }

    @Override
    public String toString() {
        return "Combate{" + "nombre=" + nombre + '}';
    }

}

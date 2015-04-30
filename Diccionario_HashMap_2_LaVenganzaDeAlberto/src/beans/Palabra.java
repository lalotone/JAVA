/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.util.ArrayList;

/**
 *
 * @author lalotone
 */
public class Palabra {
    private String nombre;
    ArrayList definicion = new ArrayList();

    public Palabra(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void anyadirDefinicion(String cosa){
        definicion.add(cosa);
    }
    public void listaDefs(){
        for (int i = 0; i < definicion.size(); i++) {
            System.out.println("Nombre: "+nombre+"Definiciones: "+definicion);
        }
    }
    
}

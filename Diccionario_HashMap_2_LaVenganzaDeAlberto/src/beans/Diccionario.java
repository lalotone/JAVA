/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author lalotone
 */
public class Diccionario {

    HashMap<String, Palabra> enciclopedia = new HashMap<String, Palabra>();

    public Diccionario() {
    }

    public void anyadirPalabra(String nombre) {
        Palabra palabra = new Palabra(nombre);
        enciclopedia.put(nombre, palabra);
    }

    public void anyadirDefinicion(String nombre, String definicion) {
        enciclopedia.get(nombre).anyadirDefinicion(definicion);
    }

    public void devolverTodos() {
        Iterator devolver = enciclopedia.values().iterator();
        while (devolver.hasNext()) {
            Palabra palabraAux = (Palabra)devolver.next();
            palabraAux.listaDefs();
        }

    }
}

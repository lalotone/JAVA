/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diccionario_27214;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lalotone
 */
public class Palabra {
    private String nombre;
    private ArrayList<String> definiciones;
    
    public Palabra(String nuevaPalabra){
    this.nombre = nuevaPalabra;
    this.definiciones =new ArrayList<String>();
    }
    
    public void anadeDefinicion(String nuevaDefinicion){
    this.definiciones.add(nuevaDefinicion);
    }
    public void quitarDefinicion(int indice){
    this.definiciones.remove(indice);
    }
    public void imprimeDefiniciones() {
            String definicion;
            
            System.out.println("\n" + nombre);
            Iterator listaDefiniciones =definiciones.iterator();
            while(listaDefiniciones.hasNext()){
                definicion = (String)listaDefiniciones.next();
                int indice = definiciones.indexOf(definicion);
                System.out.println("["+ indice +"]" + definicion);
                
            }
            
    }
}

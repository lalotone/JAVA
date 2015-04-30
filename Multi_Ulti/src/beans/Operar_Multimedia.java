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
public class Operar_Multimedia {

    ArrayList<Multimedia> operar;

    public Operar_Multimedia(ArrayList<Multimedia> operar) {
        this.operar = operar;
    }

    public void mostrarLista(ArrayList<Multimedia> operar) {
        for (int i = 0; i < operar.size(); i++) {
            System.out.println(operar.get(i).toString());
        }
    }

    public void instanceOf() {
        for (int i = 0; i < operar.size(); i++) {
            if (operar.get(i) instanceof Pelicula) {
                System.out.println("Soy una palicula!");
            } else if (operar.get(i) instanceof Fotos) {
                System.out.println("Soy fotolussss");
            }
        }
    }
}

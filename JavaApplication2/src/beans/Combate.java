/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author black
 */
public class Combate {

    private String nombre;
    ArrayList<Personaje> combatir;
    Random rd = new Random();

    public Combate() {

    }

    public Combate(ArrayList<Personaje> combatir) {
        this.combatir = combatir;
    }

    public void mostrarLista() {

        for (int i = 0; i < combatir.size(); i++) {
            if (combatir.get(i) instanceof Mago) {
                System.out.println("Combate numero: " +(i+1));
                System.out.println(combatir.get(i).toString());
                for (int j = 0; j < combatir.size(); j++) {
                    if (combatir.get(j) instanceof Guerrero) {
                        System.out.println(combatir.get(j).toString());
                    }
                }

            } else {
                System.out.println("Combate numero: " +(i+1));
                System.out.println(combatir.get(i).toString());
                for (int j = 0; j < combatir.size(); j++) {
                    if (combatir.get(j) instanceof Mago){
                        System.out.println(combatir.get(j).toString());
                    }
                }
            }
        }
    }

}


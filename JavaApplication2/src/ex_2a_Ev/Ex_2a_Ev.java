/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_2a_Ev;

import beans.Guerrero;
import beans.Mago;
import beans.Personaje;
import java.util.ArrayList;
import java.util.Random;
import beans.*;

/**
 *
 * @author black
 */
public class Ex_2a_Ev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje[] array = new Personaje[4];
        Personaje guerrero = new Guerrero();
        Personaje mago = new Mago();
        Random rd = new Random();
        ArrayList<Personaje> listaCombate = new ArrayList();
        Combate combatir = new Combate(listaCombate);
        String[] arma = new String[8];
        arma[0] = "cuchillo";
        arma[1] = "laser";
        arma[2] = "espada";
        arma[3] = "patada";
        arma[4] = "puño";
        arma[5] = "luz";
        arma[6] = "pistola";
        arma[7] = "conjuro";

        array[0] = new Mago("Moncho", 150);
        array[1] = new Mago("Gaspar", 150);
        array[2] = new Guerrero("Arturo", 150);
        array[3] = new Guerrero("Lalo", 150);

        for (int i = 0; i < array.length; i++) {
            for (int z = 0; z < 3; z++) {
                if (array[i] instanceof Mago) {
                    Mago vary = (Mago) array[i];
                    vary.addArma(arma[rd.nextInt(8)]);
                } else if (array[i] instanceof Guerrero) {
                    Guerrero varx = (Guerrero) array[i];
                    varx.addArma(arma[rd.nextInt(8)]);
                }
            }

        }

        for (int i = 0; i < array.length; i++) {
            listaCombate.add(array[i]);
        }

//        for (int i = 0; i < listaCombate.size(); i++) {
//            System.out.println(listaCombate.get(i).toString());
//        }
        combatir.mostrarLista();
    }

}

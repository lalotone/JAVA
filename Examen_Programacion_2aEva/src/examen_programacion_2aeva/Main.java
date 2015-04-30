/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_programacion_2aeva;

import beans.Combate;
import beans.Mago;
import beans.Guerrero;
import beans.Personaje;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author lalotone
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rd = new Random(4);
        int a, b, c, d;
        ArrayList listaPersonajes = new ArrayList();
        
        Personaje guerrero = new Guerrero();
        Personaje mago = new Mago();
        
        
        
        Personaje personas[] = new Personaje[4];
        personas[0] = new Mago("Melchor", 150);
        personas[1] = new Mago("Gaspar", 150);
        personas[2] = new Guerrero("Gustavo", 150);
        personas[3] = new Guerrero("Yelotro", 150);
        String arma[] = new String[8];
        arma[0] = "espada";
        arma[1] = "cuchillo";
        arma[2] = "luz";
        arma[3] = "patada";
        arma[4] = "puño";
        arma[5] = "pistola";
        arma[6] = "conjuro";
        arma[7] = "laser";

        for (int i = 0; i < 2; i++) {
            a = rd.nextInt(8);
            b = rd.nextInt(8);
            c = rd.nextInt(8);
            d = rd.nextInt(8);
            
            
            Mago magolus = (Mago)personas[i];
            
            magolus.setArma(arma[a] + " " + arma[b] + " " + arma[c] + " " + arma[d]);
        }
        for (int i = 2; i < 4; i++) {
            
            a = rd.nextInt(8);
            b = rd.nextInt(8);
            c = rd.nextInt(8);
            d = rd.nextInt(8);
            
            Guerrero personus = (Guerrero)personas[i];
            
            personus.setArma(arma[a] + " " + arma[b] + " " + arma[c] + " " + arma[d]);
        }
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Personaje " + i + " " + personas[i].toString());
            
        }
        for (int i = 0; i < 4; i++) {
            listaPersonajes.add(personas[i]);
            
        }
        Combate operar = new Combate(listaPersonajes);
        operar.mostrarVs();
        
    }

}


package juegoguerreros_hashmap_arraylist;

import java.util.ArrayList;
import beans.*;
import java.util.Random;
import java.util.Scanner;

public class JuegoGuerreros_Hashmap_ArrayList {

    
    public static void main(String[] args) {
       ArrayList<Personaje> listaPlayers = new ArrayList();
       ArrayList<String> arma = new ArrayList();
       Scanner scan = new Scanner(System.in);
       Random rd = new Random();
       
       String arma1 = "Cuchillo";
       String arma2 = "Espada";
       String arma3 = "Maza";
       String arma4 = "Palo";
       String arma5 = "Ballesta";
       String arma6 = "Arco";
       String arma7 = "Katana";
       String arma8 = "Trabuco";
        
       Personaje mago1 = new Mago("Melchoro",150);
       Personaje mago2 = new Mago("Bartolo", 150);
       Personaje mago3 = new Mago("Gustavo", 150);
       Personaje mago4 = new Mago("Blas", 150);
       Personaje mago5 = new Mago("Pascual", 150);
       
       Personaje guerrero1 = new Guerrero("Yisus",150);
       Personaje guerrero2 = new Guerrero("Yisas",150);
       Personaje guerrero3 = new Guerrero("Yisos",150);
       Personaje guerrero4 = new Guerrero("Yisis",150);
       Personaje guerrero5 = new Guerrero("Yises",150);
       
       listaPlayers.add(mago1);
       listaPlayers.add(mago2);
       listaPlayers.add(mago3);
       listaPlayers.add(mago4);
       listaPlayers.add(mago5);
       listaPlayers.add(guerrero1);
       listaPlayers.add(guerrero2);
       listaPlayers.add(guerrero3);
       listaPlayers.add(guerrero4);
       listaPlayers.add(guerrero5);
        for (int i = 0; i < listaPlayers.size(); i++) {
        System.out.println(listaPlayers.get(i));    
        }
        for (int i = 0; i < 3; i++) {
            rd = new Random(8);
            
        }
        
        
    }
    
}

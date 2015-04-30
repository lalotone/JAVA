/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio1_ppo_ed;
import beans.puntos;
import java.util.Scanner;
/**
 *
 * @author lalotone
 */
public class Ejercicio1_PPO_ED {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        puntos punto1 = new puntos();
        puntos punto2 = new puntos();
        
        System.out.println("-----------------------");
        System.out.println("Programa de coordenadas");
        System.out.println("-----------------------");
        
        System.out.println("Introduzca el punto x");
        punto1.setX(scan.nextInt());
        System.out.println("Introduzca el punto y");
        punto2.setY(scan.nextInt());
        
        
    }
    
}

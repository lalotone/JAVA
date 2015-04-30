/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio6_r;

import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Ejercicio6_R {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        int numero;
        System.out.println("Introduzca un valor: ");
        numero = entrada.nextInt();
                System.out.println("-------------------------------");
        for(i=1;i<numero;i++){
        System.out.println(i);
        }
    }
    
}

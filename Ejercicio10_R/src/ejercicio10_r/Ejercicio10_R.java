/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio10_r;

import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Ejercicio10_R {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un numero para saber si es positivo o negatvo: ");
        numero = entrada.nextInt();
        if(numero%2==0){
        System.out.println("El numero es par");
        }else {System.out.println("El numero es impar");}
    }
    
}

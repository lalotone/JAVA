/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_100_nos_noneg_while;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class Suma_100_Nos_NoNeg_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        //Solicitar al usuario 100 números
        //i++ -------- i = i + 1
        // VARIABLES DEL PROGRAMA
        int acumulador = 0;
        int numero = 0;
        for(int i = 0;i < 100;i++){
            ////////////////
            // Solicitar números positivos
            ////////////////
            System.out.println("Inserte un número positivo. ");
            numero = s.nextInt();
            // MIENTRAS SE CUMPLA LA CONDICIÓN
            // while(true){}
            while(numero<0){
                System.out.println("El programa no admite números negativos. ");
                System.out.println("Por favor, inserte un número positivo. ");
                numero = s.nextInt();
            }// false
            // Fin solicitar números positivos
    }
         acumulador = acumulador + numero;
            // Mostrar la suma parcial
            System.out.println("La suma parcial es: " + acumulador);
         }
}



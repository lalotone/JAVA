/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_pares_multiplicacion_impares;

import java.util.Scanner;

/**
 *
 * @author black
 */
public class Suma_Pares_Multiplicacion_Impares {

    private static int multiplicación;
    private static int i;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        Scanner scan = new Scanner(System.in);
        int numero;
        int suma = 0;
        int multiplicacion = 1;



        System.out.println("Inserte un número. ");
        numero = scan.nextInt();


        for (int i = numero; i > 0; i--) {

            if (i % 2 == 0) {
                suma = suma + i;
            } else {
                multiplicacion = multiplicacion * i;
            }

        }

        System.out.println("la suma de los pares es: " + suma);
        System.out.println("La multiplicacion de los impares es: " + multiplicacion);
    }
}

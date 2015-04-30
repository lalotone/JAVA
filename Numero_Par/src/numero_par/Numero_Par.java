/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numero_par;

import java.util.Scanner;

/**
 *
 * @author black
 */
public class Numero_Par {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leerdatos;
        leerdatos = new Scanner(System.in);
                
                int numero;
    System.out.println("Introduzca un numero para saber si es par: ");
    numero = leerdatos.nextInt();
    while (numero%2!=0){
    System.out.println("El número es impar, introduzca un nuevo dato: ");
    numero = leerdatos.nextInt();
    }
        System.out.println("El número es par");
        System.out.println("El programa se ha terminado");
    }
}

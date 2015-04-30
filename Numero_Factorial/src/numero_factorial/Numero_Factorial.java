/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numero_factorial;

import java.util.Scanner;

/**
 *
 * @author black
 */
public class Numero_Factorial {
    private static Scanner entrada;
    private static Scanner scan;
    private static int i;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner scan = new Scanner(System.in);
        
        double factorial = 1;
        int numero;
        
        
        
        System.out.println("Inserte un número y el programa calculará su factorial: ");
            numero = scan.nextInt();

            while (numero !=0){
            
            factorial= factorial * numero;
                numero--;
            }
            
            System.out.println(factorial);
    }
}


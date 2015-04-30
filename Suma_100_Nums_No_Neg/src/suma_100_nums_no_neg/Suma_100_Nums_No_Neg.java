/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_100_nums_no_neg;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class Suma_100_Nums_No_Neg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Solicitar al usuario 100 numeros.
      
       
       Scanner entrada;
       entrada = new Scanner(System.in);
       int acumulador = 0;
       
       for(int contador =0; contador < 100; contador ++){
           System.out.println("Introduzca un número positivo: ");
           int numero = entrada.nextInt();
           if(numero > 0){
               acumulador= acumulador + numero;
               
           }
     System.out.println("La suma parcial es: " + acumulador);
    }
    
    }
}
 

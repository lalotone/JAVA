/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio11_r;

import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Ejercicio11_R {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int i;
        int numero;
        int contador = 0; 
       System.out.println("Introduzca un valor para saber sus multiplos de 3: ");
       numero = entrada.nextInt();
       for(i=1;i<numero;i++){
       if(i%3==0){
       contador++;
                  }
                          }
       System.out.println("El numero de multiplos es: " +contador);
    }
    
}

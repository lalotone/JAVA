/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array_factoriales;

import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Array_Factoriales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
    Scanner entradaDatos = new Scanner(System.in);
        int [] numeros = new int[5];
        int k;
        int i;
        int factorial = 1;
        
        for(i = 0; i < 5; i++){/*Esto sirve para recojer los dato y guardarlos en el array.*/
        System.out.println("Introduzca un valor y el programa hallara su factorial");
        numeros[i]= entradaDatos.nextInt();
        
                                   
        }
        for(i = 0; i <numeros.length; i++){/*Este for sirve para ir recorriendo el array = ejercicio array pares
            impares.*/
            factorial=1;/*Aqui hay que reiniciar el factorial porque sino valdra el factorial del primer numero, si metemos 
            el 5 por ejemplo, pues valdra factorial 120 y no 1 que es lo que necesitamos*/
            for(k = numeros[i]; k > 0; k--){
         
         factorial= factorial * k;
         
            }
         System.out.println("El factorial del numero es: " + factorial);
        }
        
        }
    }

    


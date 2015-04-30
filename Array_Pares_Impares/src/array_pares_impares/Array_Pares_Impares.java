/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array_pares_impares;

import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Array_Pares_Impares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entradaDatos = new Scanner(System.in);
        int [] numeros = new int[10];
        int k = 0;
        int i;
       
        
        for(i = 0; i < 10; i++){
        System.out.println("Introduzca un valor y el programa dira al final si es par o impar");
        numeros[i]= entradaDatos.nextInt();
                                   }
        
        for(i = 0; i <numeros.length; i++){
        if(numeros[i]%2 == 0){
        System.out.println("El numero" + " " +numeros[i]+ " " + "es PAR");
        }else{
        System.out.println("El numero" + " " +numeros[i]+ " " + "es IMPAR");
        }
        }
    }
    
}

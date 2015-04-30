/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio14_r;

import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Ejercicio14_R {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        int [] almacen = new int[5];
        int i;
        
        for(i = 0; i < 5; i++){
        System.out.println("Introduzca 5 numeros y se mostraran el mayor y el menor: ");
        almacen[i] = entrada.nextInt(); 
        }
        int  numeroMayor=almacen[0];
        
        for (int j = 0; j < almacen.length; j++) {
           if(almacen[i]> numeroMayor)
                 {
                     System.out.println(numeroMayor);
                 }
        
        }
       
    
    
    }
    
}

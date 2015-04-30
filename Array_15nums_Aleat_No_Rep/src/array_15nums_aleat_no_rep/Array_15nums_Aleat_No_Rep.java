/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array_15nums_aleat_no_rep;

import java.util.Random;



/**
 *
 * @author lalotone
 */
public class Array_15nums_Aleat_No_Rep {
    

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int[] numeros = new int[5];
        
            for(int i=0; i<5; i++){
                int aleatorio = (int) (Math.random()*6+0);
                numeros[i]=aleatorio;
                
        
            for(int k=0; k<i;k++){
            while(numeros[i]==numeros[k]){
                int aleatorio2 = (int) (Math.random()*6+0);
                numeros[i]=aleatorio2;
                k=0;/*Este k=0 sirve para que lea el array desde el 0*/
                
                                         }
                                 }
    System.out.print(" " + numeros[i]);
                                  }
            
            
    }
    
}

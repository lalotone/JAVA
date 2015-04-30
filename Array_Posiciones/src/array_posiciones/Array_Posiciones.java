/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array_posiciones;

import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Array_Posiciones {
    private static int resultado;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[5];
        int[] cuentaAtras = new int[5];
        int i;
        int k=numeros.length -1;
        //lectura de datos y llenar el array
        
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Introducir un valor= ");
            
            int entradaDatos = sc.nextInt();
            numeros[i]=entradaDatos;
            if(k >= 0)
                        {
                          cuentaAtras[k]=entradaDatos;
                          k--;
                                       
                        }
        }
        System.out.println("");
        for (int j = 0; j < numeros.length; j++) {
            System.out.print(numeros[j] + "," );
            System.out.print(cuentaAtras[j]);
            System.out.println("");
        }
        
        
                                 }
        
    }
    


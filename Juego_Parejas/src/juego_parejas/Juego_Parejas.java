/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juego_parejas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Juego_Parejas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][4]; /*Esta es la "segunda dimension", las filas*/
        int RespuestaFila;
        int RespuestaColumna;
        Random aleatorio = new Random();
        int numAleatorio;
        int[] almacen = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8};
        int[] pareja = new int[16];
        int k=0;
        
        for (int i = 0; i < 16; i++) 
        {
            numAleatorio = aleatorio.nextInt(16);
            if(pareja[numAleatorio]==0){
            pareja[i] = almacen[numAleatorio];
        }
        }
        
        for (int i = 0; i < 4; i++) {//esto sirve para que vaya recorriendo las filas
            for (int j = 0; j < 4; j++){//luego pasa a recorrer la columna
                matriz[i] [j] = pareja[k++];/*Con esto le estamos diciendo que vaya rellenando
                las filas y las columnas con 0*/
                
               
                
            }
                                               }
        for (int i = 0; i < 4; i++) {//esto sirve para que vaya recorriendo las filas
          for (int j = 0; j <4; j++){//luego pasa a recorrer la columna
                System.out.print(matriz[i][j] + " ");/*Esto se utiliza para ir imprimiendo o rellenando
                la matriz con los ceros que le hemos dicho arriba*/
            }  
            System.out.println(" ");
    
    }
        
        
        
        
            }
    }
    

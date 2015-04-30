/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication34;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        
        int[][] tablero = new int [8][8];
        int[] numero = new int[32];
        int fila;
        int columna;
        
        for (int i = 1; i < 33; i++){//generamos el array de los 32 numeros
            for (int j = 0; j < 2; j++) {//lo hacemos por dos veces para hacer las parejas.
                
            
            do{
                fila = rd.nextInt(8);
                columna = rd.nextInt(8);
            }while (tablero[fila][columna] != 0);
                tablero[fila][columna] = i;
            }
        }
        System.out.println("Imprimir Matriz");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    
}

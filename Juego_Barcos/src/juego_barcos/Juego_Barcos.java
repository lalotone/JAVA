/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juego_barcos;

import java.util.Random;

/**
 *
 * @author lalotone
 */
public class Juego_Barcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] tablero = new int[10][10];
        Random aleatorio = new Random();
        int fila=0;
        int columna=0;
        System.out.println("***********************************");
        System.out.println("COMIENZA EL JUEGO DE LOS BARCOS!!!!");
        System.out.println("HUNDE A TU RIVAL!!");
        System.out.println("****************");
        /*
        //un barco de 2
        for (int i = 0; i < 1; i++) {
          do{
              fila = aleatorio.nextInt(8);
              columna = aleatorio.nextInt(8);
              tablero[fila+1][columna]=2;
          }while(fila == 9 || columna == 9);
          tablero[fila][columna]=2;
        }
        //otro barco de 2
        for (int i = 0; i < 1; i++) {
          do{
              fila = aleatorio.nextInt(8);
              columna = aleatorio.nextInt(8);
              tablero[fila+1][columna]=2;
          }while(fila == 9 || columna == 9);
          tablero[fila][columna]=2;
        }
        //un barco de 3
        
          do{
              fila = aleatorio.nextInt(7);
              columna = aleatorio.nextInt(7);
              //este for sirve para que incremente hasta 3 el barco
              for (int j = 0; j < 3; j++) {
               tablero[fila][columna+j]=3;   
              }
          }while(fila == 9 || columna == 9);
          tablero[fila][columna]=3;
        */
        //un barco de 4
        
              
              
              //este for sirve para que incremente hasta 4 el barco
              for (int j = 0; j < 5; j++) {
              if(j==0){
              fila = aleatorio.nextInt(10);
              columna = aleatorio.nextInt(10);
                  do {
                   fila = aleatorio.nextInt(10);
                   columna = aleatorio.nextInt(10);   
                  } while (columna+3>9);
                  
               }else{
              tablero[fila][columna+j]=4;
              }
              }
          
          /*
          //un barco de 5
          do{
              fila = aleatorio.nextInt(5);
              columna = aleatorio.nextInt(5);
              //este for sirve para que incremente hasta 5 el barco
              for (int j = 0; j < 5; j++) {
               tablero[fila][columna+j]=5;   
              }
          }while(fila == 9 || columna == 9);
          tablero[fila][columna]=5;
          */
          /************************************************************/
          
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(tablero[i][j]==0){
                tablero[i][j]=0;
                }
                System.out.print(" " + tablero[i][j]);
            }
            System.out.println(" ");
        }
    }
    
}

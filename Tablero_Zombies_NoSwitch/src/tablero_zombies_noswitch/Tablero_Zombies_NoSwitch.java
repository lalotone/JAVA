/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tablero_zombies_noswitch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Tablero_Zombies_NoSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        char tablero[][] = new char[10][10];
        Random numAle = new Random();
        int fila;
        int columna;
        int vidas = 3;
        char movimientos[] = new char[4];
        movimientos[0]='w'; movimientos[2]='a';
        movimientos[1]='s'; movimientos[3]='d';
        char movimiento;
        /*Aqui tengo pensado sacar la equivalencia de las posiciones a fila-columna(mapeo)
        para establecer los muros es simple dado que todos los movimientos funcionan igual 
        al igual que los limites, no varia*/
        
        
        
        for (int i = 0; i < 10; i++) {
        do{
            fila = numAle.nextInt(9);
            columna = numAle.nextInt(9);
           
          }while(columna==9 && fila ==9);
               tablero[fila][columna]='Z';
        }
        for (int i = 0; i < 10; i++) {
        do{
            fila = numAle.nextInt(9);
            columna = numAle.nextInt(9);
        }while(columna==9 && fila==9);
                tablero[fila][columna]='M';
        }
        
        do{
        fila = numAle.nextInt(9);
        columna = numAle.nextInt(9);
        }while(columna ==9 && fila ==9);
                tablero[fila][columna]='J';
        
                System.out.println("********************");
                System.out.println("JUEGO DE LOS ZOMBIES");
                System.out.println("********************\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(tablero[i][j]==0){
                    tablero[i][j]='L';
                }
                System.out.print(" " +tablero[i][j]);
            }
            System.out.println(" ");
        }
        
        System.out.println("\nCOMIENZA EL JUEGO!!!!!");
        System.out.println("TIENES 3 VIDAS!!!!");
        do{
        System.out.println("Los posibles movimientos son W,A,S,D: ");
        movimiento = entrada.next().charAt(0);    
        
        }while(vidas!=0);
   }
 }


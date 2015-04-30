/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zombies_java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Zombies_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        char tablero[][] = new char[10][10];
        Random aleatorio = new Random();
        int vidas = 3;
        int fila;
        int columna;
        char movimiento;
       
        char tablero2[][] = new char[10][10];
        Random aleatorio2 = new Random();
        int vidas2 = 3;
        int fila2;
        int columna2;
        char movimiento2;
        
        
        for (int i = 0; i < 10; i++) {
            do{
            fila = aleatorio.nextInt(10);
            columna = aleatorio.nextInt(10);
            }while(fila==0 && columna==0);
        tablero[fila][columna]='Z';
        }
        for (int i = 0; i < 3; i++) {
            do{
            fila = aleatorio.nextInt(10);
            columna = aleatorio.nextInt(10);
            }while(fila==0 && columna==0);
        tablero[fila][columna]='P';
        }
        do{
            fila = aleatorio.nextInt(10);
            columna = aleatorio.nextInt(10);
            }while(fila==0 && columna==0);
        tablero[fila][columna]='J';
        
        System.out.println("Tablero jugador 1!");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(tablero[i][j]==0){
                      tablero[i][j]='L';
                                             }
                System.out.print(" " +tablero[i][j]);
                }
            System.out.println(" ");
            }
        /****************TABLERO 2 CREACION E IMPRESIÓN*************************************/
        for (int i = 0; i < 10; i++) {
            do{
            fila2 = aleatorio2.nextInt(10);
            columna2 = aleatorio2.nextInt(10);
            }while(fila2==0 && columna2==0);
        tablero2[fila2][columna2]='Z';
        }
        for (int i = 0; i < 3; i++) {
            do{
            fila2 = aleatorio2.nextInt(10);
            columna2 = aleatorio2.nextInt(10);
            }while(fila2==0 && columna2==0);
        tablero2[fila2][columna2]='P';
        }
        do{
            fila2 = aleatorio2.nextInt(10);
            columna2 = aleatorio2.nextInt(10);
            }while(fila2==0 && columna2==0);
        tablero2[fila2][columna2]='J';
        System.out.println("\nTablero Jugador 2!");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(tablero2[i][j]==0){
                      tablero2[i][j]='L';
                                             }
                System.out.print(" " +tablero2[i][j]);
                }
            System.out.println(" ");
            }
         System.out.println("***********************");
         System.out.println("Comienza el Juego!!!!!!");
         do{
             System.out.println("Jugador 1,elige un movimiento!");
         System.out.println("Los posibles movimientos son w,a,s,d");
         movimiento = entrada.next().charAt(0);
         
         switch(movimiento){
         
             case 'w':
                 if(fila-1<0){
                     System.out.println("A ver melon, te estas saliendo del tablero.");
                 }else if(tablero[fila-1][columna]=='Z'){
                     System.out.println("Te has topado con un Zombie!!!");
                     vidas--;
                     System.out.println("Te quedan "+vidas+" vidas.");
                 }else if(tablero[fila-1][columna]=='P'){
                 System.out.println("Te has encontrado con una poción! Te suma una vida!");
                 
                    
                     fila = fila - 1;
                     tablero[fila][columna] = 'J';
                     tablero[fila + 1][columna] = 'L';
                     vidas++;
                     System.out.println("Te quedan "+vidas+" vidas");
                 }else if(tablero[fila-1][columna]=='L'){
                     tablero[fila-1][columna]='J';
                     tablero[fila][columna]='L';
                     fila--;
                 }break;
             case 's':
                 if(fila+1>9){
                     System.out.println("A ver melon, te estas saliendo del tablero.");
                 }else if(tablero[fila+1][columna]=='Z'){
                     System.out.println("Te has topado con un Zombie!!!");
                     vidas--;
                     System.out.println("Te quedan "+vidas+" vidas.");
                 }else if(tablero[fila+1][columna]=='P'){
                 System.out.println("Te has encontrado con una poción! Te suma una vida!");
                     
                     fila = fila + 1;
                     tablero[fila][columna] = 'J';
                     tablero[fila - 1][columna] = 'L';
                     vidas++;
                     System.out.println("Te quedan "+vidas+" vidas");
                 }else if(tablero[fila+1][columna]=='L'){
                     fila++;
                     tablero[fila-1][columna]='L';
                     tablero[fila][columna]='J';
                     
                 }break;
             case 'd':
                 if(columna+1>9){
                     System.out.println("A ver melon, te estas saliendo del tablero.");
                 }else if(tablero[fila][columna+1]=='Z'){
                     System.out.println("Te has topado con un Zombie!!!");
                     vidas--;
                     System.out.println("Te quedan "+vidas+" vidas.");
                 }else if(tablero[fila][columna+1]=='P'){
                 System.out.println("Te has encontrado con una poción! Te suma una vida!");
                 
                     
                     columna = columna + 1;
                     tablero[fila][columna] = 'J';
                     tablero[fila][columna-1] = 'L';
                     vidas++;
                     System.out.println("Te quedan "+vidas+" vidas");
                 }else if(tablero[fila][columna+1]=='L'){
                     tablero[fila][columna+1]='J';
                     tablero[fila][columna]='L';
                     columna++;
                 }break;
             case 'a':
                 if(columna-1<0){
                     System.out.println("A ver melon, te estas saliendo del tablero.");
                 }else if(tablero[fila][columna-1]=='Z'){
                     System.out.println("Te has topado con un Zombie!!!");
                     vidas--;
                     System.out.println("Te quedan "+vidas+" vidas.");
                 }else if(tablero[fila][columna-1]=='P'){
                 System.out.println("Te has encontrado con una poción! Te suma una vida!");
                 
                     
                     columna = columna -1;
                     tablero[fila][columna] = 'J';
                     tablero[fila][columna+1] = 'L';
                     vidas++;
                     System.out.println("Te quedan "+vidas+" vidas");
                 }else if(tablero[fila][columna-1]=='L'){
                     tablero[fila][columna-1]='J';
                     tablero[fila][columna]='L';
                     columna--;
                 }break;
         
         }
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(tablero[i][j]==0){
                      tablero[i][j]='L';
                                             }
                System.out.print(" " +tablero[i][j]);
                }
            System.out.println(" ");
            }
         
             System.out.println("Jugador 2, tu turno!!");
         System.out.println("Los posibles movimientos son w,a,s,d");
         movimiento2 = entrada.next().charAt(0);
         
         switch(movimiento2){
         
             case 'w':
                 if(fila2-1<0){
                     System.out.println("A ver melon, te estas saliendo del tablero.");
                 }else if(tablero2[fila2-1][columna2]=='Z'){
                     System.out.println("Te has topado con un Zombie!!!");
                     vidas2--;
                     System.out.println("Te quedan "+vidas2+" vidas.");
                 }else if(tablero2[fila2-1][columna2]=='P'){
                 System.out.println("Te has encontrado con una poción! Te suma una vida!");
                 
                    
                     fila2 = fila2 - 1;
                     tablero2[fila2][columna2] = 'J';
                     tablero2[fila2 + 1][columna2] = 'L';
                     vidas2++;
                     System.out.println("Te quedan "+vidas2+" vidas");
                 }else if(tablero2[fila2-1][columna2]=='L'){
                     tablero2[fila2-1][columna2]='J';
                     tablero2[fila2][columna2]='L';
                     fila2--;
                 }break;
             case 's':
                 if(fila2+1>9){
                     System.out.println("A ver melon, te estas saliendo del tablero.");
                 }else if(tablero2[fila2+1][columna2]=='Z'){
                     System.out.println("Te has topado con un Zombie!!!");
                     vidas2--;
                     System.out.println("Te quedan "+vidas2+" vidas.");
                 }else if(tablero2[fila2+1][columna2]=='P'){
                 System.out.println("Te has encontrado con una poción! Te suma una vida!");
                     
                     fila2 = fila2 + 1;
                     tablero2[fila2][columna2] = 'J';
                     tablero2[fila2 - 1][columna2] = 'L';
                     vidas2++;
                     System.out.println("Te quedan "+vidas2+" vidas");
                 }else if(tablero2[fila2+1][columna2]=='L'){
                     tablero2[fila2-1][columna2]='L';
                     tablero2[fila2][columna2]='J';
                     fila2++;
                 }break;
             case 'd':
                 if(columna2+1>9){
                     System.out.println("A ver melon, te estas saliendo del tablero.");
                 }else if(tablero2[fila2][columna2+1]=='Z'){
                     System.out.println("Te has topado con un Zombie!!!");
                     vidas2--;
                     System.out.println("Te quedan "+vidas2+" vidas.");
                 }else if(tablero2[fila2][columna2+1]=='P'){
                 System.out.println("Te has encontrado con una poción! Te suma una vida!");
                 
                     
                     columna2 = columna2 + 1;
                     tablero2[fila2][columna2] = 'J';
                     tablero2[fila2][columna2-1] = 'L';
                     vidas2++;
                     System.out.println("Te quedan "+vidas2+" vidas");
                 }else if(tablero2[fila2][columna2+1]=='L'){
                     tablero2[fila2][columna2+1]='J';
                     tablero2[fila2][columna2]='L';
                     columna2++;
                 }break;
             case 'a':
                 if(columna2-1<0){
                     System.out.println("A ver melon, te estas saliendo del tablero.");
                 }else if(tablero2[fila2][columna2-1]=='Z'){
                     System.out.println("Te has topado con un Zombie!!!");
                     vidas2--;
                     System.out.println("Te quedan "+vidas2+" vidas.");
                 }else if(tablero2[fila2][columna2-1]=='P'){
                 System.out.println("Te has encontrado con una poción! Te suma una vida!");
                 
                     
                     columna2 = columna2 -1;
                     tablero2[fila2][columna2] = 'J';
                     tablero2[fila2][columna2+1] = 'L';
                     vidas2++;
                     System.out.println("Te quedan "+vidas2+" vidas");
                 }else if(tablero2[fila2][columna2-1]=='L'){
                     tablero2[fila2][columna2-1]='J';
                     tablero2[fila2][columna2]='L';
                     columna2--;
                 }break;
         
         }
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(tablero2[i][j]==0){
                      tablero2[i][j]='L';
                                             }
                System.out.print(" " +tablero2[i][j]);
                }
            System.out.println(" ");
            }
         }while(vidas !=0 && vidas2 !=0);
         System.out.println("Te han matado, mala suerte.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package star_wars_java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Star_Wars_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Aquí basicamente declaramos las variables*/
        char [][] tablero1 = new char[7][7];
        char [][] tablero2 = new char[7][7];
        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);
        int fila1;
        int columna1;
        int fila2;
        int columna2;
        int vidas1 = 3;
        int vidas2 = 3;
        int movimiento1;
        int movimiento2;
        boolean muerte = true;
        int u=0;
        int x=0;
        int w=1;
        int t=1;
        int a=0;
        int b=0;
        int c=1;
        int d=1;
        /*Nota del 5 al 7, no he completado el 7-10*/
        /*Ponemos los mensajes de bienvenida al juego*/
        System.out.println("Bienvenido al juego de Star Wars, que la fuerza te acompañe!");
        System.out.println("****************************");
        System.out.println("Aqui esta el tablero de YODA");
        /*Empezamos creando los DarthMaul que habrá en el tablero*/
        for (int i = 0; i < 5; i++) {
            do{
            fila1 = aleatorio.nextInt(5);
            columna1 = aleatorio.nextInt(5);
            }while(tablero1[fila1][columna1]=='X' || fila1==0 || columna1==0 || fila1==6 || columna1==6);
            tablero1[fila1][columna1]='D';
          }
        /*Creamos a YODA en una posicion aleatoria*/
            do{
            fila1 = aleatorio.nextInt(5);
            columna1 = aleatorio.nextInt(5);
            }while(tablero1[fila1][columna1]=='X' || fila1==0 || columna1==0 || fila1==6 || columna1==6);
            tablero1[fila1][columna1]='Y';
            
            /*Aquí creamos los límites del tablero 1*/
            while(u<7){
              tablero1[u][0]='X';  
              u++;  
            }
            while(x<7){
              tablero1[x][6]='X';  
              x++;  
            }
            while(w<6){
              tablero1[0][w]='X';  
              w++;  
            }
            
            while(t<6){
              tablero1[6][t]='X';  
              t++;  
            }
            
            /*Limites tablero 2*/
            
            while(a<7){
              tablero2[a][0]='X';  
              a++;  
            }
            while(b<7){
              tablero2[b][6]='X';  
              b++;  
            }
            while(c<6){
              tablero2[0][c]='X';  
              c++;  
            }
            
            while(d<6){
              tablero2[6][d]='X';  
              d++;  
            }
              
          
                 /*Aqui imprimimos el tablero de YODA*/   
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(tablero1[i][j]==0){
                   tablero1[i][j]='L';
                }
                
                
                System.out.print(" " +tablero1[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("*************************************");
        /*Aqui creamos el tablero de Darth Vader*/
        System.out.println("Aqui esta el tablero de Darth Vader!!");
        for (int i = 0; i < 5; i++) {
            /*Creamos los R2-D2*/
            do{
            fila2 = aleatorio.nextInt(5);
            columna2 = aleatorio.nextInt(5);
            }while(tablero2[fila2][columna2]=='X' || fila2==0 || columna2==0 || fila2==6 || columna2==6);
            tablero2[fila2][columna2]='R';
          }
            /*Creamos en una posición aleatoria a DarthVader*/
            do{
            fila2 = aleatorio.nextInt(5);
            columna2 = aleatorio.nextInt(5);
            }while(tablero2[fila2][columna2]=='X' || fila2==0 || columna2==0 || fila2==6 || columna2==6);
            tablero2[fila2][columna2]='V';
            /*Imprimimos el tablero de Darth Vader*/
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(tablero2[i][j]==0){
                   tablero2[i][j]='L';
                }
                System.out.print(" " +tablero2[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("*****************");
        System.out.println("COMIENZA EL JUEGO");
        System.out.println("*****************");
        /*Aquí empieza el juego el cual acabara cuando deje de cumplirse la condicion que aloja
        el while, que es un booleano.*/
        do{
            System.out.println("Tablero Player1!!!!!!!");
            System.out.println("Introduzca un movimiento Player1. w,a,s,d: ");
            movimiento1 = entrada.next().charAt(0);
            /*Aqui preparamos el Switch con sus cases y las distintas posibilidades, si aparece X, si
            te encuentras con el malo, Si la casilla es libre. Dependiendo de lo que haya en el tablero
            hará una cosa u otra*/
            switch(movimiento1){
                case 'w':
                    if(tablero1[fila1-1][columna1]=='X'){
                        System.out.println("La Barrera laser te detiene!!!");
                    }else if(tablero1[fila1-1][columna1]=='D'){
                        System.out.println("Te has encontrado con DarthMaul!! Una vida menos!!");
                        vidas1--;
                        System.out.println("Te quedan "+ vidas1 +" vidas!");
                        if(vidas1<1){
                            System.out.println("Te han matado player1!!");
                            System.out.println("Ta ha ganado el Player2!!!");
                            muerte = false;/*Aquí se rompe la condición del while variando el Boolean a false
                            , con lo cual este es el último turno del player1*/
                        }
                    }else if(tablero1[fila1-1][columna1]=='L'){
                        fila1--;
                        tablero1[fila1][columna1]='Y';
                        tablero1[fila1+1][columna1]='L';
                        
                    }break;
                case 's':
                    if(tablero1[fila1+1][columna1]=='X'){
                        System.out.println("La Barrera laser te detiene!!!");
                    }else if(tablero1[fila1+1][columna1]=='D'){
                        System.out.println("Te has encontrado con DarthMaul!! Una vida menos!!");
                        vidas1--;
                        System.out.println("Te quedan "+ vidas1 +" vidas!");
                        if(vidas1<1){
                            System.out.println("Te han matado player1!!");
                            System.out.println("Ta ha ganado el Player2!!!");
                            muerte = false;
                        }
                    }else if(tablero1[fila1+1][columna1]=='L'){
                        fila1++;
                        tablero1[fila1][columna1]='Y';
                        tablero1[fila1-1][columna1]='L';
                    }break;
                case 'a':
                    if(tablero1[fila1][columna1-1]=='X'){
                        System.out.println("La Barrera laser te detiene!!!");
                    }else if(tablero1[fila1][columna1-1]=='D'){
                        System.out.println("Te has encontrado con DarthMaul!! Una vida menos!!");
                        vidas1--;
                        System.out.println("Te quedan "+ vidas1 +" vidas!");
                        if(vidas1<1){
                            System.out.println("Te han matado player1!!");
                            System.out.println("Ta ha ganado el Player2!!!");
                            muerte = false;
                        }
                    }else if(tablero1[fila1][columna1-1]=='L'){
                        columna1--;
                        tablero1[fila1][columna1]='Y';
                        tablero1[fila1][columna1+1]='L';
                    }break;
                case 'd':
                    if(tablero1[fila1][columna1+1]=='X'){
                        System.out.println("La Barrera laser te detiene!!!");
                    }else if(tablero1[fila1][columna1+1]=='D'){
                        System.out.println("Te has encontrado con DarthMaul!! Una vida menos!!");
                        vidas1--;
                        System.out.println("Te quedan "+ vidas1 +" vidas!");
                        if(vidas1<1){
                            System.out.println("Te han matado player1!!");
                            System.out.println("Ta ha ganado el Player2!!!");
                            muerte = false;
                        }
                    }else if(tablero1[fila1][columna1+1]=='L'){
                        columna1++;
                        tablero1[fila1][columna1]='Y';
                        tablero1[fila1][columna1-1]='L';
                    }break;
            }
            /*Re-imprimimos el tablero del Player 1*/
            for (int i = 0; i < 7; i++) {
              for (int j = 0; j < 7; j++) {
                if(tablero1[i][j]==0){
                   tablero1[i][j]='L';
                }
                System.out.print(" " +tablero1[i][j]);
            }
            System.out.println(" ");
         
         }
         System.out.println("********************");   
         System.out.println("Turno del Player2!!!");
         System.out.println("********************");
        
         
             
            
         /*Aquí empezaría el turno del Player 2, es igual respecto al switch al del player 1*/
            System.out.println("Tablero Player 2!!!!!!!!");
            System.out.println("Introduzca un movimiento Player2!!. w,a,s,d: ");
            movimiento2 = entrada.next().charAt(0);
            
            switch(movimiento2){
                case 'w':
                    if(tablero2[fila2-1][columna2]=='X'){
                        System.out.println("La Barrera laser te detiene!!!");
                    }else if(tablero2[fila2-1][columna2]=='R'){
                        System.out.println("Te has encontrado con R2-D2!! Una vida menos!!");
                        vidas2--;
                        System.out.println("Te quedan "+ vidas2 +" vidas!");
                        if(vidas2<1){
                            System.out.println("Te han matado player2!!");
                            System.out.println("Ta ha ganado el Player1!!!");
                            muerte = false;
                        }
                    }else if(tablero2[fila2-1][columna2]=='L'){
                        fila2--;
                        tablero2[fila2][columna2]='V';
                        tablero2[fila2+1][columna2]='L';
                    }break;
                case 's':
                    if(tablero2[fila2+1][columna2]=='X'){
                        System.out.println("La Barrera laser te detiene!!!");
                    }else if(tablero2[fila2+1][columna2]=='R'){
                        System.out.println("Te has encontrado con R2-D2!! Una vida menos!!");
                        vidas2--;
                        System.out.println("Te quedan "+ vidas2 +" vidas!");
                        if(vidas2<1){
                            System.out.println("Te han matado player2!!");
                            System.out.println("Ta ha ganado el Player1!!!");
                            muerte = false;
                        }
                    }else if(tablero2[fila2+1][columna2]=='L'){
                        fila2++;
                        tablero2[fila2][columna2]='V';
                        tablero2[fila2-1][columna2]='L';
                    }break;
                case 'a':
                    if(tablero2[fila2][columna2-1]=='X'){
                        System.out.println("La Barrera laser te detiene!!!");
                    }else if(tablero2[fila2][columna2-1]=='R'){
                        System.out.println("Te has encontrado con R2-D2!! Una vida menos!!");
                        vidas2--;
                        System.out.println("Te quedan "+ vidas2 +" vidas!");
                        if(vidas2<1){
                            System.out.println("Te han matado player2!!");
                            System.out.println("Ta ha ganado el Player1!!!");
                            muerte = false;
                        }
                    }else if(tablero2[fila2][columna2-1]=='L'){
                        columna2--;
                        tablero2[fila2][columna2]='V';
                        tablero2[fila2][columna2+1]='L';
                    }break;
                case 'd':
                    if(tablero2[fila2][columna2+1]=='X'){
                        System.out.println("La Barrera laser te detiene!!!");
                    }else if(tablero2[fila2][columna2+1]=='R'){
                        System.out.println("Te has encontrado con R2-D2!! Una vida menos!!");
                        vidas2--;
                        System.out.println("Te quedan "+ vidas2 +" vidas!");
                        if(vidas2<1){
                            System.out.println("Te han matado player2!!");
                            System.out.println("Ta ha ganado el Player1!!!");
                            muerte = false;
                        }
                    }else if(tablero2[fila2][columna2+1]=='L'){
                        columna2++;
                        tablero2[fila2][columna2]='V';
                        tablero2[fila2][columna2-1]='L';
                    }break;
            }
            /*Re-imprimimos el tablero del Player 2*/
            for (int i = 0; i < 7; i++) {
              for (int j = 0; j < 7; j++) {
                if(tablero2[i][j]==0){
                   tablero2[i][j]='L';
                }
                System.out.print(" " +tablero2[i][j]);
            }
            System.out.println(" ");
              
        }
        }while(muerte);
    }
    /*Y FIN DEL PROGRAMA*/
}

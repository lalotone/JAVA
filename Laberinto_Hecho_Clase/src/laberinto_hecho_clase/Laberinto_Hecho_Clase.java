/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laberinto_hecho_clase;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Laberinto_Hecho_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] tablero=new int[10][10];
        Random numAleatorio= new Random();
        int fila=0;
        int columna=0;
        Scanner entrada = new Scanner(System.in);
        char movimiento;
        
        for(int i=0; i<10; i++){
            //Repetir hasta que la casilla sea igual a 0
         do{    
                fila= numAleatorio.nextInt(10);
                columna= numAleatorio.nextInt(10);
                /* Esto sirve para crear la posición aleatoria de los muros.*/
         }while(tablero[fila][columna]!=0 || (fila==9 && columna==9));
         /*Esto es para insertar los muros pero no se puede insertar en la posición 9,9, la fila o columna tiene que ser distinta
         de 0.*/
         tablero[fila][columna]=2;/*Esto es para decirle que coloque como muro un 2*/
  }
        /*
         * CASILLA JUGADOR ALEATORIA
         */
            do{    
                fila= numAleatorio.nextInt(10);
                columna= numAleatorio.nextInt(10);
                /*Este se utiliza para crear la posicion aleatoria del jugador en fila-columna.*/
            }while(tablero[fila][columna]==2 || (fila==9 && columna==9));
                       tablero[fila][columna]=9;/*Esto sirve para colocar aleatoriamente al jugador,
                               no se puede colocar ni en la posicion 9,9 ni en una posición en la cual haya un muro*/
            //tablero[fila][columna]=2 ;
        //****
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                if(tablero[j][k]==0){
                tablero[j][k]=1;
                }
                System.out.print(tablero[j][k]+ " ");
            }
                System.out.println(" ");
        }/*Todo este for sirve para llevar a cabo la impresion del tablero.*/
        //Comienza el juego.
        System.out.println("Comienza el juego!!");
        do{/*Aqui llega el momento de llevar a cabo los movimientos mientras que se cumpla la condición del while que significa que 
            la posición es 9,9, cuando la posición es 9,9 se deja de cumplir la condicion y por tanto se acaba el juego*/
            System.out.println("Introduzca un movimiento: ");
            System.out.println("Las teclas de movimiento son W,A,S,D");
            movimiento = entrada.next().charAt(0);
                switch(movimiento){/*Este switch es como un conjunto de "if" pero ahorrando bastante trabajo*/
                    case 'w':
                        // Código
                        if(fila-1<0){/*Aqui le decimos que si nos movemos por la fila y esta al darle a 'w' es menor que 0 nos imprima el
                            mensaje de que nos estamos saliendo de la zona permitida*/
                        System.out.println("Si te sales del cartel a tu casa.");
                        
                        }else if(tablero[fila-1][columna]==2){/*Aqui le estamos diciendo que si la posición a la que retrocedemos en la fila de w es = a un
                            2, es decir su contenido, nos diga que nos estamos chocando contra el muro.  Recordar que:
                            1=posibles movimientos.
                            2=muro.
                            9=jugador*/
                        System.out.println("Te has pegado contra un muro");
                        }else if(tablero[fila-1][columna]==1){
                        fila--;/*Este otro else if sirve para decirle que si el valor de la fila hacia la cual nos vamos a mover(hacia arriba)
                        es 1 se puede avanzar, el fila-- sirve para decrementar la posición en la fila subiendo una posición.*/
                        tablero[fila][columna]=9;
                        /*Aqui le decimos que en la posición el la que se encuentre tras decrementar la fila nos ponga el 9 que es el jugador*/
                        tablero[fila+1][columna]=1;
                        /*Aqui le decimos que en la posición en la que estaba anteriormente coloque un 1, para no ir dejando la "huella" del paso del jugador*/
                        }
                        break;
                    case 'a':/*El resto de switchs funcionan iguales al de arriba, variando si incrementa o decrementa la posición, no hay mas.*/
                      
                        // Código
                        if(columna-1<0){
                        System.out.println("Si te sales del cartel a tu casa.");
                        
                        }else if(tablero[fila][columna-1]==2){
                        System.out.println("Te has pegado contra un muro");
                        }else if(tablero[fila][columna-1]==1){
                        columna--;
                        tablero[fila][columna]=9;
                        tablero[fila][columna+1]=1;
                        }
                        break;
                    case 's':
                        // Código
                        if(fila+1>9){
                        System.out.println("Si te sales del cartel a tu casa.");
                        
                        }else if(tablero[fila+1][columna]==2){
                        System.out.println("Te has pegado contra un muro");
                        }else if(tablero[fila+1][columna]==1){
                        fila++;
                        tablero[fila][columna]=9;
                        tablero[fila-1][columna]=1;
                        }
                        
                        break;
                    case 'd':
                        // Código
                        if(columna+1>9){
                        System.out.println("Si te sales del cartel a tu casa.");
                        
                        }else if(tablero[fila][columna+1]==2){
                        System.out.println("Te has pegado contra un muro");
                        }else if(tablero[fila][columna+1]==1){
                        columna++;
                        tablero[fila][columna]=9;
                        tablero[fila][columna-1]=1;
                        }
                        break;
                      
                }
                for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                if(tablero[j][k]==0){
                tablero[j][k]=1;
                }
                System.out.print(tablero[j][k]+ " ");
            }
                System.out.println(" ");
        }
        }while(fila!=9 || columna!=9);
        
        System.out.println("Enhorabuena has ganado!!!!");
        
    }
    
}

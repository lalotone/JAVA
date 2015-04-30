/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laberinto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Laberinto {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
    int[][] matriz = new int[10][10];
    int fila = 0;
    int columna = 0;
    int Ran;
    char movimientos;
    boolean si = true;
    
 
    
        for (fila = 0; fila < matriz.length; fila++) {//esto sirve para que vaya recorriendo las filas
            for (columna = 0; columna < matriz.length; columna++){//luego pasa a recorrer la columna
                Ran= (int) (Math.random()*4+1);
                if(Ran != 1){
                 matriz [fila][columna]=1;
                 
                }else{matriz[i] [j] = 'X';
                matriz [fila][columna]=2;
                }
                }
                
            }
            matriz[0] [0] = 0; 
                                               
        for ( fila = 0; fila <matriz.length; fila++) {//esto sirve para que vaya recorriendo las filas
          for ( columna = 0; columna < matriz.length; columna++){//luego pasa a recorrer la columna
                System.out.print(matriz[fila][columna] + " ");/*Esto se utiliza para ir imprimiendo o rellenando
                la matriz con los ceros que le hemos dicho arriba*/
                
                }
        System.out.println(" ");    
        }  
        while(si = true){
        System.out.println("Introduzca un movimiento: ");
        movimientos = entrada.next().charAt(0);
            
        
        if(movimientos == 's'){
             matriz[fila + 1][columna] = 0;
             //aqui el if deberiamos utilizarlo para si me salgo del teclado con la posicion menos uno
             //y en el else que aparezca el movimiento.
            }
        }
            
    
    }
                        }
        
    
    


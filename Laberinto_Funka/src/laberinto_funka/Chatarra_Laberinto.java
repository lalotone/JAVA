/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laberinto_funka;

import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Chatarra_Laberinto {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[10][10];
    int fila = 0;
    int columna = 0;
    int Ran;
    char movimientos;
    boolean si = true;
    
 
    
        for (fila = 0; fila < 10; fila++) {//esto sirve para que vaya recorriendo las filas
            for (columna = 0; columna < 10; columna++){//luego pasa a recorrer la columna
                matriz[fila] [columna] = '1';/*Con esto le estamos diciendo que vaya rellenando
                las filas y las columnas con 1*/
                
                Ran= (int) (Math.random()*4+1);
                if(Ran != 1){
                 matriz [fila][columna]='1';
                 
                }else{
                matriz [fila][columna]='2';
                }
                }
                
            }
            matriz[0] [0] = 'P'; 
                                               
        for ( fila = 0; fila < 10; fila++) {//esto sirve para que vaya recorriendo las filas
          for ( columna = 0; columna < 10; columna++){//luego pasa a recorrer la columna
                System.out.print(matriz[fila][columna] + " ");/*Esto se utiliza para ir imprimiendo o rellenando
                la matriz con los ceros que le hemos dicho arriba*/
                
                }
        System.out.println(" ");    
        }  
        while(si = true){
        System.out.println("Introduzca un movimiento: ");
        movimientos = entrada.next().charAt(0);
            if(movimientos == 's'){
             matriz[fila+1][columna] = 0;
            }
        }
    }
    
}

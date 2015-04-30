/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_parejas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Ejercicio_Parejas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Random rd = new Random();
    int [][] matriz = new int [8][8];
    int [][] matriz2 = new int [8][8];
    int filasignar=0,columnasignar=0;
    int fila1,columna1,fila2,columna2, cont=0;
    boolean condicion = true;
    Scanner sc = new Scanner(System.in);
    
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriz2[i][j]=0;
            }
        }
    
        for (int i = 10; i < 33; i++) {
            for (int j = 0; j < 2; j++) {
                do {
                    filasignar=rd.nextInt(8);
                    columnasignar=rd.nextInt(8);
                } while (matriz[filasignar][columnasignar]!=0);
                matriz[filasignar][columnasignar]=i;
            }
        }
    
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println();
        }
        
        do {
            System.out.println("Insertar fila de primer número:");
            fila1=sc.nextInt();
            
            System.out.println("Insertar columna de primer número");
            columna1=sc.nextInt();
            
            System.out.println("Insertar fila de segundo número:");
            fila2=sc.nextInt();
            
            System.out.println("Insertar columna de segundo número");
            columna2=sc.nextInt();
            
            if (matriz[fila1][columna1]==matriz[fila2][columna2]) {
                System.out.println("¡Has acertado una pareja!");
                matriz2[fila1][columna1]=matriz[fila1][columna1];
                matriz2[fila2][columna2]=matriz[fila2][columna2];
                
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        System.out.print(matriz2[i][j]+" ");
                    }
                    System.out.println();
                }
                cont++;
                if (cont==32) {
                    System.out.println("¡Has acertado todas las parejas!");
                    condicion = false;
                }
            }
            
            if (matriz[fila1][columna1]!=matriz[fila2][columna2]) {
                System.out.println("Oh oh, has fallado, más suerte la próxima vez.");
                condicion = false;
            }
            
        } while (condicion);
        
        System.out.println("----------FIN DEL JUEGO----------");
    }
    
}

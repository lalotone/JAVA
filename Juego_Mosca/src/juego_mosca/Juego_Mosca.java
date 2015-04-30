/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juego_mosca;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Juego_Mosca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        char[][] matriz = new char[10][10]; /*Esta es la "segunda dimension", las filas*/
        Random fila = new Random();
        Random columna = new Random();
        boolean ContinuaJuego =  true;
        int RespuestaFila;
        int RespuestaColumna;
        int numFila;
        int numColumna;
        int contador = 0;
        int k = 11;
        System.out.println("EL JUEGO DE LA MOSCA!!!!");
        
        numFila = fila.nextInt(9);
        numColumna = columna.nextInt(9);
        for (int i = 0; i < 10; i++) {//esto sirve para que vaya recorriendo las filas
            for (int j = 0; j < 10; j++){//luego pasa a recorrer la columna
                matriz[i] [j] = 'X';/*Con esto le estamos diciendo que vaya rellenando
                las filas y las columnas con 0*/
                
            }
                                               }
        for (int i = 0; i < 10; i++) {//esto sirve para que vaya recorriendo las filas
          for (int j = 0; j < 10; j++){//luego pasa a recorrer la columna
                System.out.print(matriz[i][j] + " ");/*Esto se utiliza para ir imprimiendo o rellenando
                la matriz con los ceros que le hemos dicho arriba*/
            }  
            System.out.println(" ");
    
    }
        System.out.println("\nA ver si acierta...¿Donde esta la mosca?");
        do{
        System.out.println("Introduzca la fila en la que cree que esta");
        RespuestaFila = entrada.nextInt(); 
        
        
        System.out.println("Introduzca la columna en la que cree que esta");
        RespuestaColumna = entrada.nextInt(); 
        if ((numFila==RespuestaFila) && (numColumna==RespuestaColumna)){
        System.out.println("Enhorabuena, has pillado a la mosca");
        matriz[numFila] [numColumna]= 'M';
        for (int i = 0; i < 10; i++) {//esto sirve para que vaya recorriendo las filas
          for (int j = 0; j < 10; j++){//luego pasa a recorrer la columna
                System.out.print(matriz[i][j] + " ");/*Esto se utiliza para ir imprimiendo o rellenando
                la matriz con los ceros que le hemos dicho arriba*/
            }  
            System.out.println(" ");
    
    }
        }else{
            
        
        k--;    
        contador++;
        matriz[RespuestaFila] [RespuestaColumna]= '0';
        for (int i = 0; i < 10; i++) {//esto sirve para que vaya recorriendo las filas
          for (int j = 0; j < 10; j++){//luego pasa a recorrer la columna
                System.out.print(matriz[i][j] + " ");/*Esto se utiliza para ir imprimiendo o rellenando
                la matriz con los ceros que le hemos dicho arriba*/
            }  
            System.out.println(" ");
    
    }
        System.out.println("\nHas fallado, prueba de nuevo, tienes " + k + " intentos");
        if(contador>10){
         matriz[numFila] [numColumna]= 'M';
        for (int i = 0; i < 10; i++) {//esto sirve para que vaya recorriendo las filas
          for (int j = 0; j < 10; j++){//luego pasa a recorrer la columna
                System.out.print(matriz[i][j] + " ");/*Esto se utiliza para ir imprimiendo o rellenando
                la matriz con los ceros que le hemos dicho arriba*/
            }  
            System.out.println(" ");
    
    }  
        ContinuaJuego=false;
        }
        }
        }
        while(ContinuaJuego);
        
}
}


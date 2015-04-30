/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo_matriz;

/**
 *
 * @author lalotone
 */
public class Ejemplo_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[10];
        int[][] matriz = new int[10][10]; /*Esta es la "segunda dimension", las filas*/
        
        
        
        for (int fila = 0; fila < 10; fila++) {//esto sirve para que vaya recorriendo las filas
            for (int columna = 0; columna < 10; columna++){//luego pasa a recorrer la columna
                matriz[fila] [columna] = 0;/*Con esto le estamos diciendo que vaya rellenando
                las filas y las columnas con 0*/
                                               }
        }
            
                for (int fila = 0; fila < 10; fila++) {//esto sirve para que vaya recorriendo las filas
            for (int columna = 0; columna < 10; columna++){//luego pasa a recorrer la columna
                System.out.print(matriz[fila][columna] + " ");/*Esto se utiliza para ir imprimiendo o rellenando
                la matriz con los ceros que le hemos dicho arriba*/
            }  
            System.out.println(" ");
        }
    }
        
}

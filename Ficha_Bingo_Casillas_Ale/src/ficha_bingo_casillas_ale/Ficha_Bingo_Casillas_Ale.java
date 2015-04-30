/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ficha_bingo_casillas_ale;

import java.util.Random;

/**
 *
 * @author lalotone
 */
public class Ficha_Bingo_Casillas_Ale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] bingo= new int[3][9];
        int PosColumna;
        int PosFila;
        int contador = 0;
        int numero = 10;
        Random posCol = new Random();
        Random posFil = new Random();
        Random numAle = new Random();
        
        
        for(int i = 0; i < 27; i++){
        PosFila=posFil.nextInt(3);
        PosColumna=posCol.nextInt(9);
        contador++;
        do{
            PosFila=posFil.nextInt(3);
            PosColumna=posCol.nextInt(9);
        }while(bingo[PosFila][PosColumna]!=0);
        
        bingo[PosFila][PosColumna]=numAle.nextInt(numero)+(PosColumna+1)*10;
    }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(bingo[i][j] + " ");
                
                }
            System.out.println(" ");
        }
        
    }
    /*Para ordenar las casillas debemos mentalizarnos en dividir la matriz(bingo) en pequeños arrays.
    Básicamente tenemos que ir recorriendo el array e irle preguntando si es mayor que el anterior. Para ello subiríamos el valor de
    la fila--> fila+1. Si es así podriamos utilizar algo así:
    int i, j, aux;
         for(i=0;i<A.length-1;i++)-->'A' en este caso haría referencia a nuestra columna.
              for(j=0;j<A.length-i-1;j++)
                   if(A[j+1]<A[j]){
                      aux=A[j+1];
                      A[j+1]=A[j];
                      A[j]=aux;
                   }
}
 */
    
}

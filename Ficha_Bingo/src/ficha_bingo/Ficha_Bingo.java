/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ficha_bingo;

import java.util.Random;

/**
 *
 * @author lalotone
 */
public class Ficha_Bingo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bingo[][] = new int[10][10];
        int fila;
        int columna;
        int numero = 10;
        Random numAleatorio = new Random();
        
        
        for (int i = 0; i < 3; i++) {
                
            for(int j = 0; j < 9; j++){
                bingo[i][j]=numAleatorio.nextInt(numero)+(j+1)*10;
                
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(bingo[i][j] + " ");
                
                }
            System.out.println(" ");
        }
        
        
    }
    
}

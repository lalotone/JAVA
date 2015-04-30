/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication35;

import java.util.Random;

/**
 *
 * @author lalotone
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    //Sirve para generar NUMEROS ALEATORIOS EN UN ARRAY SIN QUE SE REPITAN.
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        
        int[] numero = new int[10];
        int candidato;
        
        for (int i = 0; i < numero.length; i++) {
            candidato = rd.nextInt(90) +10;
            for (int j = 0; j < i; j++) {
                if (numero[j] == candidato){
                candidato = rd.nextInt(90) + 10;
                //i--;
                
                j=0;
                }
                
                                            }
            numero[i] = candidato;
            }
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i]+"-");
        }
        
        }
    }
    


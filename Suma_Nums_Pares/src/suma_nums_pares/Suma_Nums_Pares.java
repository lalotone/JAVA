/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_nums_pares;

import java.util.Scanner;

/**
 *
 * @author black
 */
public class Suma_Nums_Pares {
    private static int i;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              Scanner leerdatos;
        leerdatos = new Scanner(System.in);
                
                int numero;
                int suma=0;
    for(int i = 0; i<10; i++){
        System.out.println("Introduzca un numero para saber si es par: ");
        numero = leerdatos.nextInt();
    if (numero%2==0){
     suma= suma + numero;
    }
    else{
    System.out.println("El numero es impar, no se sumara");
    } 
    
    }
    System.out.println("La suma total es: "+suma);
    }
 }
 
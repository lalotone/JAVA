/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_100_numeros;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class Suma_100_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int dato;
       int suma=0;
       int contador=1;
       
       Scanner entrada=new Scanner(System.in)    ;
  while (contador <=100)  {
 //el while es el bucle que hace que sume los numeros 100 veces pero no mas, por ello el "<"
      
      System.out.print("\n\t Introduzca el dato número " + contador + ": ");
 
      dato=entrada.nextInt();
 suma= suma + dato;
 contador=contador + 1 ;
 }
 
     System.out.print("\n\t El resultado es " + suma);  
        
  }
}

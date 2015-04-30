/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_scanner;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class Suma_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pa=new Scanner(System.in);
        
         float dato1;
         float dato2;
        
        System.out.println("Introduce primer dato");
              dato1=pa.nextInt();
        System.out.println("Introduce segundo dato");
              dato2=pa.nextInt();
              
        float suma= dato1 + dato2    ; 
        
          System.out.println("La suma de " + dato1 + " + " + dato2 + " es = " + suma);
        
    }
}


    


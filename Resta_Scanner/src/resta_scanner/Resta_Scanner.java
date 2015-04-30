/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resta_scanner;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class Resta_Scanner {

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
              
        float resta= dato1 - dato2    ; 
        
          System.out.println("La resta de " + dato1 + " - " + dato2 + " es = " + resta);
        
    }
}



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package división;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class División {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner pa=new Scanner(System.in);
        
         int dato1;
         int dato2;
        
        System.out.println("Introduce primer dato");
              dato1=pa.nextInt();
        System.out.println("Introduce segundo dato");
              dato2=pa.nextInt();
              
        int divis= dato1 / dato2    ; 
        
      System.out.println("La division de " + dato1 + " / " + dato2 + " es = " + divis);
        
    }
}
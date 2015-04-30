/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class Lectura_Numero_Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner pa=new Scanner(System.in);
        
       
        
        System.out.println("Introduce primer dato");
            int  dato1=pa.nextInt();
        System.out.println("\nIntroduce segundo dato");
            int  dato2=pa.nextInt();
        
        if (dato1 > dato2){
            System.out.println(dato1);
        }else{ 
            System.out.println(dato2);
        }
      
    }
}

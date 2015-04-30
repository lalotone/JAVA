/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package media_tres_numeros;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class Media_Tres_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //hacer un ejercicio que haga la media de tres números.
        
        Scanner pa=new Scanner(System.in);
        
       
        
        System.out.println("Introduce primer dato");
            int  dato1=pa.nextInt();
        System.out.println("\nIntroduce segundo dato");
            int  dato2=pa.nextInt();
        System.out.println("\nIntroduce tercer dato");
            int  dato3=pa.nextInt();
        
        int resultadoprov = dato1 + dato2 + dato3 ;
        int resultadofinal = resultadoprov / 3;
        
        System.out.println("\n\n\nLa media de " + dato1 + ", " + dato2 + ", " + dato3 + " es 10"
                + " es= " +resultadofinal);
        
    }
}


    


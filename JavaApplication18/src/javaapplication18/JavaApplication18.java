/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author black
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] array;
        array = new int [6];
        
        for(int i=0;i<array.length; i++)
        {
           do
           {
             array[i]= (int) (Math.random()*100 +0);
             
           }while(array[i] % 2!= 0);//basicamente este while lo que esta haciendo es que hasta que no se imprima un numero par va a dar
           //x el culo con el while hasta que consiga un par, si no consigue un par seguira en el bucle while.
           //hasta que no consiga lo que quiera, un par, no parara con el while.
        
        
        }
        
        for(int i=0;i<array.length; i++)
        {
             System.out.print(array[i] + " ");
        
    }
}
}    

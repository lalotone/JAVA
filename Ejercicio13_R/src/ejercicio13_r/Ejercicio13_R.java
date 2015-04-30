/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio13_r;

/**
 *
 * @author lalotone
 */
public class Ejercicio13_R {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int contador1=0;
        int contador2=0;
        
       for(i=1;i<101;i++){
      
       if(i%2==0){
       contador1++;
       System.out.println(i +" Es multiplo de 2");
                 }
       if(i%3==0){
       contador2++;
       System.out.println(i +" Es  multiplo de 3");
                 }     
       
                         }
       System.out.println("El numero de multiplos de 2 es: "+ contador1);
       System.out.println("El numero de multiplos de 3 es: "+ contador2);
    }
    
}
    
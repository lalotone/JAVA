/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio12_r;

/**
 *
 * @author lalotone
 */
public class Ejercicio12_R {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int suma = 0;
        int suma2 = 0;
       for(i=0;i<101;i++){
       System.out.println(i);
       if(i%2==0){
       suma = suma + i;
                 }else{
       suma2 = suma2 + i;
                      }
       
                         }
       System.out.println("La suma de los pares es: "+ suma);
       System.out.println("La suma de los impares es: "+ suma2);
    }
    
}

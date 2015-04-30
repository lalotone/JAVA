/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numeros_pares_impares_examen;

/**
 *
 * @author lalotone
 */
public class Numeros_Pares_Impares_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("A continuacion se muestra la serie de numeros pares\n");
        int x;
        for (int i = 1; i < 6; i++) {
            x=i*2;
            System.out.println("Numero par:" +x);/*Aqui basicamente hay que cambiar la variable y por
            x dado que es la operacion que realmente mostrará los pares del 0 al 10.Como bien se puede observar 
            al ejecutar el programa muestra los pares: 2-4-6-8que se encuentran entre el 1 y el 10*/
        }
        System.out.println("A continuación se muestra la serie de numeros impares\n");
        int j=1;
         do
        {
            System.out.println("Numero impar:" +j);
            j=j+2;/*Aqui basicamente lo que hay que hacr es incrementar la j a +2 en vez de +1 dado que 
            si le incrementamos 1 lo que ocurrira es que imprimira la secuencia completa del 1 al 10:
            1-2-3-4-5-6-7-8-9. De la forma que j=j+2 imprimira 1-3-5-7-9(1)-(1+2)-(3+2), etc etc.*/
        }while(j<=10);
        }
        
    }
    


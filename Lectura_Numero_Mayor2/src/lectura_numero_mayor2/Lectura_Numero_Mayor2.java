/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura_numero_mayor2;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class Lectura_Numero_Mayor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numeros = new Scanner(System.in);
       
        //el scanner con el sistem in sirve para la recojida de datos.
      
      System.out.print("Introduzca primer número: ");
      int numero1 = numeros.nextInt();
    System.out.print("Introduzca segundo número: ");
      int numero2 = numeros.nextInt();
      System.out.print("Introduzca tercer número: ");
      int numero3 = numeros.nextInt();
      if   (numero1 > numero2)
            if   (numero1 > numero3)
                //esto se hace asi para comparar el numero 1 tambien con el número 3
                //le estas diciendo si el numero 1 es mayor que el dos Y(este es el otro if)
                //que el numero tres imprime que el mayor es numero 1
                //sino(else) imprime que el 3 es el mayor.
                //por descarte le estas diciendo que si el numero 1 no es mayor que el 3
                //el 3 es el mayor
               
              System.out.println("El número mayor es: " + numero1);
           else
               
              System.out.println("El número mayor es: " + numero3);
        
        else if(numero2 > numero3)
            //el else if significa en español "pero si", "mas si"
            //con esto le estas diciendo que TENIENDO EN CUENTA el anterior if doble que hemos utilizado
            //mire si el número 2 es mayor que el 3, si es asi, dices que el numero 2 es mayor
            //si no, le dices que el mayor es el numero 3.
              System.out.println("El número mayor es: " + numero2);
                else
              System.out.println("El número mayor es: " + numero3);
    }
}

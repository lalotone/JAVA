/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package if_elseif_and_or;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class If_ElseIf_And_Or {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leerdatos;
        leerdatos = new Scanner(System.in);
        
        int edad;
        
        System.out.print("\n\n\tInsterte su edad: ");
        edad=leerdatos.nextInt();
        
        if(edad>=18 && edad=<25){
        //esto significa que se tienen que cumplir las variables, las 2.
        
        }
        if(edad>=18 || edad=<25){
        //esto significa que se tiene que cumplir UNA de las variables.
        }
        
       //bucles de repetición 
       //funcionan de tal forma que hasta que no se les da una salida se repetiran continuamente.
       //las salida en el caso del ej de los 100 numeros es el 100, a partir del 
       // numero 100 sale del bucle
        
        for(int contador = 0 ; contador < 100 ; contador++)
            //se define la variable contador en los paréntesis 
            //el contador = 0 es el inicio y el <100 significa que contara hasta 100
            //es decir, del 0 al 100. El valor inicial, 0 en este caso, puede ser a nuestro gusto.
            //el contador es por ejemplo ¿0 es menor que 100? si, entonces es true con lo cual pasamos
            //al contador++ agregando 1, entonces el contador ya no estara al 0 sino al 1.
            //las siguiente vez... ¿1 es menor que 100? si, pues igual que arriba hasta que llegue a 100.
            // una vez que llegase a 100.... ¿100 es menor a 100? No, ya no se cumple el for, se acabo el bucle.
        {
        
        }
        int contador = contador + 1; 
        }
            
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_del_10_al1;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class Suma_Del_10_al1 {
    private static int i;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in);
        
        
        int numero = 0;
        int suma = 0;
        
        System.out.println("Inserte un número y el programa sumara sus anterores. ");
            numero = scan.nextInt();
            //esto recoje el dato con el que operaremos mas abajo poniendole la variable "i"
            
        for(i=numero; i> 0;i--){
           //esto lo que hace es de la variable "número" de arriba le va restando uno dado que le ponemos 
            // que número=i y que i es -- asi que irá restando valores que luego iremos sumando como he explicado mas
            //abajo. El programa ira sumando los valores hasta que el valor alcance el 0.
            
         
            while(numero<0){
                System.out.println("El programa no admite números negativos. ");
                System.out.println("Por favor, inserte un número positivo. ");
                numero = scan.nextInt();
            }//Aqui acaba el while.
            //Este While dentro del for sirve para especificar que el valor "numero" tiene que ser mayor que 0
            //de lo contrario nos echara los mensajes de no admite numeros negativos, inserte un numero positivo.
        suma = suma + i;
        }//aquí acaba el bucle del for que sirve para especificarle que al número que hemos metido le
        //vaya restando 1, por ello el "i--" ,es decir, pones 6 y luego en el bucle guardara los valores
        //del 6 al 0(recordar que i> 0). por ultimo creamos la variable suma que nos sirve para ir sumando
        //suma, que le hemos dicho que es 0 + "i" que sera 6 y como esta en el bucle le sumará 5+4+3+2+1 apareciendo 
        //solo una vez el mensaje de "inserte el número y el programa..." porque ese si esta fuera del for, si lo pusieramos dentro se
        //repetiria el mensaje también.
         
         System.out.println(suma);
    }
}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_valores_menos_0;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class Suma_Valores_Menos_0 {

    private static int i;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        //el scanner sirve para la recojida de datos que utilizaremos con el 
        //nextInt de
        //Abajo
       
        int datoentrada;
        int suma=0;
        //Aqui definimos las dos variables que aparecen a lo largo del programa.
        //dato entrada sirve para la recojida de dato como s puede apreciar 
        //debajo del system.out
        //basicamente lo que hace es funcionar como una variable que almacena
        //los datos que recoje el scan para luego utilizarlos mas adelante.
        
        System.out.println("Introduzca el valor");
        datoentrada = scan.nextInt();
        while (datoentrada == 0) { 
        //esto sirve para decir que cuando dato entrada sea igual a 0 imprima
        //el mensaje de que no puede ser 0, pase al break y acabe con el 
        //programa.
        System.out.println("El valor no puede ser 0, el programa se acabara");
        break;
        }
        while (datoentrada<0){
        //este otro while(cuando) dice que cuando dato entrada sea menor que 0
        //imprima un mensaje que diga el valor tiene que ser positivo, y no para
        //-ra de imprimir el mensaje hasta que metamos un valor positivo y se 
        //rompa el bucle pasando al for.
        System.out.println("El dato debe ser positivo");
        datoentrada = scan.nextInt();
        }
                for(i=datoentrada; i> 0;i--){
        //este for sirve para hacer principalmente la suma parcial repitiendo
        //el valor de "i" que es en realidad datoentrada, una vez que escribamos
        //un valor distinto de 0 y no negativo el programa ira descontando los 
        //numeros que hay detras del introducido por el user. Una vez k metamos
        //un dato correcto ej:6 este ira: 5,4,3,2,1 hasta el 0. cuando llegue a 
        //0->"i" no sera mayor que 0 asi que se rompera el for y saldra del 
        //bucle.
                    
        suma = i+suma;
        System.out.println("La suma provisional es: "+suma);
        //suma parcial
        //Esta suma lo que hace principalmente es sumar "i" a "suma" que la hmos
        //iniciado al principio como 0.
        //Ejemplo= pongo 5 como valor. 5+0=5 5+4=9 9+3=12 12+2=14 12+1=15 y ya
        //llegaria a 0 y se romperia el bucle.
    }
                System.out.println("La suma total es: " +suma);
}       //aqui basicamente es cuando ya se han acabado los bucles y hace la suma
    //total, que no es mas que mostrar "suma" dado que mostrara el total de las
    //sumas parciales que se han ido haciendo dentro del bucle for.
    }


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicación;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class Multiplicación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner es un objeto de java que nos permite almacenar los números enteros(int)
        //decimales(float),cadenas de caracteres(string), etc.
        //Tipo de Dato - Complejo -
            //Me permite capturar la entrada de datos del Usuario.
        
        //ahora vamos a reservar un espacio de memoria par nuestra variable(leerdatos):
    Scanner leerdatos=new Scanner(System.in);
    //Es decir, lo que estamos haciendo es asignarle un nombre a la variable llamandola 
    //leerdatos(como podria ser blablabla). Mas abajo se utiliza como se puede ver.
    //Aqui abajo definimos el lugar para guardar el dato de tipo numérico
    //Es una variable que ahora mismo esta en blanco, no tiene contenido.
         int dato1;  //Scanner - Que el dato lo inserta el usuario.
         int dato2;
         /*Se para la consola y se queda a la espera 
          * de la entrada de un dato del usuario, es secuencial. */
        
        System.out.println("\n\n\tIntroduce primer dato");
        /*  
         * \n sirve para un salto de linea    
         * /*
         /* \t sirve para una tabulación
         */
              dato1=leerdatos.nextInt();
        System.out.println("\n\n\tIntroduce segundo dato");
        //system.out.println se utiliza para mostrar contenido.
        //hace la misma funcion que el print -f o el echo
              dato2=leerdatos.nextInt();
              //es decir lo que se hace principalmente en lo de dato2=leerdatos.nextInt () ;
              //es que pasamos el scanner, por ello llamamos al scanner (leerdatos) para decirle
              //que almacene el siguiente valor entero (nextInt () ;) y asi lo guarde para despues hace la operación.
              //a esto le hemos puesto el nombre de dato2 arriba con lo de int dato1; .
              
              //para leer los datos de entrada como hemos dicho mas arriba utilizamos scanner
              
        int multi= dato1 * dato2    ; 
        
          System.out.println("\n\n\n\n\tLa multiplicación de " + dato1 + " * " + dato2 + " es = " + multi);
        
    }
}


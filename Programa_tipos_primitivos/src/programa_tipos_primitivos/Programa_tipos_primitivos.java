/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_tipos_primitivos;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class Programa_tipos_primitivos {
    private static int dato1;
    private static String dato2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner elementos=new Scanner(System.in);
        
        //el boleano es verdadero o falso, es que se cumpla una condicion, en el ej pag 38 
     //esta explicado.
     
        
        
        System.out.println("Introduce el primer dato, debe ser decimal");
        double datoDecimal=elementos.nextDouble();   
        System.out.println("Introduce el segundo dato, debe ser un numero entero");
        int datoEntero=elementos.nextInt();
        System.out.println("Introduce el tercer dato, debe ser un caracter");
        String datoCaracter=elementos.next();
        char laquetienesqueponer=datoCaracter.charAt(0);
        //estas dos lineas de arriba sirven para indicarle que tiene que cojer un valor 
        //de la misma forma que en los ejemplos de arriba había que meter decimales y enteros
        //lo que se hace poniendo la linea de char es que creamos una nueva variable para indicarle a la 
        //parte de arriba, la parte "elementos.next" el tipo de valor que tendremos que poner 
        //".charAt" ,En resumen, la parte del charAt pillara la primera letra de lo que pongamos en el next de arriba.
        System.out.println("Introduce el cuarto dato, debe ser booleano.");
        String datostring=elementos.next();
        
        boolean dtboleano;
        dtboleano=false;
       if(datostring.equals("A")) 
           dtboleano=true;
       else
           if(datostring.equals("B"))
               dtboleano=false;
      
       System.out.println("");
               
       
       
       
       
        
    }
}


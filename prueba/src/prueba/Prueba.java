/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada=new Scanner(System.in);

     
//"Este programa te pedira introducir tres numeros.Cuando lo hagas, se mostrara el mayor de ellos"
       
System.out.println("Introduzca primer dato");
int dato1=entrada.nextInt();
System.out.println("Introduzca segundo dato");
int dato2=entrada.nextInt();
System.out.println("Introduzca tercer dato");
int dato3=entrada.nextInt();
       
     if(dato1 > dato2)
       {if(dato1 > dato3)     
             System.out.println("El mayor es " + dato1);
        else 
         System.out.println("El mayor es " + dato3);
       }
     else
       {if (dato2 > dato3)
             System.out.println("El mayor es " + dato2);  
        else 
         System.out.println("El mayor es " + dato3);  
       }
   }
   
}

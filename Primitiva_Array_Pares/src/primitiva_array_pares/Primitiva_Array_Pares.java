/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiva_array_pares;

import java.util.Scanner;

/**
 *
 * @author black
 */
public class Primitiva_Array_Pares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner sc= new Scanner(System.in);
        int[] boleto = new int[6];
        System.out.println();
        for( int i=0; i< boleto.length ; i++)
             {
               boleto[i]= (int) (Math.random()*100+0);
             }//basicamente el array comienza en uno(en realidad empieza en 0 hasta el 5, 0 1 2 3 4 5. Es decir, va a crear 6
        //numeros random dado que cada vez que cree uno el boleto[i] se incrementara porque hemos puesto el i++ hasta que llegue a 6
        //que es la posicion que le hemos dado al array en la parte de arriba. Cuando suba hasta el 6 el for dejara de cumplirse dado que
        //i(que sera 6 dado que se ha ido incrementando) ya no es menor que boleto.lenght que es [6], osease, 6.
        for(int i=0; i<boleto.length;i++)     
        System.out.print(boleto[i] + " " );
        for(int f=0; f<6; f++ )
        {
            System.out.println("\nInserte el numero");
            int datoUsuario= sc.nextInt();
            if(boleto[f]== datoUsuario)
                {
                  System.out.println("Ha acertado el numero"); 
                }else {System.out.println("Has fallado el numero");}
            
        }
        for(int i=0; i<boleto.length;i++)     
        System.out.print(boleto[i] + " " );
    }
    

    }
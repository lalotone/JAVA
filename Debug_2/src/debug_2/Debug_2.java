/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package debug_2;

import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Debug_2 {
    private static int i;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan =new Scanner(System.in);
	int suma=1;
	System.out.println("Ingrese un numero");
	int numero=scan.nextInt();

	for(int i=numero;i>0;i--){
		suma=suma*i;
                       
	}
	System.out.println("El factorial de "+numero+" es "+suma);
        /*Aqui en vez de poner "i" hay que poner suma dado que si ponemos "i" lo que pasara
        es que mostrara 0, que es el valor que acaba de mostrar tras hacer el decremento del numero
        que es 0, si metemos por ejemplo 5, hara 5 veces el bucle y despues mostrara 0 dado que i al irse
        restando de 1 en 1 acabara valiendo 0 ya que le especificamos que tiene que llegar hasta el 0*/
	}
    }
    


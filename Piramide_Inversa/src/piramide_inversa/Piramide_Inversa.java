/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide_inversa;

/**
 *
 * @author black
 */
public class Piramide_Inversa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 10;//aqui especificamos el numer de asteriscos que habra al principio
        //e ira restandolos con el "contador--"
        //ponemos el contador al 10
        while(contador > 0){//le decimos que tiene que ser mayor que el 0.
            for (int i = 0; i< contador; i++){//le decimos que tiene que funcionar el bucle 
        //del for hasta que el contador funcion hasta que i alcance al contador que es 10.
        System.out.print("*");
        //es decir empezara con 10 asteriscos dado que se lo hemos especificado en el contador.
        //cada vez que se cumpla el bucle hasta que i alcance al contador decrementara 
        //el numero de asteriscos quitandole uno por el contador--.
        
        }
            System.out.println();
            contador --;}
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiva;

import java.util.Scanner;

/**
 *
 * @author black
 */
public class Primitiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("*****PRIMITIVA*****");
        System.out.println("SUERTE A LOS JUGADORES");
        System.out.println("\nEl numero premiado es: ");

        int numero1 = (int) (Math.random() * 90 + 10);

        int numero2 = (int) (Math.random() * 90 + 10);

        int numero3 = (int) (Math.random() * 90 + 10);

        int numero4 = (int) (Math.random() * 90 + 10);

        int numero5 = (int) (Math.random() * 90 + 10);

        int numero6 = (int) (Math.random() * 90 + 10);

        System.out.println("  " + numero1 + " "
                + numero2 + " " + numero3 + " " + numero4 + " "
                + numero5 + " " + numero6);
        System.out.println("\nPor favor introduzca de uno en uno los valores de su boleto,el programa le indicara si ha acertado o ha fallado");
        for (int i = 0; i < 6; i++) {
            
            System.out.println("->Introduzca su numero:");
            int datoentrada = scan.nextInt();

            if (datoentrada == numero1) {
                System.out.println("El numero 1 lo has acertado, enhorabuena.");
            } else if (datoentrada == numero2) {
                System.out.println("El numero 2 lo has acertado, enhorabuena.");
            } else if (datoentrada == numero3) {
                System.out.println("El numero 3 lo has acertado, enhorabuena.");
            } else if (datoentrada == numero4) {
                System.out.println("El numero 4 lo has acertado, enhorabuena.");
            } else if (datoentrada == numero5) {
                System.out.println("El numero 5 lo has acertado, enhorabuena.");
            } else if (datoentrada == numero6) {
                System.out.println("El numero 6 lo has acertado, enhorabuena.");
            } else {
                System.out.println("Has fallado el numero");//este else al final sirve para redireccionar de que en caso de que no aciertes
                //el numero el esle if te lleve al else que hemos puesto aqui al final.
            }



        }
    }
}

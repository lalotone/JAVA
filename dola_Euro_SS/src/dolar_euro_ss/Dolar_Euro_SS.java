/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolar_euro_ss;

import java.util.Scanner;
import beans.*;

/**
 *
 * @author lalotone
 */
public class Dolar_Euro_SS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dolar_Euro operar = new Dolar_Euro();
        int select;
        boolean condicion = true;

        System.out.println("****Sistema de calculo****");
        do {
            System.out.println("Indique que quiere hacer: ");
            System.out.println("1-Si quiere convertir de dolares a euros.");
            System.out.println("2-Si quiere convertir de euros a dolares.");
            System.out.println("3-Si quiere convertir de celsius a fahrenheit.");
            System.out.println("4-Si quiere convertir de fahreheit a celsius.");
            System.out.println("Working...");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Introduzca la cantidad que quiere convertir a euros: ");
                    operar.setNumero(scan.nextDouble());
                    System.out.println("La operacion dolares a euros da como resultado: " + operar.dolarEuro());
                    break;
                case 2:
                    System.out.println("Introduzca la cantidad que quiere convertir a dolares: ");
                    operar.setNumero(scan.nextDouble());
                    System.out.println("La operacion euros a doalres da como resultado: " + operar.euroDolar());
                    break;
                case 3:
                    System.out.println("Introduzca la cantidad que quiere convertir a fahrenheit: ");
                    operar.setNumero(scan.nextDouble());
                    System.out.println("La operacion de celsius a fahrenheit da: " + operar.celsiusFahrenheit());
                    break;
                case 4:
                    System.out.println("Introduzca la cantidad que quiere convertir a celsius: ");
                    operar.setNumero(scan.nextDouble());
                    System.out.println("La operacion de fahrenheit a celsius da: " + operar.fahrenheitCelsius());
                    break;
            }
            System.out.println("\n¿Quiere realizar alguna operacion mas?");
            System.out.println("1.-Si");
            System.out.println("2.-No");
            select = scan.nextInt();
            if (select == 1) {
                condicion = true;
            } else {
                break;
            }
        } while (condicion = true);
        System.out.println("***Fin del Programa***");
    }

}

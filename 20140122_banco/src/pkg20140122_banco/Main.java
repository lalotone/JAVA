/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20140122_banco;

import beans.Cuenta;
import java.util.Scanner;

/**
 *
 * @author A7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
//        Cuenta cuenta1 = new Cuenta(null, null, saldo, tipoInteres, transaccionesRealizadas);
        
        Cuenta cuenta1 = new Cuenta();
        
        System.out.println("Introduzca su nombre");
        String nombre = sc.nextLine();
        cuenta1.setNombre(nombre);
        System.out.println("Introduzca el numero de cuenta");
        String cuenta = sc.nextLine();
        cuenta1.setCuenta(cuenta);
        System.out.println("diga su tipo de interes");
        double tipoInteres = sc.nextDouble();
        cuenta1.setTipoInteres(tipoInteres);
        System.out.println("Cuantas perras desea ingresar");
        double ingreso = sc.nextDouble(); 
        cuenta1.ingreso(ingreso);
        
        double mostrarSaldo;
        mostrarSaldo = cuenta1.getSaldo();
        System.out.println(mostrarSaldo);
        
        System.out.println("cuantas perras vas a sacar");
        double reintegro = sc.nextDouble();
        cuenta1.reintegro(reintegro);
        mostrarSaldo = cuenta1.getSaldo();
        System.out.println(mostrarSaldo);
        
        System.out.println("El titular de la cuenta es: " + cuenta1.getNombre());
        System.out.println("El numero de la cuenta es: " + cuenta1.getCuenta());
        System.out.println("Numero de transacciones realizadas = " + cuenta1.getTransaccionesRealizadas());
        System.out.println("El saldo final es: " + cuenta1.getSaldo());
        
    }
}

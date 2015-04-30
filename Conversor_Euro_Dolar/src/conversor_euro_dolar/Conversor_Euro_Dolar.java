package conversor_euro_dolar;
import java.util.Scanner;
import beans.Finanzas;
public class Conversor_Euro_Dolar {
    public static void main(String[] args) {
        boolean condicion = true;
        Scanner scan = new Scanner(System.in);
        Finanzas moneda = new Finanzas();
        do {
            System.out.println("Introduzca la cantidad monetaria que desea convertir: ");
            double valor = scan.nextDouble();
            System.out.println("Seleccione su moneda (1.Euro  2.Dolar)");
            int eleccion = scan.nextInt();
            switch (eleccion) {
                case 1:
                    moneda.setEuro(valor);
                    valor = moneda.eurosToDolares();
                    System.out.println("El valor de su moneda en dólares es:");
                    System.out.printf("%.2f $ %n", valor);
                    break;
                case 2:
                    moneda.setDolar(valor);
                    valor = moneda.dolaresToEuros();
                    System.out.println("El valor de su dinero en euros es:");
                    System.out.printf("%.2f € %n", valor);
                    break;
                default:
                    System.out.println("Moneda no válida, no ha sido especificada ninguna.");
                    break;
            }
            System.out.println("Pulse cualquier otra tecla para realizar otra operación.");
            System.out.println("Escriba 'Exit' para salir.");
            String respuesta = scan.next();
            if (respuesta.equalsIgnoreCase("Exit")) {
                condicion = false;
            }
        } while (condicion);
        System.out.println("----------Fin de programa----------");
    }
}
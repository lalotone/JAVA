package entradadatos;
import java.io.*;
import java.util.Scanner;
class Principal
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int salida;
        String salida1 = null;
        String salida2 = null;
        String salida3 = null;
        boolean resp = true;

        try {
            do {
                System.out.println("Introduzca que funcion desea llevar a cabo: ");
                System.out.println("1.-Comprobar estado de la red.");
                System.out.println("2.-Comprobar los ficheros/directorios.");
                System.out.println("3.-Apagar el sistema.");
                System.out.println("4.-Salir del programa.");
                salida = scan.nextInt();
                // Ejecutamos el comando
                switch (salida) {
                    case 1:
                        Process a = Runtime.getRuntime().exec("ifconfig");
                        BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                                a.getInputStream()));
                        salida1 = stdInput.readLine();
                        System.out.print(salida1);
                        break;
                    case 2:
                        Process b = Runtime.getRuntime().exec("ls /home/lalotone");
                        BufferedReader stdInput2 = new BufferedReader(new InputStreamReader(
                                b.getInputStream()));
                        salida2 = stdInput2.readLine();
                        System.out.print(salida2);
                        break;
                    case 3:
                        Process c = Runtime.getRuntime().exec("poweroff");
                        BufferedReader stdInput3 = new BufferedReader(new InputStreamReader(
                                c.getInputStream()));
                        salida3 = stdInput3.readLine();
                        System.out.print(salida3);
                        break;
                    case 4:
                        System.out.println("Se finaliza el programa");
                        resp = false;
                        break;
                }
            } while (resp != false);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error del sistema");
        }
    }
    
}

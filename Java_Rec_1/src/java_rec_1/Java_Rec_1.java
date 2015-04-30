package java_rec_1;

import java.util.Scanner;
import beans.*;

import java.util.ArrayList;

/**
 *
 * @author lalotone
 */
public class Java_Rec_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int movimiento;
        int respuesta;
        boolean condicion = true;
        ArrayList<gestionMultimedia> lista = new ArrayList();
        ArrayList<Multimedia> listaMultimedia = new ArrayList();
        gestionMultimedia operar = new gestionMultimedia(listaMultimedia);
        System.out.println("Bienvenido al almacen multimedia");
        do {
            System.out.println("Inserte: ");
            System.out.println("1 si quiere añadir una Pelicula: ");
            System.out.println("2 si quiere añadir un disco de Musica: ");
            System.out.println("3 si quiere ver la lista del almacen: ");
            movimiento = scan.nextInt();

            switch (movimiento) {
                case 1:
                    Multimedia peli = new Pelicula("", 0, "", "");
                    Pelicula pelic = (Pelicula) peli;
                    System.out.println("Introduzca el autor: ");
                    peli.setAutor(scan.next());
                    System.out.println("Introduzca el titulo: ");
                    peli.setTitulo(scan.next());
                    System.out.println("Introduzca la duracion: ");
                    peli.setDuracion(scan.nextInt());
                    System.out.println("Introduzca el Actor Principal: ");
                    pelic.setAutorPrincipal(scan.next());
                    listaMultimedia.add(peli);
                    break;
                case 2:
                    Multimedia disco = new Musica("", 0, "", "");
                    Musica disc = (Musica) disco;
                    System.out.println("Introduzca el autor: ");
                    disco.setAutor(scan.next());
                    System.out.println("Introduzca el titulo: ");
                    disco.setTitulo(scan.next());
                    System.out.println("Introduzca la duracion: ");
                    disco.setDuracion(scan.nextInt());
                    System.out.println("Introduzca el Cantante Principal");
                    disc.setCantantePrincipal(scan.next());
                    listaMultimedia.add(disco);
                    break;
                case 3:
                    operar.mostrarLista();
                    break;

            }
            System.out.println("¿Desea hacer alguna operacion mas?");
            System.out.println("1-SI");
            System.out.println("2-NO");
            respuesta = scan.nextInt();
            if (respuesta == 1) {

            } else {
                break;
            }
        } while (condicion = true);
    }

}

package multimedia_java_ex;

import java.util.Scanner;
import beans.Pelicula;
import beans.Multimedia;
import beans.CD_Fotos;
import beans.CD_Videos;
import beans.Disco;
import beans.Estanteria_Multimedia;

import java.util.ArrayList;

/**
 *
 * @author lalotone
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int movimiento;
        int movimiento2;
        boolean condicion = true;
        ArrayList<Multimedia> listaMultimedia = new ArrayList();
        Estanteria_Multimedia operar = new Estanteria_Multimedia(listaMultimedia);

        /*Multimedia pelicula1 = new Pelicula("12","34","56",9);
         Multimedia cdf1 = new CD_Fotos(9,"78","90",9);
         Multimedia cdv1 = new CD_Videos(9,"11","22",9);
         
         listaMultimedia.add(cdv1);
         listaMultimedia.add(pelicula1);
         listaMultimedia.add(cdf1);*/
        System.out.println("***Bienvenido al almacen multimedia***");
        do {
            System.out.println("¿Que operacion desea realizar?");
            System.out.println("1-.Almacenar una Pelicula.");
            System.out.println("2-.Almacenar un Disco.");
            System.out.println("3-.Almacenar un CD_Fotos.");
            System.out.println("4-.Almacenar un CD_Videos.");
            System.out.println("5-.Mostrar la lista de lo almacenado.");
            System.out.println("6-.Sumar el duración de los archivos multimedia.");
            System.out.println("7-.Borrar la lista al completo.");

            movimiento = scan.nextInt();

            switch (movimiento) {
                case 1:

                    Multimedia pelicula = new Pelicula("", "", "", 0);
                    Pelicula peli = (Pelicula) pelicula;
                    System.out.println("Introduzca el titulo: ");
                    pelicula.setTitulo(scan.next());
                    System.out.println("Introduzca el autor: ");
                    pelicula.setAutor(scan.next());
                    System.out.println("Introduzca el Actor Principal: ");
                    peli.setActorPrincipal(scan.next());
                    System.out.println("Introduzca la duración: ");
                    pelicula.setDuracion(scan.nextInt());

                    listaMultimedia.add(pelicula);
                    break;
                case 2:
                    Multimedia disco = new Disco("", "", "", 0);
                    Disco dis = (Disco) disco;
                    System.out.println("Introduzca el titulo: ");
                    disco.setTitulo(scan.next());
                    System.out.println("Introduzca el autor: ");
                    disco.setAutor(scan.next());
                    System.out.println("Introduzca el Genero");
                    dis.setGenero(scan.next());
                    System.out.println("Introduzca la duración: ");
                    disco.setDuracion(scan.nextInt());

                    listaMultimedia.add(disco);
                    break;
                case 3:
                    Multimedia cdf = new CD_Fotos(0, "", "", 0);
                    CD_Fotos cd = (CD_Fotos) cdf;
                    System.out.println("Introduzca el Stock de Fotos: ");
                    cd.setNumFotos(scan.nextInt());
                    System.out.println("Introduzca el titulo: ");
                    cdf.setTitulo(scan.next());
                    System.out.println("Introduzca el autor: ");
                    cdf.setAutor(scan.next());
                    System.out.println("Introduzca la duración: ");
                    cdf.setDuracion(scan.nextInt());

                    listaMultimedia.add(cdf);
                    break;
                case 4:
                    Multimedia cdv = new CD_Videos(0, "", "", 0);
                    CD_Videos cd2 = (CD_Videos) cdv;
                    System.out.println("Introduzca el Stock de Videos: ");
                    cd2.setNumVideos(scan.nextInt());
                    System.out.println("Introduzca el titulo: ");
                    cdv.setTitulo(scan.next());
                    System.out.println("Introduzca el autor: ");
                    cdv.setAutor(scan.next());
                    System.out.println("Introduzca la duración: ");
                    cdv.setDuracion(scan.nextInt());

                    listaMultimedia.add(cdv);
                    break;
                case 5:
                    if (listaMultimedia.isEmpty()) {
                        System.out.println("No hay elementos en la lista.");
                    } else {
                        for (int i = 0; i < listaMultimedia.size(); i++) {
                            System.out.println("\n" + listaMultimedia.get(i).toString());
                        }
                    }
                    break;
                case 6:
                    operar.sumaDuracion();
                    break;
                case 7:
                    listaMultimedia.clear();
                    break;
            }
            System.out.println("¿Desea hacer alguna operacion mas?");
            System.out.println("1.-Si");
            System.out.println("2.-No");
            movimiento2 = scan.nextInt();
            if (movimiento2 == 1) {
                condicion = true;
            } else {
                condicion = false;
                break;
            }

        } while (condicion = true);
    }

}

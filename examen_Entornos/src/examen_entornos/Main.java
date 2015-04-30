package examen_entornos;

import java.util.Scanner;
import beans.*;
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
        ArrayList<Persona> lista = new ArrayList();
        ArrayList<Viaje> listav = new ArrayList();
        
        Persona cliente = new Cliente(0, "", "", 0);
        Persona tecnico1 = new Tecnico(1,2,3,9,"abc","abc",9);
        Persona tecnico2 = new Tecnico(1,2,3,9,"Misd","siluro",9);
        Persona tecnico3 = new Tecnico(1,2,3,9,"lolo","lurule",9);
        Viaje viaje1 = new Viaje(1,2,3,"sisi");
        Viaje viaje2 = new Viaje(1,2,3,"sisinono");
      
        lista.add(tecnico1);
        lista.add(tecnico2);
        lista.add(tecnico3);
        listav.add(viaje1);
        listav.add(viaje2);
        for (int i = 0; i < listav.size(); i++) {
          System.out.println(listav.get(i).toString());  
        }
        
        int eleccion;
        
        
        System.out.println("Agencia de Viajes Mochuelo Flyer");
        System.out.println("Introduzca: ");
        System.out.println("1. Si quiere dar de alta a un nuevo cliente.");
        System.out.println("2. Salir");
        eleccion = scan.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println("Va a introducir un nuevo cliente");
                System.out.println("Introduzca el dni del cliente: ");
                cliente.setDni(scan.nextInt());
                System.out.println("Introduzca nombre: ");
                cliente.setNombre(scan.next());
                System.out.println("Introduzca direccion: ");
                cliente.setDirección(scan.next());
                System.out.println("Introduzca telefono");
                cliente.setTelefono(scan.nextInt());
                Cliente cliente0 = (Cliente) cliente;
                lista.add(cliente0);
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i).toString());
                }
                break;
            case 2:
                System.out.println("Ha elegido salir del programa.");
                break;
        }
        System.out.println("Fin del programa");
    }

}

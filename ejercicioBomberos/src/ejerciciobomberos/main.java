package ejerciciobomberos;

import beans.Bombero;
import beans.OperacionBombero;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Bombero[] listaBomberos = new Bombero[6];
        Scanner sc = new Scanner(System.in);
        String nombre, puesto;
        int edad, salario, opcion;
        int cantidad;

        for (int i = 0; i < listaBomberos.length; i++) {
            Bombero bombero = new Bombero();
            System.out.println("Inttroduce nombre: ");
            nombre = sc.next();
            System.out.println("Introduce edad: ");
            edad = sc.nextInt();
            System.out.println("Inttroduce puesto: ");
            puesto = sc.next();
            System.out.println("Introduce salario: ");
            salario = sc.nextInt();
            bombero.ponerBombero(nombre, edad, puesto, salario);
            listaBomberos[i] = bombero;
            
        }
        
        do {
            System.out.println("Introduce la operacion 1 sumar bombero y 0 prearar coche; ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    //sumar bomberos
                    int numeroB1,
                     numeroB2;
                    Bombero bomberoTotal;

                    do {

                        System.out.println("Introduce numero bombero");
                        numeroB1 = sc.nextInt();

                        System.out.println("Introduce numero bombero dos");
                        numeroB2 = sc.nextInt();
                    } while ((numeroB1 - 1 > listaBomberos.length || numeroB1 <= 0) && (numeroB2 - 1 > listaBomberos.length || numeroB2 <= 0));

                    OperacionBombero operacionBombero = new OperacionBombero();
                    bomberoTotal = operacionBombero.Suma(listaBomberos[numeroB1 - 1], listaBomberos[numeroB2 - 1]);

                    System.out.println("Nombre " + bomberoTotal.getNombre() + "Edad " + bomberoTotal.getEdad() + "Piuesto" + bomberoTotal.getPuesto() + "Salario" + bomberoTotal.getSalario());

                    break;

                case 0:
                    // preparar coche

                    System.out.println("¿Cuantos bomberos quiere que vayan?");
                    cantidad = sc.nextInt();
                    int arrayNUmeros[] = new int[cantidad];
                    for (int i = 0; i < arrayNUmeros.length - 1; i++) {
                        System.out.println("¿Que posicion quiere que lleven?");
                        arrayNUmeros[i] = sc.nextInt();
                    }
                    //Bombero arrayBomberos[] = new Bombero[cantidad];

                    for (int i = 0; i < listaBomberos.length - 1; i++) {
                        arrayBomberos[i] = listaBomberos[arrayNUmeros[i]];
                    }

                    switch (cantidad) {
                        case 1:
                                
                            break;
                        case 2:

                            break;
                        case 3:

                            break;

                        case 4:
                            break;

                        case 5:

                            break;
                        case 6:

                            break;

                    }

                    break;

            }
        } while (opcion != 1 && opcion != 0);

    }
}

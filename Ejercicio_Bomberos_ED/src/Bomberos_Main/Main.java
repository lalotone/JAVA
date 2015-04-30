package Bomberos_Main;

import java.util.Scanner;
import beans.Bombero;
import beans.OperacionBombero;

public class Main {

    public static void main(String[] args) {
        String nombre;
        String puesto;
        int edad;
        int salario;
        int eleccion;
        int bomselect1;
        int bomselect2;
        int capacidad;
        Scanner sc = new Scanner(System.in);
        Bombero[] Arraybomberos = new Bombero[6];

        for (int i = 0; i < Arraybomberos.length; i++) {
            System.out.println("Introduce");
            System.out.println("Nombre");
            nombre = sc.next();
            System.out.println("Puesto");
            puesto = sc.next();
            System.out.println("Edad");
            edad = sc.nextInt();
            System.out.println("Salario");
            salario = sc.nextInt();
            Arraybomberos[i] = new Bombero(nombre, edad, puesto, salario);
        }
        OperacionBombero operarBomberos = new OperacionBombero();
        operarBomberos.PonerBomberos(Arraybomberos[0], Arraybomberos[1], Arraybomberos[2], Arraybomberos[3], Arraybomberos[4], Arraybomberos[5]);
        //el for es para hacer varias pruebas seguidas sin tener que introducir nuevos bomberos.
        for (int z = 0; z < 5; z++) {
            System.out.println("Que desea hacer");
            System.out.println("1. Crear el SUPERBOMBERO DEFINITIVO CON SU SUPER MANGUERA");
            System.out.println("2. Preparar el coche");
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("Código del primer bombero");
                    bomselect1 = sc.nextInt();
                    System.out.println("Código del segundo bombero");
                    bomselect2 = sc.nextInt();
                    operarBomberos.suma(bomselect1, bomselect2);
                    break;
                case 2:
                    System.out.println("Cuantos bomberos iran en el coche");
                    capacidad = sc.nextInt();
                    int viajeros[] = new int[capacidad];
                    System.out.println("Que bomberos iran?(el orden será conductor, manguera 1, manguera2, aux1, aux 2, aux 3)");
                    for (int i = 0; i < capacidad; i++) {
                        viajeros[i] = sc.nextInt();
                    }

                    switch (capacidad) {
                        case 1:
                            operarBomberos.preparaCoche(viajeros[0]);
                            break;
                        case 2:
                            operarBomberos.preparaCoche(viajeros[0], viajeros[1]);
                            break;
                        case 3:
                            operarBomberos.preparaCoche(viajeros[0], viajeros[1], viajeros[2]);
                            break;
                        case 4:
                            operarBomberos.preparaCoche(viajeros[0], viajeros[1], viajeros[2], viajeros[3]);
                            break;
                        case 5:
                            operarBomberos.preparaCoche(viajeros[0], viajeros[1], viajeros[2], viajeros[3], viajeros[4]);
                            break;
                        case 6:
                            operarBomberos.preparaCoche(viajeros[0], viajeros[1], viajeros[2], viajeros[3], viajeros[4], viajeros[5]);
                            break;
                    }
            }
        }
    }
}

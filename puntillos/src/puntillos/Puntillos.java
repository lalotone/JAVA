package puntillos;

import beans.Punto;
import java.util.Scanner;

/**
 *
 * @author Roberto Domingo
 */
public class Puntillos {

   
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        
        System.out.println("Inserte coordenadas de x");
        int x1 = entradaDatos.nextInt();
        System.out.println("Inserte coordenadas de y");
        int y1 = entradaDatos.nextInt();
        Punto punto1 = new Punto(x1,y1);
        Punto punto2 = new Punto();
        int x2 = x1*2;
        punto2.setX(x2);
        int y2 = y1*2;
        punto2.setY(y2);
        System.out.println("Las coordenadas de punto1 son \nx= "+punto1.getX()+"\ny= "
                +punto1.getY());
        System.out.println("Las coordenadas de punto2 son \nx= "+punto2.getX()+"\ny= "
                +punto2.getY());
        punto1.suma(x2, y2);
        System.out.println("Las coordenadas de punto1 son \nx= "+punto1.getX()+"\ny= "
                +punto1.getY());
        System.out.println("Las coordenadas de punto2 son \nx= "+punto2.getX()+"\ny= "
                +punto2.getY());
    }
}

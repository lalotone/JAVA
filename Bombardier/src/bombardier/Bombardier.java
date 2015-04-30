/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bombardier;
import bombardier.Bombero;
import bombardier.Operacion_Bombero;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author lalotone
 */
public class Bombardier {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre;
        int edad;
        int bombQuieres;
        String puesto;
        int salario;
        int movimiento;
        
        System.out.println("Bienvenido al Parque de Bomberos A-123");
        System.out.println("Ahora vamos a proceder a introducir sus bomberos.");
        
        for (int i = 0; i < 2; i++) {
            
        System.out.println("Introduzca el nombre: ");
        nombre = scan.next();
        System.out.println("Introduzca la edad: ");
        edad = scan.nextInt();
        System.out.println("Introduzca el puesto: ");
        puesto = scan.next();
        System.out.println("Introduzca el salario: ");
        salario = scan.nextInt();
        Bombero bombero = new Bombero(nombre,edad,puesto,salario);
        
        Operacion_Bombero operar = new Operacion_Bombero();
        operar.anadirBombero(bombero);
        }
        

        System.out.println("Una vez introducidos los bomberos diga: ");
        System.out.println("Si quiere crear el güevon superbombero cuya utilidad dista a millas de la logica pulse 1: ");
        movimiento = scan.nextInt();
        System.out.println("Si quiere crear la bazofia de camion de bomberos que no llegara a apagar su casa pulse 2: ");
        movimiento = scan.nextInt();
        System.out.println("Si quiere ver la lista de bomberos pulse 3: ");
        movimiento = scan.nextInt();
        
        switch(movimiento){
            case 1:
                
                break;
            case 2:
                System.out.println("¿Cuantos bomberos quieres?: ");
                bombQuieres = scan.nextInt();
                System.out.println("¿Que posicion quieres que lleven?: ");
                
                break;
            case 3:
                
                break;
        }
    }
    
}

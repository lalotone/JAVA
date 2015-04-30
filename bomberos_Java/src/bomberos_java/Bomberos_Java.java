

package bomberos_java;

import beans.Bombero;
import beans.Coche;
import java.util.Scanner;
import beans.Operacion_Bombero;

/**
 *
 * @author lalotone
 */
public class Bomberos_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int operacionDeseada;
        boolean condicion = true;
        int preguntaFinal, opawah;
        int []sungulu = new int[6];
        Coche camion = new Coche();
        Operacion_Bombero operacion = new Operacion_Bombero();
        
        System.out.println("************************");
        System.out.println("Programa de los bomberos");
        System.out.println("************************");
        
        
        
        Bombero arraybomb[] = new Bombero[6];
        
        Bombero bombero1 = new Bombero();
        Bombero bombero2 = new Bombero();
        Bombero aux = new Bombero();
        Bombero bombero4 = new Bombero();
        Bombero bombero5 = new Bombero();
        Bombero bombero6 = new Bombero();
        
        
        
        
        arraybomb[0] = bombero1;
        arraybomb[1] = bombero2;
        arraybomb[2] = aux;
        arraybomb[3] = bombero4;
        arraybomb[4] = bombero5;
        arraybomb[5] = bombero6;
        
        
        
        System.out.println("Por favor introduzca los datos de los bomberos: ");
        System.out.println("***********************************************");
        
        for (int i = 0; i < 3 ; i++) {
           
        System.out.println("Introduzca el nombre del bombero: ");
        arraybomb[i].setNombre(scan.next());
        System.out.println("Introduzca la Edad: ");
        arraybomb[i].setEdad(scan.nextInt());
        System.out.println("Introduzca el puesto: ");
        arraybomb[i].setPuesto(scan.next());
        System.out.println("Introduzca el salario: ");
        arraybomb[i].setSalario(scan.nextInt());
        
        }
        System.out.println("¿Es esta su plantilla de bomberos?");
        System.out.println("Bombero1: "+bombero1 +"\nBombero2: "+bombero2+"\nAux: "+ aux +"\nBombero4: " +bombero4+ "\nBombero5: "+ bombero5 + "\nBombero6: " +bombero6);
        
        System.out.println("\nIntroduzca la operacion que quiera llevar a cabo con sus bomberos.");
        System.out.println("\n1-Concatenar los bomberos.");
        System.out.println("\n2-Preparar un coche de bomberos.");
        
        do{
        System.out.println("\n¿Que operacion desea llevar a cabo?: ");
        operacionDeseada = scan.nextInt();
      
        switch(operacionDeseada){
            case 1:
                System.out.println("\nOperacion 1: ");
                
                break;
            case 2:
                System.out.println("\nOperacion 2: ");
                System.out.println("¿Cuantos bomberos quieres en el camion?");
                opawah =scan.nextInt();
                switch(opawah-1){
                    case 0:
                        System.out.println("¿Que bomberos quieres meter?");
                        sungulu[opawah] =scan.nextInt();
                        camion = operacion.preparaCoche(arraybomb[sungulu[opawah]]);
                    case 1:
                        
                    case 2:
                        
                    case 3:
                        
                    case 4:
                        
                    case 5:
                        
                }
                break;
        }
            
        }while(condicion=false);
                    
    }
    
}

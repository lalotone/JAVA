/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas_multiplicar;

/**
 *
 * @author black
 */
public class Tablas_Multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num0 = 0;
        System.out.println("Tablas de Multiplicar del "+ num0);
        do {
            for (int i = 0; i <=10; i++) {
                System.out.println(num0 + "x" + i + "= " + (num0 * i));
                
            }
            num0++;
            
        }while (num0 <= 10);
        }
}
    


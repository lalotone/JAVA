/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package irrigadores_funcionando;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author black
 */
public class Irrigadores_Funcionando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datoentrada = new Scanner(System.in);
        Date date = new Date();
        DateFormat hora = new SimpleDateFormat("HH:mm");
        System.out.println(hora.format(date));
        System.out.println("¿A que hora conectamos los irrigadores?");
        String horaelegida = datoentrada.nextLine();

        while (true) {

            date = new Date();
            String horaAtipoString = hora.format(date);

            while (horaelegida.equals(horaAtipoString)) {
                System.out.println("Instrucciones");
                date = new Date();
                try {
                    Thread.sleep(60000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                date = new Date();
                horaAtipoString = hora.format(date);
                System.out.println("Bajando el Aspersor");  
            }
            

        }








    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author black
 */
public class Entornos_1 {
    private static String horaSistema;
    private static Object Date;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Irrigadores.
        
        Scanner datoentrada = new Scanner(System.in);
        
        DateFormat hora = new SimpleDateFormat("HH:mm");
        
        Date date = new Date();
        String horasistema = hora.format(Date);
        //hora = date.getHours();
        System.out.println("¿A que hora conectamos los irrigadores?");
        String horaelegida = datoentrada.nextLine();
        
        while(0==0){
        System.out.println("----------Dia Siguiente---------");
        
        System.out.println("¿Que hora es?");
            //hora = date.getHours();
           
                  
        horaelegida=horasistema;
        
        while (horasistema<horaelegida||horaSistema>horaelegida + 2){
            System.out.println("No es la hora correcta");
            //.out.println("¿Que hora es?");
            date = new Date();
            //hora = date.getHours();
             try {
            Thread.sleep(3000);}
                    catch(Exception e){
                        e.printStackTrace();}
        }
        System.out.println("Es la hora, subimos el irrigador");
        System.out.println("Irrigador subido a 150 cm");
        System.out.println("El irrigador funciona por 7200 segundos");
        while (horasistema<horaelegida + 2){
        System.out.println("¿Han pasado ya las 2 horas?");
        System.out.println("¿Que hora es?");
        date = new Date();
        //hora = date.getHours();
             try {
            Thread.sleep(3000);}
                    catch(Exception e){
                        e.printStackTrace();}
        }
        System.out.println("Ya es la hora del apagado, desconectando irrigador");
       
        System.out.println("Ahora si es la hora");
        System.out.println("Bajando el irrigador");
        System.out.println("--------Esperando al dia siguiente-------");
        System.out.println("--------Esperando al dia siguiente-------");
        System.out.println("--------Esperando al dia siguiente-------");
        }
        }
        }
    

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package memorizarpalabras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author asgur
 */
public class Memorizarpalabras 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int numAleatorio;
        String respuesta = "";
        String palabra = "";
        String[] almacen = {"patata","llavero","calabaza","leon","jamon","espeleologia","ordenador","coche","salchicha","toro","flato","remo","salsa","cebolla","tiro"};
        String[] juego = new String[15];
        Random aleatorio = new Random();
        Scanner leerEntrada = new Scanner(System.in);
        
        //respuesta += almacen[numAleatorio];
        for (int i = 0; i < 15; i++) //carga de forma aleatoria el array
        {
            numAleatorio = aleatorio.nextInt(15);
            juego[i] = almacen[numAleatorio];
        }
        for (int i = 0; i < 15; i++)//presenta las palabras a memorizar durante 6 segundos
        {
            palabra += " " + juego[i];
            System.out.print("\n\tMemoriza las palabras: " + palabra);
             try { 
              Thread.sleep(5000); 
            } catch(InterruptedException ex) { 
            Thread.currentThread().interrupt(); 
            }
             for (int j = 0; j < 50; j++)//borra la pantalla escribiendo 100 lineas en blanco
             {
                 System.out.println();
             }
             System.out.print("\n\tRepite las palabras: ");
             respuesta = leerEntrada.nextLine();
             String[] ListaRespuesta = respuesta.split(" ");//separa el string en un array
             for (int j = 0; j <= i; j++)//compara cada posición del array del jugador con cada posición del array del juego
             {
                 if(ListaRespuesta.length != i+1 || !ListaRespuesta[j].equalsIgnoreCase(juego[j]))
                 {
                     System.out.print("\n\tHas perdido. Has acertado " + i + " intentos");
                     System.exit(0);
                 }
             }
           
          }
        System.out.print("\n\tEnhorabuena, has ganado");
        }
}
            
        
        


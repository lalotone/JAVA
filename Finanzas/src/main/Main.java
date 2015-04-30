/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import cambio.cambio;

/**
 *
 * @author lalotone
 */
public class Main {

 public static void main(String[] args){
     
     cambio cambio1 = new cambio();
     cambio cambio2 = new cambio(1.55);
     
     double resultado1 = cambio1.dolaresToEuros(90);
     System.out.println("El cambio a euros es: " + resultado1);
     cambio2.eurosToDolares(50);
     cambio2 = cambio1;
     cambio2.dolaresToEuros(5);
 }
    
}

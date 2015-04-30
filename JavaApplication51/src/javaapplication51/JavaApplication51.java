/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication51;

import beans.Cliente;

/**
 *
 * @author lalotone
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = 
                new Cliente(1);
        Cliente cliente1 = 
                new Cliente();
        Cliente cliente2 = 
                new Cliente();
        Cliente cliente3 = 
                new Cliente();
        cliente.saludarCliente();
        
        cliente1.setDni("1872632F");
        String dni = cliente1.getDni();
        System.out.println("El DNI es: " +dni);
      }
    
}

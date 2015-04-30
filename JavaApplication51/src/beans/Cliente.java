/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Cliente {
    Scanner sc = new Scanner(System.in);
    
    // ATRIBUTOS (Lo que seria las columnas de la base de datos)
    public int idCliente;
    private String nombre;
    protected String apellido1;
    String apellido2;
    
    String dni;
    // CONSTRUCTOR
        //se puede crear un constructor vacio que no coje ningun parametro, como el siguiente public.+
    public Cliente(){
        
    }
    
    public Cliente(int idCliente){
        this.idCliente = idCliente;
    }
    public Cliente(String nombre){
        
    }
    public Cliente(int idCliente, String nombre){
        
    }

    public Cliente(int idCliente, String nombre, String apellido1, String apellido2, String dni) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
    }
    

    // MEtodos (PROCEDIMIENTOS
    //          /FUNCIONES)
    public void saludarCliente(){
        System.out.println("Hola soy el Cliente" +idCliente);
    }
    public String leerValoresCliente(){
        String usuario = "Cliente{ID:" +this.idCliente+""
                + ",NOMBRE:" + this.nombre + "" + ",APELLIDO1:" 
                + this.apellido1 + "}";
    }

    public String getDni() {
     
    }
}

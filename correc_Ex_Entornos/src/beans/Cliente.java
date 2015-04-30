/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

/**
 *
 * @author lalotone
 */
public class Cliente extends Persona{

    public Cliente(String nombre, String apellidos, String direccion, String poblacion, int telefono, int dni) {
        super(nombre, apellidos, direccion, poblacion, telefono, dni);
    }
    
}

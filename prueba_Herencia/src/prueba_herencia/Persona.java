/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba_herencia;

/**
 *
 * @author lalotone
 */
public class Persona {
    private String rut;
    private String nombre;

    public Persona(){
    }
    
    protected void setDatos(String r, String n) {
        rut = r;
        nombre = n;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}

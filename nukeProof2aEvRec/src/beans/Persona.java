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
public class Persona {
    protected String nombre = "Ataulfo";
    protected String nombre2 = "Marciano";
    protected int edad;
    private String apellidos;
    private int dni;

    public Persona(String nombre, int edad, String apellidos, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    public Persona(){
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public void cambiarNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", apellidos=" + apellidos + ", dni=" + dni + '}';
    }
    
}

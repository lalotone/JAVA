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
public class Alumno extends Persona{
    private int codAlumno;

    public Alumno(String nombre, int edad, String apellidos, int dni, int codAlumno) {
        super(nombre, edad, apellidos, dni);
        this.codAlumno = codAlumno;
    }

    public int getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(int codAlumno) {
        this.codAlumno = codAlumno;
    }
    public int cambiarEdad(int edad){
        this.edad = edad;//Este si que se puede poner asi dado que es protected ;)
        //this.dni = dni;//Este no se puede dado que es private con lo cual aun siendo una clase heredada no permite ponerlos
        //dado que es private.
        return edad;
    }
    public String concatNombres(){
    String concatNombres = this.nombre +" "+ this.nombre2;
    return concatNombres;   
    }

    @Override
    public String toString() {
        return super.toString() +  "codAlumno=" + codAlumno + '}';
    }
    
}

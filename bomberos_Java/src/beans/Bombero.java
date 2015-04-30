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
public class Bombero {
    private String nombre;
    private int edad;
    private String puesto;
    private int salario;

    public Bombero(){
    }
    
    public Bombero(String nombre, int edad, String puesto, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Bombero{" + "nombre=" + nombre + ", edad=" + edad + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    public void ponerBombero(String n, int e, String p, int s){
        this.nombre=n;
        this.edad=e;
        this.puesto=p;
        this.salario=s;
    }
}

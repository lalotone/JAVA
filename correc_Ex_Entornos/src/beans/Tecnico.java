/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.util.Date;

/**
 *
 * @author lalotone
 */
public class Tecnico extends Persona{
    private Date fecha_contrata;
    private int tlfno_ino;
    private int salario;

    public Tecnico(Date fecha_contrata, int tlfno_ino, int salario, String nombre, String apellidos, String direccion, String poblacion, int telefono, int dni) {
        super(nombre, apellidos, direccion, poblacion, telefono, dni);
        this.fecha_contrata = fecha_contrata;
        this.tlfno_ino = tlfno_ino;
        this.salario = salario;
    }

    public Date getFecha_contrata() {
        return fecha_contrata;
    }

    public void setFecha_contrata(Date fecha_contrata) {
        this.fecha_contrata = fecha_contrata;
    }

    public int getTlfno_ino() {
        return tlfno_ino;
    }

    public void setTlfno_ino(int tlfno_ino) {
        this.tlfno_ino = tlfno_ino;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}

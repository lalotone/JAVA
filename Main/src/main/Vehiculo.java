/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author lalotone
 */
public class Vehiculo {
    //ATRIBUTOS
    public String patente;
    public String marca;
    //CONSTRUCTORES
    
    public Vehiculo(String patente, String marca) {
        this.patente = patente;
        this.marca = marca;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }
    
}

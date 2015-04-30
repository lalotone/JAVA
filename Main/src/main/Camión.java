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
public class Camión extends Vehiculo {
    public int Carga;

    public Camión(String patente, String marca) {
        super(patente, marca);
    }

    public Camión(int Carga, String patente, String marca) {
        super(patente, marca);
        this.Carga = Carga;
    }

    public int getCarga() {
        return Carga;
    }

    public void setCarga(int Carga) {
        this.Carga = Carga;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.util.ArrayList;

/**
 *
 * @author lalotone
 */
public class Mago extends Personaje{
    String[] arma = new String[3];
    
    public Mago(String nombre, int energia) {
        super(nombre, energia);
    }

    public String[] getArma() {
        return arma;
    }

    public void addArma(String[] arma) {
        this.arma = arma;
    }

    @Override
    void tipoDePersonaje() {
        
    }

    @Override
    public void alimentarse() {
        
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public String toString() {
        return super.toString() + "Mago{" + "arma=" + arma + '}';
    }
    
}

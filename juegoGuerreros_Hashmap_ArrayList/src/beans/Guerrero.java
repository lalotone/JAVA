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
public class Guerrero extends Personaje{
    String[] arma = new String[3];
    public Guerrero(String nombre, int energia) {
        super(nombre, energia);
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

    public String[] getArma() {
        return arma;
    }

    public void setArma(String[] arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return super.toString() + "Guerrero{" + "arma=" + arma + '}';
    }
    
}

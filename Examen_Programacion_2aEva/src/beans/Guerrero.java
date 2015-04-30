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
public class Guerrero extends Personaje {

    private String arma;
    private int ataque;

    public Guerrero() {
    }

    public Guerrero(String nombre, int energia) {
        super(nombre, energia);
    }

    public Guerrero(String arma) {
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int atacar() {
        ataque = energia - 10;
        return ataque;
    }

    @Override
    public void alimentarse() {

    }

    @Override
    public String toString() {
        return super.toString()
                + "Guerrero{" + "arma=" + arma + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

/**
 *
 * @author black
 */
public class Guerrero extends Personaje{
    String[] arma = new String[3];

    public Guerrero(String nombre, int energia) {
        super(nombre, energia);
    }

    public Guerrero() {
    }
    public void addArma(String armaAux){
        for (int i = 0; i < arma.length; i++) {
            if(arma[i] == null){
            arma[i] = armaAux;
            break;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Guerrero{" + "arma=" +arma[0]+ " "+arma[1]+" "+arma[2]+'}';
    }
    
}

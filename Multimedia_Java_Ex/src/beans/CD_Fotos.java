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
public class CD_Fotos extends Multimedia{
    private int numFotos;

    public CD_Fotos(int numFotos, String titulo, String autor, int duracion) {
        super(titulo, autor, duracion);
        this.numFotos = numFotos;
    }

    public int getNumFotos() {
        return numFotos;
    }

    public void setNumFotos(int numFotos) {
        this.numFotos = numFotos;
    }

    @Override
    public String toString() {
        return "CD_Fotos{"+super.toString() + "numFotos=" + numFotos + '}';
    }
    
}

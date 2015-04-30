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
public class CD_Fotos extends Multimedia {
    public int NumFotos;
    public CD_Fotos() {
    }

    public CD_Fotos(String titulo, String autor, int duración) {
        super(titulo, autor, duración);
    }

    public int getNumFotos() {
        return NumFotos;
    }

    public void setNumFotos(int NumFotos) {
        this.NumFotos = NumFotos;
    }

    @Override
    public String toString() {
        return super.toString() + "CD_Fotos{" + "NumFotos=" + this.NumFotos + '}';
    }
    
}

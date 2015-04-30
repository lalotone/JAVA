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
public class Fotos extends Multimedia{
    public int canFotos;

    public Fotos(int canFotos, String autor, String titulo, int duracion) {
        super(autor, titulo, duracion);
        this.canFotos = canFotos;
    }

    public int getCanFotos() {
        return canFotos;
    }

    public void setCanFotos(int canFotos) {
        this.canFotos = canFotos;
    }

    @Override
    public String toString() {
        return "Fotos{"+ super.toString() + "canFotos=" + canFotos + '}';
    }
    
}

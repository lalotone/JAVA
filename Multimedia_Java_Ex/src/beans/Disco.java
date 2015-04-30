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
public class Disco extends Multimedia{
    private String genero;

    public Disco(String genero, String titulo, String autor, int duracion) {
        super(titulo, autor, duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Disco{"+super.toString() + "genero=" + genero + '}';
    }
    
}

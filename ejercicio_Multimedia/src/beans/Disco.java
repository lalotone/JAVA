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
public class Disco extends Pelicula{
    public String genero;

    public Disco(String genero, String actorPrincipal, String titulo, String autor, int duración) {
        super(actorPrincipal, titulo, autor, duración);
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
        return "Disco{" + "genero=" + genero +  "titulo=" + titulo + ", autor=" + autor + ", duraci\u00f3n=" + duración + '}';
        //Devuelve la cadena con los distintos atributos.
    }
    
}

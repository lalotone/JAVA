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
public class Pelicula extends Multimedia{
    private String autorPrincipal;

    public Pelicula(String autorPrincipal, String autor, String titulo, int duracion) {
        super(autor, titulo, duracion);
        this.autorPrincipal = autorPrincipal;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    @Override
    public String toString() {
        return "Pelicula{"+super.toString()+ "autorPrincipal=" + autorPrincipal + '}';
    }
    
}

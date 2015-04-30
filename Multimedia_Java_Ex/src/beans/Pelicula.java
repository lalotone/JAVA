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
    private String actorPrincipal;

    public Pelicula(String actorPrincipal, String titulo, String autor, int duracion) {
        super(titulo, autor, duracion);
        this.actorPrincipal = actorPrincipal;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    @Override
    public String toString() {
        return "Pelicula{" +super.toString() + "actorPrincipal=" + actorPrincipal + '}';
    }

    
}

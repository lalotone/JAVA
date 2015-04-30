/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

class Pelicula extends Multimedia {

    String actorPrincipal;

    public Pelicula() {
        super();
    }

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
        return super.toString()
                + "Pelicula{" + "Titulo=" + super.titulo
                + "actorPrincipal=" + this.actorPrincipal + '}';
    }
}

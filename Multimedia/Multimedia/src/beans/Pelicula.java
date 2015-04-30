package beans;
public class Pelicula extends Multimedia
{
    private String ActorPrincipal;

    public Pelicula() {
        super();
    }
    public Pelicula(String ActorPrincipal, String titulo, String autor, int duración) {
        super(titulo, autor, duración);
        this.ActorPrincipal = ActorPrincipal;
    }

    public String getActorPrincipal() {
        return ActorPrincipal;
    }

    public void setActorPrincipal(String ActorPrincipal) {
        this.ActorPrincipal = ActorPrincipal;
    }

    @Override
    public String toString() {
        return super.toString() + "Pelicula{" + "ActorPrincipal=" + this.ActorPrincipal + '}';
    }
    
}

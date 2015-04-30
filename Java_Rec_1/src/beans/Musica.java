package beans;

/**
 *
 * @author lalotone
 */
public class Musica extends Multimedia{
    private String cantantePrincipal;


    public Musica(String cantantePrincipal, int duracion, String autor, String titulo) {
        super(duracion, autor, titulo);
        this.cantantePrincipal = cantantePrincipal;
    }

    public String getCantantePrincipal() {
        return cantantePrincipal;
    }

    public void setCantantePrincipal(String cantantePrincipal) {
        this.cantantePrincipal = cantantePrincipal;
    }

    @Override
    public String toString() {
        return "Musica{"+ super.toString() + "cantantePrincipal=" + cantantePrincipal + '}';
    }
    
    
}

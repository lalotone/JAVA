
package beans;

/**
 *
 * @author lalotone
 */
public class Pelicula extends Multimedia{
    private String autorPrincipal;
    
    
    public Pelicula(String autorPrincipal, int duracion, String autor, String titulo) {
        super(duracion, autor, titulo);
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
        return "Peliculas{"+ super.toString() + "autorPrincipal=" + autorPrincipal + '}';
    }
    
}

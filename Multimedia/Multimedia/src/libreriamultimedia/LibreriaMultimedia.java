
package libreriamultimedia;
import beans.Disco;
import beans.EstanteriaMultimedia;
import beans.Pelicula;

public class LibreriaMultimedia {

    
    public static void main(String[] args) {

        EstanteriaMultimedia multimedia = new EstanteriaMultimedia(25);
        
        multimedia.add(new Pelicula("Breave Heart", "Mel Grijan", 120,
                "Mel Grijander"));
        multimedia.add(new Pelicula("Harry Petas", "JK Rowling", 152,
                "Daniel Radcliffe"));
        multimedia.add(new Disco("Soy gitano", "Gypsy Kings", "100",
        "tortura"));
        
        for (int i = 0; i < multimedia.getListaMultimedia().length; i++) {
            System.out.println(multimedia.getListaMultimedia()[i].toString());
        }
    }
}

package beans;

public class Disco extends Multimedia
{
    private String genero;

    public Disco(String genero) {
        this.genero = genero;
    }

    public Disco() {
    super();
    }
        
    public Disco(String genero, String titulo, String autor, int duración) {
        super(titulo, autor, duración);
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
        return super.toString()+"Disco{" + "genero=" + this.genero + '}';
    }
}

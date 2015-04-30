package beans;
public class Multimedia
{
    private String titulo;
    private String autor;
    private int duracion;
    // GETTER & SETTER
    public Multimedia() {
    }
    public Multimedia(String titulo, String autor, int duración) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duración;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getDuración() {
        return duracion;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setDuración(int duración) {
        this.duracion = duración;
    }

    @Override
    public String toString() {
        return "Multimedia{" + "autor=" + autor + ", duracion=" + duracion + '}';
    }
    
    public boolean equals (Multimedia multimedia)
    {
        if(this.autor.equals(multimedia.getAutor()) && this.titulo.equals(multimedia.getTitulo()))
        {
            return true;
        }
        return false;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

public class Multimedia {

    protected String titulo;
    protected String autor;
    protected int duracion;

    public Multimedia() {
    }

    public Multimedia(String titulo, String autor, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Multimedia{" + "titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + '}';
    }

    public boolean equals(Multimedia multimedia) {
        if (this.autor.equals(multimedia.getAutor())
                && this.titulo.equals(multimedia.getTitulo())) {
            return true;
        }

        return false;
    }
}

package beans;

class Disco extends Multimedia {

    int genero;

    public Disco() {
    }

    public Disco(String titulo, String autor, int duracion, int genero) {
        super(titulo, autor, duracion);
        this.genero = genero;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + "Disco{" + "genero=" + genero + '}';
    }
}

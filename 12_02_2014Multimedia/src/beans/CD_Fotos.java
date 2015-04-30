package beans;

class CD_Fotos extends Multimedia {

    int NumFotos;

    public CD_Fotos() {
    }

    public CD_Fotos(int NumFotos, String titulo, String autor, int duracion) {
        super(titulo, autor, duracion);
        this.NumFotos = NumFotos;
    }

    public int getNumFotos() {
        return NumFotos;
    }

    public void setNumFotos(int NumFotos) {
        this.NumFotos = NumFotos;
    }

    @Override
    public String toString() {
        return super.toString() + "Disco{" + "NumFotos=" + NumFotos + "Titulo="+titulo +"Duracion="+duracion +'}';
    }
}

package beans;

class CD_Videos extends Multimedia {

    int NumVideos;

    public CD_Videos() {
    }

    public CD_Videos(int NumVideos, String titulo, String autor, int duracion) {
        super(titulo, autor, duracion);
        this.NumVideos = NumVideos;
    }

    public int getNumVideos() {
        return NumVideos;
    }

    public void setNumVideos(int NumVideos) {
        this.NumVideos = NumVideos;
    }

    @Override
    public String toString() {
        return super.toString() + "Disco{" + "NumVideos=" + NumVideos + "Titulo="+titulo +"Duracion="+duracion + "Autor"+autor+'}';
    }
}

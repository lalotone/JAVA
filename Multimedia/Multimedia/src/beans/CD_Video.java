package beans;
public class CD_Video extends Multimedia
{
    private int numVideos;

    public CD_Video() {
    super();
    }

    public CD_Video(int numVideos, String titulo, String autor, int duración) {
        super(titulo, autor, duración);
        this.numVideos = numVideos;
    }

    public int getNumVideos() {
        return numVideos;
    }

    public void setNumVideos(int numVideos) {
        this.numVideos = numVideos;
    }

    @Override
    public String toString() {
        return super.toString()+  "CD_Video{" + "numVideos=" + this.numVideos + '}';
    }
    
    
    
}

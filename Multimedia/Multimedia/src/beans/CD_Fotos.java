package beans;

public class CD_Fotos extends Multimedia
{
    private int numFotos;

    public CD_Fotos() {
        super();
    }

    public CD_Fotos(int numFotos, String titulo, String autor, int duración) {
        super(titulo, autor, duración);
        this.numFotos = numFotos;
    }

    public int getNumFotos() {
        return numFotos;
    }

    public void setNumFotos(int numFotos) {
        this.numFotos = numFotos;
    }

    @Override
    public String toString() {
        return super.toString()+ "CD_Fotos{" + "numFotos=" + numFotos + '}';
    }

    
    
    
}

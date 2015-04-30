package beans;
public class EstanteriaMultimedia
{
    private int tamanyoMaximo;
    private Multimedia[] listaMultimedia = new Multimedia[tamanyoMaximo];
    

    public EstanteriaMultimedia(int tamanyoMaximo) 
    {
        tamanyoMaximo = this.tamanyoMaximo;
    }

    public int getTamanyoMaximo() {
        return tamanyoMaximo;
    }

    public void setTamanyoMaximo(int tamanyoMaximo) {
        this.tamanyoMaximo = tamanyoMaximo;
    }

    public Multimedia[] getListaMultimedia() {
        return listaMultimedia;
    }

    public void setListaMultimedia(Multimedia[] listaMultimedia) {
        this.listaMultimedia = listaMultimedia;
    }
    
    public int size()
    {
        int contador = 0;
        for (int i = 0; i < listaMultimedia.length; i++) 
        {
            if (listaMultimedia[i] != null) 
            {
                contador++;
            }
        }
        return contador;
    }
    
    public boolean add(Multimedia m)
    {
        for (int i = 0; i < listaMultimedia.length; i++) 
        {
            if (listaMultimedia[i] == null) 
            {
                listaMultimedia[i] = m;
                return true;
            }
        }
        return false;
    }
    
    public Multimedia get (int posicion)
    {
        if (listaMultimedia[posicion] == null) 
        {
            return null;
        }
        return listaMultimedia[posicion];
    }
}

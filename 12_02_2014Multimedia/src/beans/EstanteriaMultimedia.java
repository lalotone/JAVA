/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Beatriz
 */
public class EstanteriaMultimedia {

    Multimedia[] listaMultimedia;

    public EstanteriaMultimedia(int tamano) {
        listaMultimedia = new Multimedia[tamano];

    }

    public int size() {
        int contador = 0;
        for (int i = 0; i < listaMultimedia.length; i++) {
            if (listaMultimedia[i] != null) {
                contador++;
            }

        }
        return contador;
    }

    public boolean add(Multimedia m) {
        for (int i = 0; i < listaMultimedia.length; i++) {
            if (listaMultimedia[i] == null) {
                listaMultimedia[i] = m;
                return true;
            }



        }
        return false;
    }

    public Multimedia get(int posicion) {
        if (posicion < 0 || posicion > listaMultimedia.length) {
            return null;
        }

        return listaMultimedia[posicion];
    }
}

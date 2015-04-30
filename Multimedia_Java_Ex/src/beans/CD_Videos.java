/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

/**
 *
 * @author lalotone
 */
public class CD_Videos extends Multimedia{
    private int numVideos;

    public CD_Videos(int numVideos, String titulo, String autor, int duracion) {
        super(titulo, autor, duracion);
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
        return "CD_Videos{"+super.toString() + "numVideos=" + numVideos + '}';
    }
    
}

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
    public int numVideos;

    public CD_Videos() {
    }

    public CD_Videos(String titulo, String autor, int duración) {
        super(titulo, autor, duración);
    }

    public int getNumVideos() {
        return numVideos;
    }

    public void setNumVideos(int numVideos) {
        this.numVideos = numVideos;
    }

    @Override
    public String toString() {
        return super.toString() + "CD_Videos{" + "numVideos=" + numVideos + '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.util.Objects;

/**
 *
 * @author lalotone
 */
public class Multimedia {
    //Atributos
    protected String titulo;
    protected String autor;
    protected int duración;
    //Constructor
    public Multimedia(){
    }
    public Multimedia(String titulo, String autor, int duración) {
        this.titulo = titulo;
        this.autor = autor;
        this.duración = duración;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getDuración() {
        return duración;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }
    

    @Override
    public String toString() {
        return "multimedia{" + "titulo=" + titulo + ", autor=" + autor + ", duraci\u00f3n=" + duración + '}';
    }

   

        public boolean equals(Multimedia multimedia) {
        if (this.autor.equals(multimedia.getAutor()) 
                && this.titulo.equals(multimedia.getTitulo())) {
            return true;
        }
        
            return false;

    }
}

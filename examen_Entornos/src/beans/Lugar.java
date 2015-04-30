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
public class Lugar {
    private int cod_lugar;   
    private String nombre;
    private int temp_media;
    private String lugar;
    
    public Lugar() {
    }

    public Lugar(int cod_lugar, String nombre, int temp_media) {
        this.cod_lugar = cod_lugar;
        this.nombre = nombre;
        this.temp_media = temp_media;
    }

    public int getCod_lugar() {
        return cod_lugar;
    }

    public void setCod_lugar(int cod_lugar) {
        this.cod_lugar = cod_lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemp_media() {
        return temp_media;
    }

    public void setTemp_media(int temp_media) {
        this.temp_media = temp_media;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
          
}

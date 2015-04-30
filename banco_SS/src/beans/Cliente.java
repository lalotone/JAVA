package beans;

import beans.*;

public class Cliente {

    private String nombre;
    private String apellidos;
    private int tlfno;

    public Cliente(String nombre, String apellidos, int tlfno) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tlfno = tlfno;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTlfno() {
        return tlfno;
    }

    public void setTlfno(int tlfno) {
        this.tlfno = tlfno;
    }

    @Override
    public String toString() {

        return "Cliente: " + "Nombre=" + nombre + ", Apellidos=" + apellidos + ", Telefono=" + tlfno;
    }

}

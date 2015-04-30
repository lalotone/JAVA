/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author A7
 */
public class Cuenta {
    //ATRIBUTOS

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    private int transaccionesRealizadas;

    //CONSTRUCTORES
    public Cuenta() {
        this.saldo = 0;
        this.transaccionesRealizadas = 0;
    }

    public Cuenta(String nombre, String cuenta, double saldo, double tipoInteres, int transaccionesRealizadas) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
        this.transaccionesRealizadas = transaccionesRealizadas;
    }

    //METODOS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public int getTransaccionesRealizadas() {
        return transaccionesRealizadas;
    }

    public void setTransaccionesRealizadas(int transaccionesRealizadas) {
        this.transaccionesRealizadas = transaccionesRealizadas;
    }

    public void ingreso(double cantidad){
            saldo = saldo + cantidad;
            transaccionesRealizadas++;
        
    }
    public void reintegro(double cantidad){
            saldo = saldo - cantidad;
            transaccionesRealizadas++;
    }
  
    
}

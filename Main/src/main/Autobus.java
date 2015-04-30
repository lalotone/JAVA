
package main;


public class Autobus extends Vehiculo {
    public int Asientos;

    public Autobus(String patente, String marca) {
        super(patente, marca);
    }

    public Autobus(int Asientos, String patente, String marca) {
        super(patente, marca);
        this.Asientos = Asientos;
    }

    public int getAsientos() {
        return Asientos;
    }

    public void setAsientos(int Asientos) {
        this.Asientos = Asientos;
    }
    
}

package beans;
public class Finanzas {
    //Atributos
    private double euro;
    private double dolar;
    //Constructor
    public Finanzas() {
        /* - - - Constructor Vacío - - - */
    }
    public Finanzas(double euro, double dolar) {
        this.euro = euro;
        this.dolar = dolar;
    }
    public double getEuro() {
        return euro;
    }
    public void setEuro(double euro) {
        this.euro = euro;
    }
    public double getDolar() {
        return dolar;
    }
    public void setDolar(double dolar) {
        this.dolar = dolar;
    }
    //Métodos
    /*---Funciones para pasar de Dolar a Euro y viceversa---*/
    public double dolaresToEuros (){
        return dolar/1.36;
    }
    public double eurosToDolares (){
        double convertir;
        convertir = euro*1.36;
        return convertir;
    }
}
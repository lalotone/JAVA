package beans;

public class Dolar_Euro {

    private double numero;
    private double operacion;
    private double operacion2;
    private double operacion3;
    private double operacion4;

    public Dolar_Euro() {
    }

    public Dolar_Euro(int numero) {
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double dolarEuro() {
        operacion = numero * 1.37;
        return operacion;
    }

    public double euroDolar() {
        operacion2 = numero / 1.37;
        return operacion2;
    }

    public double celsiusFahrenheit() {
        operacion3 = (numero * 9 / 5) + 32;
        return operacion3;
    }

    public double fahrenheitCelsius() {
        operacion4 = (numero - 32) * 5 / 9;
        return operacion4;
    }
}

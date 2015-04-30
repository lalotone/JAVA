package beans;

public class Temperatura {
    private double celsius;
    private double fahrenheit;
    public Temperatura(){
    }
    public Temperatura(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }
    public double getCelsius() {
        return celsius;
    }
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    public double getFahrenheit() {
        return fahrenheit;
    }
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public double fahrenheitToCelsius(){
        return (fahrenheit - 32) * 5/9;/*Aqui establecemos la operacion de fahrenheit a celsius*/
    }
    public double celsiusToFahrenheit(){
        double operacion = (celsius * 9/5) + 32;
        celsius = operacion;
        return celsius;
    }
}

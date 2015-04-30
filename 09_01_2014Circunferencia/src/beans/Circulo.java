/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


public class Circulo {
    /**
     * ATRIBUTOS!!!!!!!!!!!!!!!!!!
     */
    private final double  PI = 3.1416;
    private double rd; 
    /**
     * CONSTRUCTOR!!!!!!!!!!!!!!!!!!
     */
    public Circulo(double radio){
        this.rd = radio;
    }

    public double getRd() {
        return rd;
    }

    public void setRd(double rd) {
        this.rd = rd;
    }
    
    
    public double areaCirculo(){
        double area;
        area = PI * rd * rd;
        return area;
       
    }
    public double longitudCircunferencia(){
        double perimetro;
        perimetro = PI * 2 * rd;
        return perimetro;
    }
    public void mostrarResultado(){
        System.out.println("\nLongitud = " 
                + longitudCircunferencia() + 
                "\nArea = " + areaCirculo());
    }
    
}


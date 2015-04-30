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
public class Operaciones {

    private double pi = 3.14;
    private int numero;
    private double area;

    public Operaciones(int numero) {
        this.numero = numero;
    }
    public Operaciones(){
    
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double area() {
        area = (numero * numero) * pi;
        return area;
    }
}

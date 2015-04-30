/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cambio;

/**
 *
 * @author lalotone
 */
public class cambio {
    //ATRIBUTOS
    private final double CONVERSION_DOLAR_EURO;
    //CONSTRUCTOR
    public cambio(double valor) {
        CONVERSION_DOLAR_EURO = valor;
    }
    public cambio(){
        CONVERSION_DOLAR_EURO = 1.36;
    }
    //METODOS
    public double dolaresToEuros(double dolar){
        double resultado = dolar / CONVERSION_DOLAR_EURO;
        return resultado;
    }
    
    public double eurosToDolares(double euro){
        return euro * CONVERSION_DOLAR_EURO;
    }
}

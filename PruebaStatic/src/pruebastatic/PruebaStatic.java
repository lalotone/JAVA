/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebastatic;

/**
 *
 * @author lalotone
 */
public class PruebaStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaLongitud objeto1 = new CuentaLongitud("Hola");
        CuentaLongitud objeto2 = new CuentaLongitud("Mundo");
        CuentaLongitud objeto3 = new CuentaLongitud("Prueba");
        
        System.out.println(objeto1.dameTamanyo());
        System.out.println(objeto2.dameTamanyo());
        System.out.println(objeto2.dameTamanyo());
    }
    
}

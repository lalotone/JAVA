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
public class Mago extends Personaje{
String[] arma = new String[3];



    public Mago(String nombre) {
        super(nombre);
    }

    public Mago() {
    }
    
    public void addArma(String armaAux){
        for (int i = 0; i < arma.length; i++) {
            if (arma[i] == null){
            arma[i]=armaAux;
            break;
            }
        }
    }
    
    @Override
    void tipoDePersonaje() {
        
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void alimentarse() {
        
    }

    @Override
    public String toString() {
          return super.toString() + "es de tipo mago{" + " arma=" + arma[0] + " ,arma2: " +arma[1]+ " ,arma3: " +arma[2] +'}';              
    }
    
}

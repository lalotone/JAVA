/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juegoguerreros;
import beans.*;
import java.util.Random;
/**
 *
 * @author lalotone
 */
public class JuegoGuerreros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rd = new Random();
       
        IPersonaje[] array = new IPersonaje[4];
        String[] arma = new String[8];
        arma[0] = ("Cushillo");
        arma[1] = ("Espetec hacendado duro");
        arma[2] = ("Disco de camela");
        arma[4] = ("Contrato de trabajo");
        arma[5] = ("Decir algo malo de su madre");
        arma[6] = ("El estronzabuchos");
        arma[7] = ("Bomba falete");
 
        array[0] = new Guerrero("Moncho");
        array[1] = new Guerrero("Gaspar");
        array[2] = new Mago("Magolius");
        array[3] = new Mago("Mageles");
        
        for (int i = 0; i < array.length; i++) {//Este for recorre los el array personajes.
            for (int j = 0; j < 3; j++) {//Este for rellenara con 3 armas.
               if(array[i] instanceof Guerrero){
                Guerrero varx = (Guerrero)array[i];
                varx.addArma(arma[rd.nextInt(8)]);
               }else if(array[i] instanceof Mago){
                Mago vary = (Mago)array[i];
                vary.addArma(arma[rd.nextInt(8)]);
               }
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i].toString());
        }
        
    }
    
}

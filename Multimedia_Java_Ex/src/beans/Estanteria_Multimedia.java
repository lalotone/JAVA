/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.util.ArrayList;

/**
 *
 * @author lalotone
 */
public class Estanteria_Multimedia {
    ArrayList<Multimedia> operar;
    int suma = 0;

    public Estanteria_Multimedia(ArrayList<Multimedia> operar) {
        this.operar = operar;
    }

    public Estanteria_Multimedia() {
    }
    public void sumaDuracion(){
        for (int i = 0; i < operar.size(); i++) {
            suma = suma + operar.get(i).getDuracion();
        }
        System.out.println(suma);
    }
    
}

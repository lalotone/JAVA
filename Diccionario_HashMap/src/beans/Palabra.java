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
public class Palabra {
    private String nombre;
    private ArrayList definiciones = new ArrayList();

    public Palabra(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void anyadirDefinicion(String cosa){
        definiciones.add(cosa);
    }
    public void listarDefs(){
        System.out.println("Primera palabra registrada: "+nombre);
        System.out.println("Definiciones almacenadas:");
        for (int i = 0; i < definiciones.size(); i++) {
            System.out.println((i+1)+"º Definición: "
                    + "\n"+definiciones.get(i));
            //definiciones.get(i)
        }
    }
}

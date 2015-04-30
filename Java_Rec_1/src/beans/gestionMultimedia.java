package beans;

import java.util.ArrayList;

/**
 *
 * @author lalotone
 */
public class gestionMultimedia {
    ArrayList<Multimedia> operar;

    public gestionMultimedia() {
    }

    public gestionMultimedia(ArrayList<Multimedia> operar) {
        this.operar = operar;
    }
    
    public void mostrarLista(){
        for (int i = 0; i < operar.size(); i++) {
            System.out.println(operar.get(i).toString());
        }
        
    }
}

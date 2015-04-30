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
public class Coche {
    
    private Bombero conductor;
    private Bombero manguera1;
    private Bombero manguera2;
    private Bombero auxiliar1;
    private Bombero auxiliar2;
    private Bombero auxiliar3;
    
    public Coche(){
    }

    public Coche(Bombero conductor) {
        this.conductor = conductor;
    }

    public Coche(Bombero conductor, Bombero manguera1) {
        this.conductor = conductor;
        this.manguera1 = manguera1;
    }

    public Coche(Bombero conductor, Bombero manguera1, Bombero manguera2) {
        this.conductor = conductor;
        this.manguera1 = manguera1;
        this.manguera2 = manguera2;
    }

    public Coche(Bombero conductor, Bombero manguera1, Bombero manguera2, Bombero auxiliar1) {
        this.conductor = conductor;
        this.manguera1 = manguera1;
        this.manguera2 = manguera2;
        this.auxiliar1 = auxiliar1;
    }

    public Coche(Bombero conductor, Bombero manguera1, Bombero manguera2, Bombero auxiliar1, Bombero auxiliar2) {
        this.conductor = conductor;
        this.manguera1 = manguera1;
        this.manguera2 = manguera2;
        this.auxiliar1 = auxiliar1;
        this.auxiliar2 = auxiliar2;
    }

    public Coche(Bombero conductor, Bombero manguera1, Bombero manguera2, Bombero auxiliar1, Bombero auxiliar2, Bombero auxiliar3) {
        this.conductor = conductor;
        this.manguera1 = manguera1;
        this.manguera2 = manguera2;
        this.auxiliar1 = auxiliar1;
        this.auxiliar2 = auxiliar2;
        this.auxiliar3 = auxiliar3;
    }

}

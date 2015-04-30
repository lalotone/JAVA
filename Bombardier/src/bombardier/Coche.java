
package bombardier;

/**
 *
 * @author lalotone
 */
public class Coche {
    protected Bombero Conductor;
    protected Bombero Manguera1;
    protected Bombero Manguera2;
    protected Bombero Auxiliar1;
    protected Bombero Auxiliar2;
    protected Bombero Auxiliar3;

    public Coche(Bombero Conductor, Bombero Manguera1, Bombero Manguera2, Bombero Auxiliar1, Bombero Auxiliar2, Bombero Auxiliar3) {
        this.Conductor = Conductor;
        this.Manguera1 = Manguera1;
        this.Manguera2 = Manguera2;
        this.Auxiliar1 = Auxiliar1;
        this.Auxiliar2 = Auxiliar2;
        this.Auxiliar3 = Auxiliar3;
    }

    public Bombero getConductor() {
        return Conductor;
    }

    public Bombero getManguera1() {
        return Manguera1;
    }

    public Bombero getManguera2() {
        return Manguera2;
    }

    public Bombero getAuxiliar1() {
        return Auxiliar1;
    }

    public Bombero getAuxiliar2() {
        return Auxiliar2;
    }

    public Bombero getAuxiliar3() {
        return Auxiliar3;
    }

    public void setConductor(Bombero Conductor) {
        this.Conductor = Conductor;
    }

    public void setManguera1(Bombero Manguera1) {
        this.Manguera1 = Manguera1;
    }

    public void setManguera2(Bombero Manguera2) {
        this.Manguera2 = Manguera2;
    }

    public void setAuxiliar1(Bombero Auxiliar1) {
        this.Auxiliar1 = Auxiliar1;
    }

    public void setAuxiliar2(Bombero Auxiliar2) {
        this.Auxiliar2 = Auxiliar2;
    }

    public void setAuxiliar3(Bombero Auxiliar3) {
        this.Auxiliar3 = Auxiliar3;
    }
    
}

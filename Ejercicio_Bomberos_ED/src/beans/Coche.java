package beans;

public class Coche 
{
    private Bombero Conductor;
    private Bombero Manguera1;
    private Bombero Manguera2;
    private Bombero Auxiliar1;
    private Bombero Auxiliar2;
    private Bombero Auxiliar3;
    //CONSTRUCTORES
    public Coche() {
    }

    public Coche(Bombero Conductor) {
        this.Conductor = Conductor;
    }

    public Coche(Bombero Conductor, Bombero Manguera1) {
        this.Conductor = Conductor;
        this.Manguera1 = Manguera1;
    }

    public Coche(Bombero Conductor, Bombero Manguera1, Bombero Manguera2) {
        this.Conductor = Conductor;
        this.Manguera1 = Manguera1;
        this.Manguera2 = Manguera2;
    }

    public Coche(Bombero Conductor, Bombero Manguera1, Bombero Manguera2, Bombero Auxiliar1) {
        this.Conductor = Conductor;
        this.Manguera1 = Manguera1;
        this.Manguera2 = Manguera2;
        this.Auxiliar1 = Auxiliar1;
    }

    public Coche(Bombero Conductor, Bombero Manguera1, Bombero Manguera2, Bombero Auxiliar1, Bombero Auxiliar2) {
        this.Conductor = Conductor;
        this.Manguera1 = Manguera1;
        this.Manguera2 = Manguera2;
        this.Auxiliar1 = Auxiliar1;
        this.Auxiliar2 = Auxiliar2;
    }

    public Coche(Bombero Conductor, Bombero Manguera1, Bombero Manguera2, Bombero Auxiliar1, Bombero Auxiliar2, Bombero Auxiliar3) {
        this.Conductor = Conductor;
        this.Manguera1 = Manguera1;
        this.Manguera2 = Manguera2;
        this.Auxiliar1 = Auxiliar1;
        this.Auxiliar2 = Auxiliar2;
        this.Auxiliar3 = Auxiliar3;
    }

    @Override
    public String toString() {
        return "Coche{" + "Conductor=" + Conductor + ", Manguera1=" + Manguera1 + ", Manguera2=" + Manguera2 + ", Auxiliar1=" + Auxiliar1 + ", Auxiliar2=" + Auxiliar2 + ", Auxiliar3=" + Auxiliar3 + '}';
    }
//GETTER & SETTER
    public Bombero getConductor() {
        return Conductor;
    }

    public void setConductor(Bombero Conductor) {
        this.Conductor = Conductor;
    }

    public Bombero getManguera1() {
        return Manguera1;
    }

    public void setManguera1(Bombero Manguera1) {
        this.Manguera1 = Manguera1;
    }

    public Bombero getManguera2() {
        return Manguera2;
    }

    public void setManguera2(Bombero Manguera2) {
        this.Manguera2 = Manguera2;
    }

    public Bombero getAuxiliar1() {
        return Auxiliar1;
    }

    public void setAuxiliar1(Bombero Auxiliar1) {
        this.Auxiliar1 = Auxiliar1;
    }

    public Bombero getAuxiliar2() {
        return Auxiliar2;
    }

    public void setAuxiliar2(Bombero Auxiliar2) {
        this.Auxiliar2 = Auxiliar2;
    }

    public Bombero getAuxiliar3() {
        return Auxiliar3;
    }

    public void setAuxiliar3(Bombero Auxiliar3) {
        this.Auxiliar3 = Auxiliar3;
    }
}
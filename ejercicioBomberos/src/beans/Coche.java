
package beans;


public class Coche {
    Bombero conductor;
    Bombero mangera1;
    Bombero mangera2;
    Bombero auxiliar1;
    Bombero auxiliar2;
    Bombero auxiliar3;

    public Coche() {
    }

    public Coche(Bombero conductor) {
        this.conductor = conductor;
    }

    public Coche(Bombero conductor, Bombero mangera1) {
        this.conductor = conductor;
        this.mangera1 = mangera1;
    }

    public Coche(Bombero conductor, Bombero mangera1, Bombero mangera2) {
        this.conductor = conductor;
        this.mangera1 = mangera1;
        this.mangera2 = mangera2;
    }

    public Coche(Bombero conductor, Bombero mangera1, Bombero mangera2, Bombero auxiliar1) {
        this.conductor = conductor;
        this.mangera1 = mangera1;
        this.mangera2 = mangera2;
        this.auxiliar1 = auxiliar1;
    }

    public Coche(Bombero conductor, Bombero mangera1, Bombero mangera2, Bombero auxiliar1, Bombero auxiliar2) {
        this.conductor = conductor;
        this.mangera1 = mangera1;
        this.mangera2 = mangera2;
        this.auxiliar1 = auxiliar1;
        this.auxiliar2 = auxiliar2;
    }

    public Coche(Bombero conductor, Bombero mangera1, Bombero mangera2, Bombero auxiliar1, Bombero auxiliar2, Bombero auxiliar3) {
        this.conductor = conductor;
        this.mangera1 = mangera1;
        this.mangera2 = mangera2;
        this.auxiliar1 = auxiliar1;
        this.auxiliar2 = auxiliar2;
        this.auxiliar3 = auxiliar3;
    }

    public Bombero getConductor() {
        return conductor;
    }

    public Bombero getMangera1() {
        return mangera1;
    }

    public Bombero getMangera2() {
        return mangera2;
    }

    public Bombero getAuxiliar1() {
        return auxiliar1;
    }

    public Bombero getAuxiliar2() {
        return auxiliar2;
    }

    public Bombero getAuxiliar3() {
        return auxiliar3;
    }

    public void setConductor(Bombero conductor) {
        this.conductor = conductor;
    }

    public void setMangera1(Bombero mangera1) {
        this.mangera1 = mangera1;
    }

    public void setMangera2(Bombero mangera2) {
        this.mangera2 = mangera2;
    }

    public void setAuxiliar1(Bombero auxiliar1) {
        this.auxiliar1 = auxiliar1;
    }

    public void setAuxiliar2(Bombero auxiliar2) {
        this.auxiliar2 = auxiliar2;
    }

    public void setAuxiliar3(Bombero auxiliar3) {
        this.auxiliar3 = auxiliar3;
    }
    
    
    
    
}

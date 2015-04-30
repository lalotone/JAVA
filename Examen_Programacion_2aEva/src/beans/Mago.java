package beans;

/**
 *
 * @author lalotone
 */
public class Mago extends Personaje {

    private String arma;
    private int ataque;

    public Mago(String nombre, int energia) {
        super(nombre, energia);
    }

    public Mago() {
    }

    public Mago(String arma) {
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int atacar() {
        ataque = energia - 10;
        return ataque;
    }

    @Override
    public void alimentarse() {
    }

    @Override
    public String toString() {
        return super.toString() + "Mago{" + "arma=" + arma + '}';
    }

}

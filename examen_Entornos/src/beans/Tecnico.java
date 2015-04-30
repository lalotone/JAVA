

package beans;

/**
 *
 * @author lalotone
 */
public class Tecnico extends Persona{
    private int fecha;
    private int tlfnino;
    private int salario;

    public Tecnico(int fecha, int tlfnino, int salario, int dni, String Nombre, String Dirección, int telefono) {
        super(dni, Nombre, Dirección, telefono);
        this.fecha = fecha;
        this.tlfnino = tlfnino;
        this.salario = salario;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getTlfnino() {
        return tlfnino;
    }

    public void setTlfnino(int tlfnino) {
        this.tlfnino = tlfnino;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Tecnico{" +super.toString() +  "fecha=" + fecha + ", tlfnino=" + tlfnino + ", salario=" + salario + '}';
    }
    
}

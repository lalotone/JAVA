

package beans;

/**
 *
 * @author lalotone
 */
public class Viaje {

    private int codigo;
    private int numplazas;
    private int fecha;
    private String otrosDatos;

    public Viaje(int codigo, int numplazas, int fecha, String otrosDatos) {
        this.codigo = codigo;
        this.numplazas = numplazas;
        this.fecha = fecha;
        this.otrosDatos = otrosDatos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumplazas() {
        return numplazas;
    }

    public void setNumplazas(int numplazas) {
        this.numplazas = numplazas;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getOtrosDatos() {
        return otrosDatos;
    }

    public void setOtrosDatos(String otrosDatos) {
        this.otrosDatos = otrosDatos;
    }

    @Override
    public String toString() {
        return "Viaje{" + "codigo=" + codigo + ", numplazas=" + numplazas + ", fecha=" + fecha + ", otrosDatos=" + otrosDatos + '}';
    }
    
}

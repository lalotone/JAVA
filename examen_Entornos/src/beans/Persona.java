

package beans;

/**
 *
 * @author lalotone
 */
public class Persona {
    private int dni;
    private String Nombre;
    private String Dirección;
    private int telefono;

    public Persona(int dni, String Nombre, String Dirección, int telefono) {
        this.dni = dni;
        this.Nombre = Nombre;
        this.Dirección = Dirección;
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "dni=" + dni + ", Nombre=" + Nombre + ", Direcci\u00f3n=" + Dirección + ", telefono=" + telefono ;
    }
    
    
}

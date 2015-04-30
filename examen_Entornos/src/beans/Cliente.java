

package beans;

/**
 *
 * @author lalotone
 */
public class Cliente extends Persona{
    
    public Cliente(int dni, String Nombre, String Dirección, int telefono) {
        super(dni, Nombre, Dirección, telefono);
    }

    

    @Override
    public String toString() {
        return "Cliente{"+ super.toString() + '}';
    }
    
    
}

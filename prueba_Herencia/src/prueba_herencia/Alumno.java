
package prueba_herencia;


public class Alumno extends Persona{
    
    private String carrera;

    public Alumno() {
        super();
    }
    
    public void Matricularse( String c){
    carrera = c;
    
    }
    
}

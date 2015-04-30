package beans;
public class Bombero 
{
    private String nombre;
    private int edad;
    private String puesto;
    private int salario;
    //CONSTRUCTORES
    public Bombero() {
    }

    public Bombero(String nombre, int edad, String puesto, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
        this.salario = salario;
    }
    // MÉTODOS
    @Override
    public String toString() {
        return "Bombero{" + "nombre=" + nombre + ", edad=" + edad + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    public void Poner_Bombero (String nombre, int edad, String puesto, int salario)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
        this.salario = salario;
    }
    //GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
package beans;
import beans.Bombero;
import beans.Coche;

public class OperacionBombero 
{
    Bombero bombero0 = new Bombero();
    Bombero bombero1 = new Bombero();
    Bombero bombero2 = new Bombero();
    Bombero bombero3 = new Bombero();
    Bombero bombero4 = new Bombero();
    Bombero bombero5 = new Bombero();
    Bombero[] listaBomberos = new Bombero[6];
    //CONSTRUCTORES
    public OperacionBombero() {
    }
    //MÉTODOS
    public void PonerBomberos(Bombero b0, Bombero b1, Bombero b2, Bombero b3, Bombero b4, Bombero b5)
    {
        this.bombero0 = b0;
        this.bombero1 = b1;
        this.bombero2 = b2;
        this.bombero3 = b3;
        this.bombero4 = b4;
        this.bombero5 = b5;
        listaBomberos[0] = bombero0;
        listaBomberos[1] = bombero1;
        listaBomberos[2] = bombero2;
        listaBomberos[3] = bombero3;
        listaBomberos[4] = bombero4;
        listaBomberos[5] = bombero5;
    }

    public Bombero suma (int a, int b)
    {
        Bombero i = listaBomberos[a];
        Bombero j = listaBomberos[b];
        Bombero megabombero = new Bombero();
        megabombero.setNombre(i.getNombre()+j.getNombre());
        megabombero.setEdad(i.getEdad()+j.getEdad());
        megabombero.setPuesto(i.getPuesto()+j.getPuesto());
        megabombero.setSalario(i.getSalario()+j.getSalario());
        System.out.println(megabombero.toString());
        return megabombero;
    }
    
    public Coche preparaCoche (int a)
    {
        bombero0 = listaBomberos[a];
        Coche coche = new Coche(bombero0);
        System.out.println(coche.toString());
        return coche;
    }
    
    public Coche preparaCoche (int a, int b)
    {
        bombero0 = listaBomberos[a];
        bombero1 = listaBomberos[b];
        Coche coche = new Coche(bombero0, bombero1);
        System.out.println(coche.toString());
        return coche;
    }
    
    public Coche preparaCoche (int a, int b, int c)
    {
        bombero0 = listaBomberos[a];
        bombero1 = listaBomberos[b];
        bombero2 = listaBomberos[c];
        Coche coche = new Coche(bombero0, bombero1, bombero2);
        System.out.println(coche.toString());
        return coche;
    }

    public Coche preparaCoche (int a, int b, int c, int d)
    {
        bombero0 = listaBomberos[a];
        bombero1 = listaBomberos[b];
        bombero2 = listaBomberos[c];
        bombero3 = listaBomberos[d];
        Coche coche = new Coche(bombero0, bombero1, bombero2, bombero3);
        System.out.println(coche.toString());
        return coche;
    }
    
    public Coche preparaCoche (int a, int b, int c, int d, int e)
    {
        bombero0 = listaBomberos[a];
        bombero1 = listaBomberos[b];
        bombero2 = listaBomberos[c];
        bombero3 = listaBomberos[d];
        bombero4 = listaBomberos[e];
        Coche coche = new Coche(bombero0, bombero1, bombero2, bombero3, bombero4);
        System.out.println(coche.toString());
        return coche;
    }
    
    public Coche preparaCoche (int a, int b, int c, int d, int e, int f)
    {
        bombero0 = listaBomberos[a];
        bombero1 = listaBomberos[b];
        bombero2 = listaBomberos[c];
        bombero3 = listaBomberos[d];
        bombero4 = listaBomberos[e];
        bombero5 = listaBomberos[f];
        Coche coche = new Coche(bombero0, bombero1, bombero2, bombero3, bombero4, bombero5);
        System.out.println(coche.toString());
        return coche;
    }
}

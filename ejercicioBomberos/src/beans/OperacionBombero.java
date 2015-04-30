
package beans;


public class OperacionBombero {
   private Bombero bombero1;
   private  Bombero bombero2; 
   private Bombero bombero3;
   private Bombero bombero4;
   private Bombero bombero5;
   private Bombero bombero6;

    public OperacionBombero() {
    }

    public Bombero getBombero1() {
        return bombero1;
    }

    public Bombero getBombero2() {
        return bombero2;
    }

    public Bombero getBombero3() {
        return bombero3;
    }

    public Bombero getBombero4() {
        return bombero4;
    }

    public Bombero getBombero5() {
        return bombero5;
    }

    public Bombero getBombero6() {
        return bombero6;
    }

    public void setBombero1(Bombero bombero1) {
        this.bombero1 = bombero1;
    }

    public void setBombero2(Bombero bombero2) {
        this.bombero2 = bombero2;
    }

    public void setBombero3(Bombero bombero3) {
        this.bombero3 = bombero3;
    }

    public void setBombero4(Bombero bombero4) {
        this.bombero4 = bombero4;
    }

    public void setBombero5(Bombero bombero5) {
        this.bombero5 = bombero5;
    }

    public void setBombero6(Bombero bombero6) {
        this.bombero6 = bombero6;
    }

    
    public void verBomberos() {
        System.out.println(bombero1.getNombre()+", "+ bombero2.getNombre()+", "+bombero3.getNombre()+", "+ bombero4.getNombre()+", " +bombero5.getNombre()+","+ bombero6.getNombre());
    }
    
    
   
    public void ponerBombero(Bombero b1, Bombero b2, Bombero b3, Bombero b4, Bombero b5, Bombero b6){
        this.bombero1=b1;
        this.bombero2=b2;
        this.bombero3=b3;
        this.bombero4=b4;
        this.bombero5=b5;
        this.bombero6=b6;
        
        
    }
    public Bombero Suma(Bombero i, Bombero j){
        Bombero total= new Bombero();
        total.setEdad(i.getEdad()+ j.getEdad());
        total.setNombre(i.getNombre()+" "+ j.getNombre());
        total.setPuesto(i.getPuesto()+ " "+j.getPuesto());
        total.setSalario(i.getSalario()+ j.getSalario());
        
        
        return total;
    }
    public Coche preparaCoche(Bombero i){
        Coche camion= new Coche(i);
       return camion;
    }
    public Coche preparaCoche(Bombero i, Bombero j){
        Coche camion= new Coche(i,j);
        return camion;
    }
    
     public Coche preparaCoche(Bombero i, Bombero j, Bombero k){
        Coche camion= new Coche(i, j, k);
       return camion;
    }
     public Coche preparaCoche(Bombero i, Bombero j, Bombero k, Bombero l){
        Coche camion= new Coche(i, j, k, l);
       return camion;
     }
     
      public Coche preparaCoche(Bombero i, Bombero j, Bombero k, Bombero l, Bombero m){
        Coche camion= new Coche(i, j, k, l, m);
       return camion;
     }
      
       public Coche preparaCoche(Bombero i, Bombero j, Bombero k, Bombero l, Bombero m, Bombero n ){
        Coche camion= new Coche(i, j, k, l, m, n );
       return camion;
     }
}


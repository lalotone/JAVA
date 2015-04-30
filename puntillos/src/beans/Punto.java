package beans;

/**
 *
 * @author Roberto Domingo
 */
public class Punto {
    private int x;
    private int y;

    public Punto() {
        x=0;
        y=0;
    }

    public Punto(int i, int j) {
        this.x = i;
        this.y = j;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void suma(int i, int j){
        x=+i;
        y=+j;
    }
}

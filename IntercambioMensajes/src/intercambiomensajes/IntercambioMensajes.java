
package intercambiomensajes;

import controlador.GestorPantalla;
import vista.Pantalla;


public class IntercambioMensajes {

    
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla();
        GestorPantalla gestorPantalla = new GestorPantalla(pantalla);
        gestorPantalla.actualizarMensaje();

    }
    
}

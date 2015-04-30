package controlador;

import utils.IOperaciones;
import vista.Pantalla;

public class GestorPantalla {
//Le llegan los datos y determina la accion
    private String mensaje = "";
    private IOperaciones escuchador;
    //private Pantalla parent;//Basicamente a este atributo le pasaras el atributo de Pantalla miPantalla.
    /*public GestorPantalla() {
        super();
    }*/
    public GestorPantalla(IOperaciones operaciones) {
        super();
        //this.parent = miPantalla;
        this.escuchador = operaciones;
    }

    public GestorPantalla() {
    }
    

    public void actualizarMensaje() {
        //Pantalla.getInstance().notificarMensaje("Hola");//Aqui llamas al getInstance de la clase Pantalla(Esto seria con el SINGLETON)
        escuchador.notificarMensaje("Hola hithano");
    }
    public void addMensaje() {
        //Pantalla.getInstance().notificarMensaje("Hola");//Para llamarlo hay que especificarle la clase(Pantalla) y el método
        //getInstance(). dado que es un metodo estático.//SINGLETON
    }
    public void deleteMensaje() {
        //Pantalla.getInstance().notificarMensaje("Hola");//SINGLETON
    }
}

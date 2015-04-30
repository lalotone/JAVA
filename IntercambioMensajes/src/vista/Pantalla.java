/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestorPantalla;
import utils.IOperaciones;

/**
 *
 * @author lalotone
 */
public class Pantalla implements IOperaciones {

    private /*static(si fuera con el singleton)*/ GestorPantalla acciones;
//La que se encarga de interactuar con el usuario.
    /*PATRON SINGLETON*/
//    private static Pantalla miPantalla = null;

//    public static Pantalla getInstance(){//Esto es para que el usuario no pueda instanciar ninguna pantalla o solo exista una ventana.
//        if(miPantalla==null){//La primera pantalla aparecera, la segunda ya no dado que no sera null.
//            miPantalla = new Pantalla();
//        }
//        return null;
//    }
    /*FIN PATRON SINGLETON*/
    private Pantalla() {
        super();//Este super cumple con la clase Object
        acciones = new GestorPantalla(this);
    }

//    public void notificarMensaje(String mensaje){
//        System.out.println(mensaje);
//    }
    @Override
    public void notificarMensaje(String mensaje) {//Este es el metodo de la interfaz a la que nos hemos suscrito
        //la interfaz IOperaciones
        System.out.println("Mensaje: " + mensaje);
    }
}

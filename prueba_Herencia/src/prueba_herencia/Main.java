/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba_herencia;
import prueba_herencia.Alumno;
import prueba_herencia.Persona;
/**
 *
 * @author lalotone
 */
public class Main {
/*Aqui basicamente se demuestra que el Main no veria a la clase padre dado que es protected, PERO si que podria acceder a ellos dado
    que accede a la clase padre a partir de la hija, si intentasemos acceder del Main a la clase padre necesitariamos los "super"*/
    /**
     * @param args the command line arguments
     */
    /*Si quisieramos bajad de la clase padre a la clase hija necesitariamos un override, se aprecia en la pagina 67 de Java-PP-4-Herencia
    donde desde la clase Persona tratamos de acceder a algo de la clase hija "matricularse", llamarias a la clase base pero se ejecu
    taria en la clase hija por el override*/
    public static void main(String[] args) {
        Persona a = new Persona();
        a.setDatos("1000-2", "Luis");
        
        Alumno b = new Alumno();
        b.setDatos("2000-3", "Pamela");
        b.Matricularse("Industrial");
    }
    /*Alumno alumno = (Alumno)c;
      alumno.Matricularse("Industrial");*/
    //CAST
    /*Esto es una opcion para no utilizar el override, en caso de no querer utilizarla, sirve para sacar algo mas concreto.*/
    //OVERRIDE
    /**/
}

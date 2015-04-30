/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nukeproof2aevrec;

import beans.Alumno;
import beans.Persona;
import java.util.ArrayList;

/**
 *
 * @author lalotone
 */
public class NukeProof2aEvRec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona proof = new Persona();
        ArrayList<Persona> listaPersonas = new ArrayList();
        Alumno proof2 = new Alumno("Bartolo",9,"Bartulez",12,12312323);
        Persona proof3 = new Alumno("Washington",10,"Garratiesa",12,987654);
        Persona proof4 = new Alumno("Washiwashi",10,"Muertochoped",12,987654);
        
        System.out.println("El nombre antes del cambio es : " +proof.getNombre());
        proof.cambiarNombre("Gaspar");
        System.out.println("El nombre despues del cambio es: "+proof.getNombre());
        System.out.println("La edad del alumno antes del cambio de edad es de: " + proof2.getEdad());
        proof2.cambiarEdad(27);
        System.out.println("La edad del alumno despues del cambio de edad es de: " +proof2.getEdad());
        System.out.println(proof3.toString());
        System.out.println(proof2.concatNombres());
        listaPersonas.add(proof2);
        listaPersonas.add(proof3);
        listaPersonas.add(proof4);
        
        System.out.println(listaPersonas.get(1) + " " + listaPersonas.get(2));
        listaPersonas.remove(2);
        System.out.println(listaPersonas.get(1) + " " + listaPersonas.get(2));
        
    }
    
}

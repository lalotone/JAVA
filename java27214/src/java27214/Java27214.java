/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java27214;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author lalotone
 */
public class Java27214 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> listaPalabras = new ArrayList<String>();
        
        HashMap<String,Integer> lista = new HashMap<String, Integer>();
    
        lista.put("1",100);
        lista.put("2",200);
        lista.put("3",300);
        lista.put("4",400);
        
        Integer num = lista.get("3");
        
        HashMap<String, String> pantallaMovil = new HashMap<String, String>();
        pantallaMovil.put("User","Pass");
        pantallaMovil.put("Pass", "1234");
        
        
        Iterator listaValores = lista.values().iterator();
        while(listaValores.hasNext()){
        Integer numInt = (Integer)listaValores.next();//Aqui tenemos que hacer un cast dado que el Integer es un Object, como cuando
        //haciamos el Cast para Pelicula-Multimedia.
            System.out.println("Numero: " + numInt);
        }
        Iterator listaClaves = lista.keySet().iterator();
        while (listaClaves.hasNext()){/*El hasNext...¿Tiene siguiente? Si, lo pilla, tiene siguiente? Si, otra vez, tiene siguiente? No, a tomar por 
            culo el while.Es decir, rula como el for que utilizabamos de siempre.*/
        String cadenaClave = (String)listaClaves.next();//Otro cast para ir a String.
            System.out.println("Clave: " +cadenaClave);
        }
        
        //System.out.println(num);
    }
    
}

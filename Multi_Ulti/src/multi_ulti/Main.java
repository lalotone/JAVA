/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multi_ulti;

import beans.Multimedia;
import java.util.ArrayList;
import java.util.Scanner;
import beans.Pelicula;
import beans.Fotos;
import beans.Multimedia;
import beans.Operar_Multimedia;

/**
 *
 * @author lalotone
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Multimedia> listaMultimedia = new ArrayList();
        Scanner scan = new Scanner(System.in);
        System.out.println("Programa de Multimedia");
        Multimedia peli = new Pelicula("231","123","123",123);
        listaMultimedia.add(peli);
        
        for(int i= 0; i < 2; i++){
        System.out.println("Inserte un CD fotos");
        Multimedia cd = new Fotos(0,"","",0);
        Fotos cdf = (Fotos)cd;
        System.out.println("Introduzca el Autor: ");
        cd.setAutor(scan.nextLine());
        System.out.println("Titulo");
        cd.setTitulo(scan.nextLine());
        System.out.println("Duracion");
        cd.setDuracion(scan.nextInt());
        System.out.println("Cantidad");
        cdf.setCanFotos(scan.nextInt());
        listaMultimedia.add(cd);
        }
        
        Operar_Multimedia operar = new Operar_Multimedia(listaMultimedia);
        
        operar.mostrarLista(listaMultimedia);
        operar.instanceOf();
    }
    
}

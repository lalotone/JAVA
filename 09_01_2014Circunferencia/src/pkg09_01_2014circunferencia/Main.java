package pkg09_01_2014circunferencia;

import beans.Circulo;
import java.util.Scanner;

public class Main {
    //static Scanner entrada = new Scanner(System.in);
    //static double radio;
    //Scanner entrada = new Scanner(System.in);
    //double radio;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio;
        System.out.print("Introduce radio: ");
        radio =  entrada.nextDouble();
        
        Circulo  circulo = new Circulo(radio);
        double area = circulo.areaCirculo();
        System.out.println("El area es: "+circulo.areaCirculo());
        System.out.println("El area es: "+area);
        
        double longCirc = radio =  entrada.nextDouble();
        System.out.println("El Perimetro es: "+circulo.
                longitudCircunferencia());
        System.out.print("Introduce radio: ");
        radio =  entrada.nextDouble();
        circulo.setRd(radio);
        circulo.areaCirculo();
    
    }
}

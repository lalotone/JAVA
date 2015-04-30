
package calcular_area_circulo;

import java.util.Scanner;

public class Calcular_Area_Circulo {

    
    
    public Calcular_Area_Circulo() {
    
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio;
        System.out.println("Introduce radio: ");
        radio = entrada.nextDouble();
        
        Circulo solucion = new Circulo(radio);
        double aread = solucion.areaCirculo();
        System.out.println("El area es: "+solucion.areaCirculo());
        System.out.println("El perimetro es: "+solucion.longitudCircunferencia());
    }
    
}

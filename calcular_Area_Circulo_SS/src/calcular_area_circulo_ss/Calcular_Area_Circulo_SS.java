package calcular_area_circulo_ss;

import java.util.Scanner;
import beans.*;

public class Calcular_Area_Circulo_SS {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Operaciones operacion = new Operaciones();
        System.out.println("***Programa para calcular el area del circulo***");
        System.out.println("introduzca el radio del circulo que quiere calcular");
        operacion.setNumero(scan.nextInt());
        System.out.println("Aqui tiene el area de su circulo: "+ operacion.area());
    }

}

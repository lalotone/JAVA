package conversor_celsius_fahrenheit;
import java.util.Scanner;
import beans.Temperatura;/*Aqui le decimos que importe temperatura.java de la  misma forma que podria
ser por ejemplo un Scanner u otra funcion para que la reconozca.*/
public class Conversor_Celsius_Fahrenheit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);/*Aqui creamos un scanner para la recojida de datos*/
        Temperatura grados = new Temperatura();
        
        System.out.println("Indique temperatura:");
        double valor = scan.nextDouble();/*Aqui hacemos la primera recojida del dato*/
        System.out.println("Indique Si los grados indicados son: 1.Fahrenheit  2.Celsius:");
        int indicador = scan.nextInt();/*Aqui le especificamos si queremos que la conversion sea fahrenheit-celsuis o al reves*/

        switch(indicador){
            case 1:
                grados.setFahrenheit(valor);/*Asignarle el valor a un atributo de el archivo temperatura.java, si hemos puesto por ejemplo 36 
                pondra el valor a 36 y lo almacenara, es como una "caja" donde se guarda el dato que quieres alma
                -cenar. Si por ejemplo pusiesemos "Juan" se almacenaria ese valor.*/
                valor = grados.fahrenheitToCelsius();/*Aqui sacamos la equivalencia de valor a la operacion 
                de conversion de fahrenheit a celsius. Dicha operacion esta en el archivo 
                temperatura.java
                */
                System.out.println("Su temperatura en Celsius es: "+valor);/*Aqui imprimimos el resultado de la operacion valor*/
                break;
            case 2:
                grados.setCelsius(valor);/*Asignarle el valor a un atributo de el archivo temperatura.java, si hemos puesto por ejemplo 36 
                pondra el valor a 36 y lo almacenara, es como una "caja" donde se guarda el dato que quieres alma
                -cenar*/
                valor = grados.celsiusToFahrenheit();/*Aqui hace la operacion como arriba que se encuentra en temperatura.java
                . Es decir, es una referencia a la operacion del archivo temperatura.java*/
                System.out.println("Su temperatura en Fahrenheit es: "+valor);/*Imprimimos el resultado*/
                break;
            default:
                System.out.println("No ha indicado un sistema de medida válido.");/*Ponemos un default por si el valor introducido no es ni 1 ni 2*/
                break;
        }
    }
}

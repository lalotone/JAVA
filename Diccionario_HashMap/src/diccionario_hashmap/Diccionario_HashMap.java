
package diccionario_hashmap;
import beans.*;

public class Diccionario_HashMap {


    public static void main(String[] args) {
        Diccionario dic = new Diccionario();
        dic.anyadirPalabra("Idioma");
        dic.anyadirDefinicion("Idioma", "Es lo que pretendo enseñarle a Lalo");
        dic.anyadirDefinicion("Idioma", "Esmigorolodocoñoya.");
        dic.anyadirPalabra("Genzor");
        dic.anyadirDefinicion("Genzor", "Profesor de Bases de Datos.");
        dic.anyadirDefinicion("Genzor", "Profesor de Entornos de Desarrollo.");
        dic.anyadirPalabra("Zeta");
        dic.anyadirDefinicion("Zeta", "letra deewgeryjytjh ");
        dic.returnAll();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba_pocion;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lalotone
 */
public class Prueba_Pocion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        
        char[][] tablero1 = new char[5][5];
        char[][] tablero2 = new char[5][5];
        int filaAleatorio, columnaAleatorio;//generar números aleatorios para fila y columna
        int vida1 = 3, vida2 = 3;//vidas para los dos jugadores
        int movN;//captar el número de casillas a mover 
        int f1, c1, f2, c2;//darle valores de fila y columna de cada jugador
        int preguntaAleatoria;//variable para tener un valor aleatorio de pregunta
        int fallo = 0;//variable para perder o no una vida
        int respuesta;//capturar la respuesta del usuario
        String movC;//capturar el movimiento de dirección        
        String pregunta1 = "¿Cuántos lados tiene un triángulo?";
        String pregunta2 = "¿Cuánto es 9 x 5?";
        String pregunta3 = "¿En qué año fueron los Juegos Olimpicos de Barcelona";
        boolean condicion = true;//variable para terminar el juego
        
        //asignar 
        filaAleatorio = rd.nextInt(4);
        columnaAleatorio = rd.nextInt(4);
        f1 = filaAleatorio;
        c1 = columnaAleatorio;
        tablero1[filaAleatorio][columnaAleatorio] = 'V';     
        
        filaAleatorio = rd.nextInt(4);
        columnaAleatorio = rd.nextInt(4);
        f2 = filaAleatorio;
        c2 = columnaAleatorio;
        tablero2[filaAleatorio][columnaAleatorio] = 'I';
       
        
        for (int i = 0; i < 5; i++) {//poner 5 indios en tablero de vaquero
            do{
                filaAleatorio = rd.nextInt(5);
                columnaAleatorio = rd.nextInt(5);
            }while(tablero1[filaAleatorio][columnaAleatorio] == 'V');
            tablero1[filaAleatorio][columnaAleatorio] = 'I';
        }
        for (int i = 0; i < 5; i++) {//poner 5 vaqueros en tablero de indio
            do{
                filaAleatorio = rd.nextInt(5);
                columnaAleatorio = rd.nextInt(5);
            }while(tablero2[filaAleatorio][columnaAleatorio] == 'I');
            tablero2[filaAleatorio][columnaAleatorio] = 'V';
        }
        
        for (int i = 0; i < 3; i++) {//poner 3 pociones en tablero 1
            do{
                filaAleatorio = rd.nextInt(5);
                columnaAleatorio = rd.nextInt(5);
            }while(tablero1[filaAleatorio][columnaAleatorio] == 'V' || tablero1[filaAleatorio][columnaAleatorio] == 'I');
            tablero1[filaAleatorio][columnaAleatorio] = 'P';
        }
        for (int i = 0; i < 3; i++) {//poner 3 pociones en tablero 2
            do{
                filaAleatorio = rd.nextInt(5);
                columnaAleatorio = rd.nextInt(5);
            }while(tablero2[filaAleatorio][columnaAleatorio] == 'V' || tablero2[filaAleatorio][columnaAleatorio] == 'I');
            tablero2[filaAleatorio][columnaAleatorio] = 'P';
        }
        
        for (int fila = 0; fila < 5; fila++) {//rellenar los huecos con L
            for (int columna = 0; columna < 5; columna++) {
                if(tablero1[fila][columna] != 'I' && tablero1[fila][columna] != 'V' && tablero1[fila][columna] != 'P'){
                    tablero1[fila][columna] = 'L';
                }
            }
        }
        for (int fila = 0; fila < 5; fila++) {//rellenar los huecos con L
            for (int columna = 0; columna < 5; columna++) {
                if(tablero2[fila][columna] != 'I' && tablero2[fila][columna] != 'V' && tablero2[fila][columna] != 'P'){
                    tablero2[fila][columna] = 'L';
                }
            }
        }
        
        for (int fila = 0; fila < 5; fila++) {//imprimir tablero 1
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(tablero1[fila][columna] + " ");
            }
            System.out.println("");
        }
        System.out.println();
        for (int fila = 0; fila < 5; fila++) {//imrprimir tablero 2
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(tablero2[fila][columna] + " ");
            }
            System.out.println("");
        }
        while(condicion){//bucle para repetir el juego
            
            //movivmientos de jugador 1 en tablero 2
            System.out.print("Jugador 1, indique el número de casillas que quiere mover su vaquero: ");            
            movN = sc.nextInt(); //capturar número de casillas
            while(movN < 1 || movN >9){
                System.out.print("El número no es válido, ecriba un número entre 1 y 9: ");
                movN = sc.nextInt(); 
            }
            System.out.print("Jugador 1, indique la dirección en la que quiere mover su vaquero (w/a/s/d): ");
            movC = sc.next();//capturar dirección de movimiento
            preguntaAleatoria = rd.nextInt(3);

            switch(movC.charAt(0)){//switch para los distintos movimientos del jugador 1
                case 'w':
                    if((f2 - movN) < 0){//si se sale del tablero
                        System.out.println("Este movimiento no es válido, te sales del tablero");
                    }else if(tablero2[f2 - movN][c2] == 'V'){//si cae en una celda de vaquero 
                        System.out.println("Has caído en una celda con un indio; si aciertas la pregunta no perderás una vida.");
                        switch(preguntaAleatoria){
                            case 0:
                                System.out.println(pregunta1);
                                respuesta = sc.nextInt();
                                if(respuesta == 3){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 1:
                                System.out.println(pregunta2);
                                respuesta = sc.nextInt();
                                if(respuesta == 45){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 2:
                                System.out.println(pregunta3);
                                respuesta = sc.nextInt();
                                if(respuesta == 1992){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                        }
                        if(fallo == 0){
                            System.out.println("Has acertado la pregunta, no pierdes una vida");
                            f2 = f2 - movN;
                            tablero2[f2][c2] = 'I';
                            tablero2[f2 + movN][c2] = 'L';
                        }else{
                            System.out.println("Has fallado la pregunta , pierdes una vida");
                            f2 = f2 - movN;
                            tablero2[f2][c2] = 'I';
                            tablero2[f2 + movN][c2] = 'L';
                            vida1--;
                        }                             
                    }else if(tablero2[f2 - movN][c2] == 'P'){//si cae en una poción
                        System.out.println("Acabas de ganar una vida");
                        f2 = f2 - movN;
                        tablero2[f2][c2] = 'I';
                        tablero2[f2 + movN][c2] = 'L';
                        vida1++;
                    }else{//movimiento normal
                        f2 = f2 - movN;
                        tablero2[f2][c2] = 'I';
                        tablero2[f2 + movN][c2] = 'L';
                    }
                    break;
                case 's':
                    if((f2 + movN) > 4){
                        System.out.println("Este movimiento no es válido, te sales del tablero");
                    }else if(tablero2[f2 + movN][c2] == 'V'){
                        System.out.println("Has caído en una celda con un indio; si aciertas la pregunta no perderás una vida.");
                        switch(preguntaAleatoria){
                            case 0:
                                System.out.println(pregunta1);
                                respuesta = sc.nextInt();
                                if(respuesta == 3){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 1:
                                System.out.println(pregunta2);
                                respuesta = sc.nextInt();
                                if(respuesta == 45){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 2:
                                System.out.println(pregunta3);
                                respuesta = sc.nextInt();
                                if(respuesta == 1992){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                        }
                        if(fallo == 0){
                            System.out.println("Has acertado la pregunta, no pierdes una vida");
                            f2 = f2 + movN;
                            tablero2[f2][c2] = 'I';
                            tablero2[f2 - movN][c2] = 'L';
                        }else{
                            System.out.println("Has fallado la pregunta , pierdes una vida");
                            f2 = f2 + movN;
                            tablero2[f2][c2] = 'I';
                            tablero2[f2 - movN][c2] = 'L';
                            vida1--;
                        }
                    }else if(tablero2[f2 + movN][c2] == 'P'){
                        System.out.println("Acabas de ganar una vida");
                        f2 = f2 + movN;
                        tablero2[f2][c2] = 'I';
                        tablero2[f2 - movN][c2] = 'L';
                        vida1++;
                    }else{
                        f2 = f2 + movN;
                        tablero2[f2][c2] = 'I';
                        tablero2[f2 - movN][c2] = 'L';
                    }
                    break;
                case 'a':
                    if((c2 - movN) < 0){
                        System.out.println("Este movimiento no es válido, te sales del tablero");
                    }else if(tablero2[f2][c2  - movN] == 'V'){
                        System.out.println("Has caído en una celda con un indio; si aciertas la pregunta no perderás una vida.");
                        switch(preguntaAleatoria){
                            case 0:
                                System.out.println(pregunta1);
                                respuesta = sc.nextInt();
                                if(respuesta == 3){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 1:
                                System.out.println(pregunta2);
                                respuesta = sc.nextInt();
                                if(respuesta == 45){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 2:
                                System.out.println(pregunta3);
                                respuesta = sc.nextInt();
                                if(respuesta == 1992){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                        }
                        if(fallo == 0){
                            System.out.println("Has acertado la pregunta, no pierdes una vida");
                            c2 = c2 - movN;
                            tablero2[f2][c2] = 'I';
                            tablero2[f2][c2 + movN] = 'L';
                        }else{
                            System.out.println("Has fallado la pregunta , pierdes una vida");
                            c2 = c2 - movN;
                            tablero2[f2][c2] = 'I';
                            tablero2[f2][c2 + movN] = 'L';
                            vida1--;
                        }
                    }else if(tablero2[f2][c2 - movN] == 'P'){
                        System.out.println("Acabas de ganar una vida");
                        c2 = c2 - movN;
                        tablero2[f2][c2] = 'I';
                        tablero2[f2][c2 + movN] = 'L';
                        vida1++;
                    }else{
                        c2 = c2 - movN;
                        tablero2[f2][c2] = 'I';
                        tablero2[f2][c2 + movN] = 'L';
                    }
                    break;
                case 'd':
                    if((c2 + movN) > 4){
                        System.out.println("Este movimiento no es válido, te sales del tablero");
                    }else if(tablero2[f2][c2 + movN] == 'V'){
                        System.out.println("Has caído en una celda con un indio; si aciertas la pregunta no perderás una vida.");
                        switch(preguntaAleatoria){
                            case 0:
                                System.out.println(pregunta1);
                                respuesta = sc.nextInt();
                                if(respuesta == 3){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 1:
                                System.out.println(pregunta2);
                                respuesta = sc.nextInt();
                                if(respuesta == 45){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 2:
                                System.out.println(pregunta3);
                                respuesta = sc.nextInt();
                                if(respuesta == 1992){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                        }
                        if(fallo == 0){
                            System.out.println("Has acertado la pregunta, no pierdes una vida");
                            c2 = c2 + movN;
                            tablero2[f2][c2] = 'I';
                            tablero2[f2][c2 - movN] = 'L';
                        }else{
                            System.out.println("Has fallado la pregunta , pierdes una vida");
                            c2 = c2 + movN;
                            tablero2[f2][c2] = 'I';
                            tablero2[f2][c2 - movN] = 'L';
                            vida1--;
                        }
                    }else if(tablero2[f2][c2  + movN] == 'P'){
                        System.out.println("Acabas de ganar una vida");
                        c2 = c2 + movN;
                        tablero2[f2][c2] = 'I';
                        tablero2[f2][c2 - movN] = 'L';
                        vida1++;
                    }else{
                        c2 = c2 + movN;
                        tablero2[f2][c2] = 'I';
                        tablero2[f2][c2 - movN] = 'L';
                    }
                    break;
                default:
                    System.out.println("Este movimiento no es válido");
            }
            
            //movimientos de jugador 2 en tablero 1
            System.out.print("Jugador 2, indique el número de casillas que quiere mover su vaquero: ");            
            movN = sc.nextInt(); 
            while(movN < 1 || movN >9){
                System.out.print("El número no es válido, ecriba un número entre 1 y 9: ");
                movN = sc.nextInt(); 
            }
            System.out.print("Jugador 2, indique la dirección en la que quiere mover su vaquero (w/a/s/d): ");
            movC = sc.next();
            preguntaAleatoria = rd.nextInt(3);

            switch(movC.charAt(0)){
                case 'w':
                    if((f1 - movN) < 0){
                        System.out.println("Este movimiento no es válido, te sales del tablero");
                    }else if(tablero1[f1 - movN][c1] == 'I'){
                        System.out.println("Has caído en una celda con un indio; si aciertas la pregunta no perderás una vida.");
                        switch(preguntaAleatoria){
                            case 0:
                                System.out.println(pregunta1);
                                respuesta = sc.nextInt();
                                if(respuesta == 3){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 1:
                                System.out.println(pregunta2);
                                respuesta = sc.nextInt();
                                if(respuesta == 45){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 2:
                                System.out.println(pregunta3);
                                respuesta = sc.nextInt();
                                if(respuesta == 1992){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                        }
                        if(fallo == 0){
                            System.out.println("Has acertado la pregunta, no pierdes una vida");
                            f1 = f1 - movN;
                            tablero1[f1][c1] = 'V';
                            tablero1[f1 + movN][c1] = 'L';
                        }else{
                            System.out.println("Has fallado la pregunta , pierdes una vida");
                            f1 = f1 - movN;
                            tablero1[f1][c1] = 'V';
                            tablero1[f1 + movN][c1] = 'L';
                            vida2--;
                        }                             
                    }else if(tablero1[f1 - movN][c1] == 'P'){
                        System.out.println("Acabas de ganar una vida");
                        f1 = f1 - movN;
                        tablero1[f1][c1] = 'V';
                        tablero1[f1 + movN][c1] = 'L';
                        vida2++;
                    }else{
                        f1 = f1 - movN;
                        tablero1[f1][c1] = 'V';
                        tablero1[f1 + movN][c1] = 'L';
                    }
                    break;
                case 's':
                    if((f1 + movN) > 4){
                        System.out.println("Este movimiento no es válido, te sales del tablero");
                    }else if(tablero1[f1 + movN][c1] == 'I'){
                        System.out.println("Has caído en una celda con un indio; si aciertas la pregunta no perderás una vida.");
                        switch(preguntaAleatoria){
                            case 0:
                                System.out.println(pregunta1);
                                respuesta = sc.nextInt();
                                if(respuesta == 3){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 1:
                                System.out.println(pregunta2);
                                respuesta = sc.nextInt();
                                if(respuesta == 45){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 2:
                                System.out.println(pregunta3);
                                respuesta = sc.nextInt();
                                if(respuesta == 1992){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                        }
                        if(fallo == 0){
                            System.out.println("Has acertado la pregunta, no pierdes una vida");
                            f1 = f1 + movN;
                            tablero1[f1][c1] = 'V';
                            tablero1[f1 - movN][c1] = 'L';
                        }else{
                            System.out.println("Has fallado la pregunta , pierdes una vida");
                            f1 = f1 + movN;
                            tablero1[f1][c1] = 'V';
                            tablero1[f1 - movN][c1] = 'L';
                            vida2--;
                        }
                    }else if(tablero1[f1 + movN][c1] == 'P'){
                        System.out.println("Acabas de ganar una vida");
                        f1 = f1 + movN;
                        tablero1[f1][c1] = 'V';
                        tablero1[f1 - movN][c1] = 'L';
                        vida2++;
                    }else{
                        f1 = f1 + movN;
                        tablero1[f1][c1] = 'V';
                        tablero1[f1 - movN][c1] = 'L';
                    }
                    break;
                case 'a':
                    if((c1 - movN) < 0){
                        System.out.println("Este movimiento no es válido, te sales del tablero");
                    }else if(tablero1[f1][c1  - movN] == 'I'){
                        System.out.println("Has caído en una celda con un indio; si aciertas la pregunta no perderás una vida.");
                        switch(preguntaAleatoria){
                            case 0:
                                System.out.println(pregunta1);
                                respuesta = sc.nextInt();
                                if(respuesta == 3){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 1:
                                System.out.println(pregunta2);
                                respuesta = sc.nextInt();
                                if(respuesta == 45){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 2:
                                System.out.println(pregunta3);
                                respuesta = sc.nextInt();
                                if(respuesta == 1992){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                        }
                        if(fallo == 0){
                            System.out.println("Has acertado la pregunta, no pierdes una vida");
                            c1 = c1 - movN;
                            tablero1[f1][c1] = 'V';
                            tablero1[f1][c1 + movN] = 'L';
                        }else{
                            System.out.println("Has fallado la pregunta , pierdes una vida");
                            c1 = c1 - movN;
                            tablero1[f1][c1] = 'V';
                            tablero1[f1][c1 + movN] = 'L';
                            vida2--;
                        }
                    }else if(tablero1[f1][c1  - movN] == 'P'){
                        System.out.println("Acabas de ganar una vida");
                        c1 = c1 - movN;
                        tablero1[f1][c1] = 'V';
                        tablero1[f1][c1 + movN] = 'L';
                        vida2++;
                    }else{
                        c1 = c1 - movN;
                        tablero1[f1][c1] = 'V';
                        tablero1[f1][c1 + movN] = 'L';
                    }
                    break;
                case 'd':
                    if((c1 + movN) > 4){
                        System.out.println("Este movimiento no es válido, te sales del tablero");
                    }else if(tablero1[f1][c1 + movN] == 'I'){
                        System.out.println("Has caído en una celda con un indio; si aciertas la pregunta no perderás una vida.");
                        switch(preguntaAleatoria){
                            case 0:
                                System.out.println(pregunta1);
                                respuesta = sc.nextInt();
                                if(respuesta == 3){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 1:
                                System.out.println(pregunta2);
                                respuesta = sc.nextInt();
                                if(respuesta == 45){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                            case 2:
                                System.out.println(pregunta3);
                                respuesta = sc.nextInt();
                                if(respuesta == 1992){
                                    fallo = 0;
                                }else{
                                    fallo = 1;
                                }
                                break;
                        }
                        if(fallo == 0){
                            System.out.println("Has acertado la pregunta, no pierdes una vida");
                            c1 = c1 + movN;
                            tablero1[f1][c1] = 'V';
                            tablero1[f1][c1 - movN] = 'L';
                        }else{
                            System.out.println("Has fallado la pregunta , pierdes una vida");
                            c1 = c1 + movN;
                            tablero1[f1][c1] = 'V';
                            tablero1[f1][c1 - movN] = 'L';
                            vida2--;
                        }
                    }else if(tablero1[f1][c1  + movN] == 'P'){
                        System.out.println("Acabas de ganar una vida");
                        c1 = c1 + movN;
                        tablero1[f1][c1] = 'V';
                        tablero1[f1][c1 - movN] = 'L';
                        vida2++;
                    }else{
                        c1 = c1 + movN;
                        tablero1[f1][c1] = 'V';
                        tablero1[f1][c1 - movN] = 'L';
                    }
                    break;
                default:
                    System.out.println("Este movimiento no es válido");
            }
            if(vida1 == 0){//cambiar la condicion del while si pierde todas las vidas
                condicion = false;
                System.out.println("Jugador 1, has perdido todas las vidas. Se acabó el juego");
            }
            if(vida2 == 0){
                condicion = false;
                System.out.println("Jugador 2, has perdido todas las vidas. Se acabó el juego");
            }
            for (int fila = 0; fila < 5; fila++) {//imprimir los tableros por segunda vez con las nuevas posiciones
                for (int columna = 0; columna < 5; columna++) {
                    System.out.print(tablero1[fila][columna] + " ");
                }
                System.out.println("");
            }
            for (int fila = 0; fila < 5; fila++) {
                for (int columna = 0; columna < 5; columna++) {
                    System.out.print(tablero2[fila][columna] + " ");
                }
                System.out.println("");
            }
        }
    }
    
}

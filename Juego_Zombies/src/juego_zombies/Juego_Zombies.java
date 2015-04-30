package juego_zombies;
import java.util.Scanner;
import java.util.Random;
public class Juego_Zombies {

    public static void main(String[] args) {

        //----------DEFINICIÓN DE VARIABLES PRINCIPALES-------------------------
        
        Scanner sc = new Scanner(System.in);
            //Scanner para solicitar el dato a los jugadores.
        Random rd = new Random();
            //Random para asignar números aleatorios a determinadas posiciones
                //de las matrices.
        int [][] tablero1 = new int [5][5];
            //Para el primer tablero de juego.
        int [][] tablero2 = new int [5][5];
            //Para el segundo tablero de juego.
        int fila1, columna1, fila2, columna2, fipo1, copo1, fipo2, copo2;
            //fila1 y columna1 para moverse por el tablero 1.
            //fila2 y columna2 para moverse por el tablero 2.
        int vida1=3, vida2=3;
            //vida1 y vida2 para las vidas de los dos jugadores. Lo igualamos a 3.
        String mov1, mov2;
            //mov1 y mov2 para registrar los movimientos que seleccionen los
                //jugadores de forma separada.
        boolean condicion = true, badmov1 = true, badmov2 = true;
            //Condición para mantener el juego abierto hasta que terminemos.
            //badmov1 y badmov2 para movimientos no permitidos o especiales.
        
        //----------------------------------------------------------------------
        
        //----------BUCLES DE GENERACIÓN DEL PRIMER TABLERO---------------------
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tablero1[i][j]=1;
            }
        }
            //Nos genera un mapa de 1 en el primer tablero.
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i%2==0 && j%2==0) {
                    tablero1[i][j]=rd.nextInt(2)+1;
                }
            }
        }
            //Nos rellena aleatoriamente en determinadas filas 2. En este juego,
                //el 2 equivale a un zombie.
        fipo1=rd.nextInt(5);
        copo1=rd.nextInt(5);
        tablero1[fipo1][copo1]=3;
            //El número 3 equivaldrá a una poción que te restaurará una vida.
        do {
            fila1=rd.nextInt(5);
            columna1=rd.nextInt(5);
                //Solicitamos que se inserte un número aleatorio en fila y columna
                    //para que player1 aparezca en una posición aleatoria del tablero.
        } while (tablero1[fila1][columna1] == tablero1[fipo1][copo1]);
            //Esta condición establece que mientras la posición aleatoria generada
                //para la poción restauradora sea igual a la que se ha generado
                //aleatoriamente para el jugador, siga buscando otra posición.
        tablero1[fila1][columna1]=0;
        int player1 = tablero1[fila1][columna1];
            //Le decimos también que el jugador es igual a esa posición.
        System.out.println("1º Tablero:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tablero1[i][j]+" ");
            }
            System.out.println();
            //Imprimimos el mapa con la posición del jugador, las posiciones
                //libres, posiciones de los zombies y posición de la poción.
        }
        
        //----------------------------------------------------------------------
        
            /* - LOS COMENTARIOS DE TABLERO1 VALEN IGUAL PARA TABLERO2 - */
        
        //----------BUCLES DE GENERACIÓN DEL SEGUNDO TABLERO--------------------
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tablero2[i][j]=1;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i%2==0 && j%2==0) {
                    tablero2[i][j]=rd.nextInt(2)+1;
                }
            }
        }
        
        fipo2=rd.nextInt(5);
        copo2=rd.nextInt(5);
        tablero2[fipo2][copo2]=3;
        
        do {
          fila2=rd.nextInt(5);
        columna2=rd.nextInt(5);  
            } while (tablero2[fipo2][copo2]== tablero2[fila2][columna2]);
        
        tablero2[fila2][columna2]=0;
        int player2 = tablero2[fila2][columna2];
        
        System.out.println("2º Tablero:");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tablero2[i][j]+" ");
            }
            System.out.println();
        }
        
        //----------------------------------------------------------------------
        
        //----------CÓDIGO DE JUEGO, MOVIMIENTOS DE TABLEROS--------------------
        
        do {
            
            //----------MOVIMIENTOS DEL PRIMER JUGADOR--------------------------
            
            System.out.println("Jugador 1, muévase (w/a/s/d)");
            mov1=sc.next();
                //Solicitamos a player1 que introduzca su movimiento.
            switch (mov1.charAt(0)){
                //Realizamos switch para los diferentes casos en los cuales el
                    //jugador puede desplazarse y qué sucede con cada movimiento.
                case 'w':
                    if (fila1==0) {
                        System.out.println("Movimiento fuera de tablero. Pierdes turno.");
                        badmov1 = false;
                        //Si la fila es igual a 0, no hay más filas arriba.
                    }
                    if (tablero1[fila1-1][columna1]==2) {
                        System.out.println("Te has chocado con un zombie y te ha mordido.");
                        vida1--;
                        System.out.println("Vidas restantes: "+vida1);
                        badmov1 = false;
                        //Si donde vamos a movernos hay un zombie, nos quita una
                            //vida y no nos desplazamos.
                    }
                    if (tablero1[fila1-1][columna1]==1) {
                        player1=tablero1[fila1--][columna1];
                        tablero1[fila1+1][columna1]=1;
                        badmov1=true;
                        //Si el movimiento es válido, nos desplazamos.
                    }
                    if (tablero1[fila1-1][columna1]==3) {
                        System.out.println("¡¡HAS ENCONTRADO UNA POCIÓN CURATIVA!!");
                        player1=tablero1[fila1--][columna1];
                        tablero1[fila1+1][columna1]=1;
                        vida1++;
                        badmov1=true;
                        //Si el movimiento es válido y hay poción, nos desplazamos
                            //y nos suma una vida.
                    }
                    break;
                
                case 'a':
                    if (columna1==0) {
                        System.out.println("Movimiento fuera de tablero. Pierdes turno.");
                        badmov1=false;
                        //Si la columna es igual a 0, no hay más filas a la izquierda.
                    }
                    if (tablero1[fila1][columna1-1]==2) {
                        System.out.println("Te has chocado con un zombie y te ha mordido.");
                        vida1--;
                        System.out.println("Vidas restantes: "+vida1);
                        badmov1 = false;
                        //Si donde vamos a movernos hay un zombie, nos quita una
                            //vida y no nos desplazamos.
                    }
                    if (tablero1[fila1][columna1-1]==1) {
                        player1=tablero1[fila1][columna1--];
                        tablero1[fila1][columna1+1]=1;
                        badmov1 = true;
                        //Si el movimiento es válido, nos desplazamos.
                    }
                    if (tablero1[fila1][columna1-1]==3) {
                        System.out.println("¡¡HAS ENCONTRADO UNA POCIÓN CURATIVA!!");
                        player1=tablero1[fila1][columna1--];
                        tablero1[fila1][columna1+1]=1;
                        vida1++;
                        badmov1 = true;
                        //Si el movimiento es válido y hay poción, recuperamos
                            //una vida y nos desplazamos.
                    }
                    break;
                
                case 's':
                    if (fila1==4) {
                        System.out.println("Movimiento fuera de tablero. Pierdes turno.");
                        badmov1 = false;
                        //Si la fila es igual a 4, no hay más filas abajo.
                    }
                    if (tablero1[fila1+1][columna1]==2) {
                        System.out.println("Te has chocado con un zombie y te ha mordido.");
                        vida1--;
                        System.out.println("Vidas restantes: "+vida1);
                        badmov1 = false;
                        //Si la fila a la que nos vamos a mover hay un zombie, nos
                            //quita una vida y no nos desplazamos.
                    }
                    if (tablero1[fila1+1][columna1]==1) {
                        player1=tablero1[fila1++][columna1];
                        tablero1[fila1-1][columna1]=1;
                        badmov1=true;
                        //Si el movimiento es válido, nos desplazamos.
                    }
                    if (tablero1[fila1+1][columna1]==3) {
                        System.out.println("¡¡HAS ENCONTRADO UNA POCIÓN CURATIVA!!");
                        player1=tablero1[fila1++][columna1];
                        tablero1[fila1-1][columna1]=1;
                        vida1++;
                        badmov1=true;
                        //Si el movimiento es válido y hay poción, recuperamos
                            //una vida y nos desplazamos.
                    }
                    break;
                    
                case 'd':
                    if (columna1==4) {
                        System.out.println("Movimiento fuera de tablero. Pierdes turno.");
                        badmov1=false;
                        //Si la columna a la que nos vamos a mover es igual a 4,
                            //no hay más columnas a la derecha.
                    }
                    if (tablero1[fila1][columna1+1]==2) {
                        System.out.println("Te has chocado con un zombie y te ha mordido.");
                        vida1--;
                        System.out.println("Vidas restantes: "+vida1);
                        badmov1 = false;
                        //Si a donde vamos a desplazarnos hay un zombie, nos quita
                            //una vida y no nos desplazamos.
                    }
                    if (tablero1[fila1][columna1+1]==1) {
                        player1=tablero1[fila1][columna1++];
                        tablero1[fila1][columna1-1]=1;
                        badmov1 = true;
                        //Si el movimiento es válido, nos desplazamos.
                    }
                    if (tablero1[fila1][columna1+1]==3) {
                        System.out.println("¡¡HAS ENCONTRADO UNA POCIÓN CURATIVA!!");
                        player1=tablero1[fila1][columna1++];
                        tablero1[fila1][columna1-1]=1;
                        vida1++;
                        badmov1 = true;
                        //Si el movimiento es válido y hay poción, recuperamos
                            //una vida y nos desplazamos.
                    }
                    break;
                default:
                    System.out.println("Movimiento no válido, Player 1 pierde su turno.");
                        //En caso de que el movimiento que ha insertado el jugador
                            //no sea válido.
            }
            
            tablero1[fila1][columna1]=0;
            
            if (badmov1) {
                System.out.println("1º Tablero: ");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(tablero1[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            if (vida1==0) {
                System.out.println("Player 1 se ha quedado sin vidas, el ganador es Player 2.");
                condicion = false;
            }
            
            //----------MOVIMIENTOS DEL SEGUNDO JUGADOR-------------------------
          /* - Los comentarios del movimiento de player1 se aplican a player2 - */
            
            
            if (vida1 != 0) {
                //Esta condición sirve para establecer que el jugador 2 se mueve
                    //sólo si el jugador 1 aún tiene vidas. Si el jugador 1 ha
                    //muerto, no es necesario que el jugador 2 siga moviéndose.
            System.out.println("Jugador 2, muévase (w/a/s/d)");
            mov2=sc.next();
            
            switch (mov2.charAt(0)){
            
                case 'w':
                    if (fila2==0) {
                        System.out.println("Movimiento fuera de tablero. Pierdes turno.");
                        badmov2 = false;
                    }
                    if (tablero2[fila2-1][columna2]==2) {
                        System.out.println("Te has chocado con un zombie y te ha mordido.");
                        vida2--;
                        System.out.println("Vidas restantes: "+vida2);
                        badmov2 = false;
                    }
                    if (tablero2[fila2-1][columna2]==1) {
                        player2=tablero2[fila2--][columna2];
                        tablero2[fila2+1][columna2]=1;
                        badmov2=true;
                    }
                    if (tablero2[fila2-1][columna2]==3) {
                        System.out.println("¡¡HAS ENCONTRADO UNA POCIÓN CURATIVA!!");
                        player2=tablero2[fila2--][columna2];
                        tablero2[fila2+1][columna2]=1;
                        vida2++;
                        badmov2=true;
                    }
                    break;
                
                case 'a':
                    if (columna2==0) {
                        System.out.println("Movimiento fuera de tablero. Pierdes turno.");
                        badmov2=false;
                    }
                    if (tablero2[fila2][columna2-1]==2) {
                        System.out.println("Te has chocado con un zombie y te ha mordido.");
                        vida2--;
                        System.out.println("Vidas restantes: "+vida2);
                        badmov2 = false;
                    }
                    if (tablero2[fila2][columna2-1]==1) {
                        player2=tablero2[fila2][columna2--];
                        tablero2[fila2][columna2+1]=1;
                        badmov2 = true;
                    }
                    if (tablero2[fila2][columna2-1]==3) {
                        System.out.println("¡¡HAS ENCONTRADO UNA POCIÓN CURATIVA!!");
                        player2=tablero2[fila2][columna2--];
                        tablero2[fila2][columna2+1]=1;
                        vida2++;
                        badmov2 = true;
                    }
                    break;
                
                case 's':
                    if (fila2==4) {
                        System.out.println("Movimiento fuera de tablero. Pierdes turno.");
                        badmov2 = false;
                    }
                    if (tablero2[fila2+1][columna2]==2) {
                        System.out.println("Te has chocado con un zombie y te ha mordido.");
                        vida2--;
                        System.out.println("Vidas restantes: "+vida2);
                        badmov2 = false;
                    }
                    if (tablero2[fila2+1][columna2]==1) {
                        player2=tablero2[fila2++][columna2];
                        tablero2[fila2-1][columna2]=1;
                        badmov2=true;
                    }
                    if (tablero2[fila2+1][columna2]==3) {
                        System.out.println("¡¡HAS ENCONTRADO UNA POCIÓN CURATIVA!!");
                        player2=tablero2[fila2++][columna2];
                        tablero2[fila2-1][columna2]=1;
                        vida2++;
                        badmov2=true;
                    }
                    break;
                    
                case 'd':
                    if (columna2==4) {
                        System.out.println("Movimiento fuera de tablero. Pierdes turno.");
                        badmov2=false;
                    }
                    if (tablero2[fila2][columna2+1]==2) {
                        System.out.println("Te has chocado con un zombie y te ha mordido.");
                        vida2--;
                        System.out.println("Vidas restantes: "+vida2);
                        badmov2 = false;
                    }
                    if (tablero2[fila2][columna2+1]==1) {
                        player2=tablero2[fila2][columna2++];
                        tablero2[fila2][columna2-1]=1;
                        badmov2 = true;
                    }
                    if (tablero2[fila2][columna2+1]==3) {
                        System.out.println("¡¡HAS ENCONTRADO UNA POCIÓN CURATIVA!!");
                        player2=tablero2[fila2][columna2++];
                        tablero2[fila2][columna2-1]=1;
                        vida2++;
                        badmov2 = true;
                    }
                    break;
                default:
                    System.out.println("Movimiento no válido, Player 2 pierde turno.");
            }
            
            tablero2[fila2][columna2]=0;
            
            if (badmov2) {
                System.out.println("2º Tablero: ");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(tablero2[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            if (vida2==0) {
                System.out.println("Player 2 se ha quedado sin vidas, el ganador es Player 1.");
                condicion = false;
            }
          }
        } while (condicion);
        System.out.println("----------FIN DEL JUEGO----------");
    }
}
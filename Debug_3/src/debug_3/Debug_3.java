/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package debug_3;

/**
 *
 * @author lalotone
 */
public class Debug_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           /* BUCLES*/
            // 1º) FOR
                    for(int i = 0 ; i < 10 ; i ++){
                        System.out.println("Hello!!!");
                        /*Este basicamente hay que cambiar la i para hacerla incremental en vez de decremental
                        porque sino nunca llegaria a 10 y siempre se cumpliria la funcion y este bucle no pararia*/
                    }
            // 2º) WHILE
                    boolean respuesta = false;
                    while(respuesta){
                        System.out.println("Hello!!!");
                    }/*Este bucle sinceramente no se que utilidad tiene dado que le estas diciendo que siempre
                    se cumple...¿Que tendria que hacer?.Lo he cambiado a false para que no entre y pase a las tablas de multi
                    plicar*/
            // 3º) DO-WHILE
                    boolean respuestaDoWhile = true;
                    int num = 0 ;
                    do{
                        System.out.println("Tabla de multiplicar!!!");
                        int num0= 0;
                        do {
            for (int i = 0; i <=10; i++) {
                System.out.println(num0 + "x" + i + "= " + (num0 * i));
                
            }
            num0++;
            
        }while (num0<= 10);                  
                        
                        //-----------------------------
                        //System.out.println("10x10=100"); 
                        if(num<=10){
                            respuestaDoWhile = false;
                        }
                        
                    }while(respuestaDoWhile);
    }
    
}

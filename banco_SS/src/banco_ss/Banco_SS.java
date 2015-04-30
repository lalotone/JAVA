package banco_ss;

import beans.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Banco_SS {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Cliente> listaClientes = new ArrayList();
        int select;
        boolean condicion = true;
        Cliente cliente = new Cliente();
        
        
        System.out.println("Bienvenido al banco Estafabank");
        do{
        System.out.println("Diga que operacion desea realizar: ");
        System.out.println("1-Si se desea inscribir como un nuevo cliente.");
        System.out.println("2-Si desea ver la lista de los clientes ya registrados.");
        select = scan.nextInt();

        switch (select) {
            case 1:
                System.out.println("Introduzca su nombre: ");
                cliente.setNombre(scan.next());
                System.out.println("Introduzca su apellido: ");
                cliente.setApellidos(scan.next());
                System.out.println("Introduzca su telefono: ");
                cliente.setTlfno(scan.nextInt());
                listaClientes.add(cliente);
                //Operar_Cliente operar = new Operar_Cliente(listaClientes);
                break;
            case 2:
                System.out.println(cliente.toString());
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
            System.out.println("¿Desea llevar a cabo alguna operacion mas?");
            System.out.println("1.-Si");
            System.out.println("2.-No");
            select = scan.nextInt();
            if(select == 1){
            condicion = true;
            }else{
            condicion = false;
            break;
            }
        }while(condicion = true);
        System.out.println("***Fin del programa***");
    }

}

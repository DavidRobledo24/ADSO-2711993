import java.util.Scanner;

public class Ejercicio03{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        String usu [] = new String [100];
        int memoria =0;
        int opc = 0;
        int cont=0;
        boolean ponido = false;

        do{

            memoria=0;
            for(int i=0; i<usu.length;i++){
                if(usu[i] == null) memoria++;
            }

            System.out.println("                        Memoria: "+memoria);
            System.out.println("");
            System.out.println("|---------------------------|");
            System.out.println("|---------------------------|");
            System.out.println("|-----------MENU------------|");
            System.out.println("|--                       --|");
            System.out.println("|--1.Registrar cliente    --|");
            System.out.println("|--2.Ver lista de clientes--|");
            System.out.println("|--3.Editar cliente       --|");
            System.out.println("|--4.Eliminar cliente     --|");
            System.out.println("|--5.Salir                --|");
            System.out.println("|--                       --|");
            System.out.println("|---------------------------|");

            System.out.print("Ingrese una opcion: ");
            opc = entrada.nextInt();

            switch(opc){
                case 1: 
                if(memoria!=0){
                    System.out.print("Ingrese el usuario: ");
                    String cliente = entrada2.nextLine();
                    for(int i=0;usu[i]!=null;i++){
                        if(cliente.equals(usu[i])){
                            ponido= true;
                            break;
                        }
                    }
                    if(ponido == false){
                        usu[cont]=cliente;
                        cont++;
                    }
                    else{
                        System.out.print("Ya esta el usuario.");
                        ponido=false;
                    }
                }
                else{
                    System.out.print("no hay espacio en memoria.");
                }
                break;

                case 2: 
                System.out.println("La lista de clientes es: ");
                for(int i=0;usu[i]!=null; i++){
                    System.out.println((i+1)+"."+usu[i]+"");
                }
                System.out.println(" ");
                break;

                case 3: 
                
                break;
            }
        
        }
        while(opc != 5);
    }
}
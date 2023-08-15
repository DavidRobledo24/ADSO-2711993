import java.util.Scanner;

public class Ejercicio04{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int opc = 0;
        float nota = 0;
        int notas = 0;
        float prom1 = 0;
        float suma = 0;
        float prom = 0;
        float suma = 0;
        float promSum = 0;
        float promCreditos = 0;
        float nota1 = 0;
        float credito = 0;

    do{
        System.out.println("|------------- Bienvenido ------------|");
        System.out.println("| 1. Docente                          |");
        System.out.println("| 2. Estudiante                       |");
        System.out.println("| 3. Salir                            |");
        System.out.println("|-------------------------------------|");
        System.out.print("Ingrese una opcion:  ");
        opc = entrada.nextInt();

        if(opc == 1){
            System.out.print("Ingrese el numero de notas a calcular: ");
            int notas = entrada.nextInt();


        for(int i = 1; i <= notas; i++){
            System.out.print("Ingrese la nota "+i+": ");
            nota = entrada.nextFloat();

            suma = suma + nota; 
            prom1 = suma/notas;
        }
        System.out.print("El promedio es: "+prom1);
        }
        else if(opc == 2){

        for(int i = 1; i <= notas; i++){
            System.out.print("Ingrese la nota "+i+": ");
            nota1 = entrada.nextFloat();
            System.out.print("Ingrese el valor del cretido de la nota "+i+": ");
            credito = entrada.nextFloat();

            promSum = promSum+(nota*credito);
            promCreditos = promCreditos + credito;
            prom = promSum/promCreditos;
        }
        System.out.print("El promedio ponderado es: "+prom);
        }
        else if (opc>3 && opc<1){
            System.out.print("Error, no esta en las opciones.");
        }
        }while(opc != 3);
        
        System.out.print("Hasta luego.");
    }
}
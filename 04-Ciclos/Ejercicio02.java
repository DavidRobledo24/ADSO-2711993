import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de notas a calcular: ");
        int notas = entrada.nextInt();

        float prom = 0;
        float suma = 0;
        float promSum = 0;
        float promCreditos = 0;

        for(int i = 1; i <= notas; i++){
            System.out.print("Ingrese la nota "+i+": ");
            float nota = entrada.nextFloat();
            System.out.print("Ingrese el valor del cretido de la nota "+i+": ");
            float credito = entrada.nextFloat();

            promSum = promSum+(nota*credito);
            promCreditos = promCreditos + credito;
            prom = promSum/promCreditos;
        }
        System.out.print("El promedio ponderado es: "+prom);
    }
}
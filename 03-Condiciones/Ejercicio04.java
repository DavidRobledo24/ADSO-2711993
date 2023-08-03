import java.util.Scanner;

public class Ejercicio04{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de notas a calcular: ");
        int notas = entrada.nextInt();

        float prom = 0;
        float suma = 0;

        for(int i = 1; i <= notas; i++){
            System.out.print("Ingrese la nota "+i+": ");
            float nota = entrada.nextFloat();

            suma = suma + nota; 
            prom = suma/notas;
        }

        if (prom >= 7){
            System.out.println("El promedio de las notas es de: "+prom);
            System.out.print("El estudiante aprueba.");
        }
        else{
            System.out.println("El promedio de las notas es de: "+prom);
            System.out.print("El estudiante reprueba.");
        }
    }
}
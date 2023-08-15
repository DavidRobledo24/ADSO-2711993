import java.util.Scanner;

public class Ejercicio01{
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
        System.out.print("El promedio es: "+prom);
    }
}
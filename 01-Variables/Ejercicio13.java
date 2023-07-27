import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de segundos: ");
        float seg = entrada.nextFloat();

        float minutos=seg/60;
        float horas=seg/3600;

        System.out.print("la convercion es igual a  "+seg+" segundos, "+minutos+" minutos, "+horas+" hora");
    }
}
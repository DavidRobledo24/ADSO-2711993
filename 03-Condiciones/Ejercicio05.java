import java.util.Scanner;

public class Ejercicio05{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dias: ");
        int dias = entrada.nextInt();

        if (dias == 366){
            System.out.print("Es bisiesto.");
        }
        else if (dias < 365){
            System.out.print("Esta mal, faltan dias.");
        }
        else if (dias > 366){
            System.out.print("Esta mal, sobran dias.");
        }
        else{
            System.out.print("No es bisiesto.");
        }
    }
}
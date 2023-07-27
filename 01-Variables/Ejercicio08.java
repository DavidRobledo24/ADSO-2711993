import java.util.Scanner;

public class Ejercicio08{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la primera palabra: ");
        String a = entrada.nextLine();

        System.out.print("Ingrese la segunda palabra: ");
        String b = entrada.nextLine();

        System.out.print(""+a+" "+b);
    }
}
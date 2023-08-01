import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero de tres digitos: ");
        int num = entrada.nextInt();

        if (num%2 == 0){
            System.out.print(num+" Es un numero PAR");
        }
        else{
            System.out.print(num+" Es un numero IMPAR");
        }
    }
}
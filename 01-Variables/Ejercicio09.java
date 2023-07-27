import java.util.Scanner;

public class Ejercicio09{

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("Este programa calcula si un número es par o impar.");
        System.out.print("Ingrese un numero: ");
        num = entrada.nextInt();

        if (num % 2 == 0 ){
            System.out.println("El numero "+num+" es PAR");
        }else{
            System.out.println("El numero "+num+" es IMPAR");
        }
    }
}
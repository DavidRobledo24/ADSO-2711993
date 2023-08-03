import java.util.Scanner;

public class Ejercicio03{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int n = entrada.nextInt();

        if (n%2 == 0){
            System.out.print(n+" Es numero PAR");
        }
        else{
            System.out.print(n+" Es numero IMPAR");
        }
    }
}
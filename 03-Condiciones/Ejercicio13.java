import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int num = entrada.nextInt();

        if (num%2 == 0 && num%3 == 0){
            if (num%5 == 0){
                System.out.print("El numero ingresado es divisible por 2, 3 y 5.");
            }
        }
        else if(num%2 == 0 && num%3 == 0){
            System.out.print("El numero ingresado es divisible por 2 y 3.");
        }
        else if(num%2 == 0 && num%5 == 0){
            System.out.print("El numero ingresado es divisible por 2 y 5.");
        }
        else if(num%5 == 0 && num%3 == 0){
            System.out.print("El numero ingresado es divisible por 3 y 5.");
        }
        else if (num%2 == 0){
            System.out.print("El numero ingresado solo es divisible por 2.");
        }
        else if (num%3 == 0){
            System.out.print("El numero ingresado solo es divisible por 3.");
        }
        else if (num%5 == 0){
            System.out.print("El numero ingresado solo es divisible por 5.");
        }
        else{
            System.out.print("El numero ingresado no es divisible por 2, 3 y 5.");
        }
    }
}
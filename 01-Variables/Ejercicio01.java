import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero a sumar: ");
        int a = teclado.nextInt();

        System.out.print("Ingrese el segundo numero a sumar: ");
        int b = teclado.nextInt();

        int total= a+b;

        System.out.print("el resusltado de "+a+" + "+b+" es: "+total);
    }
}
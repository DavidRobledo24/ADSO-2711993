import java.util.Scanner;

public class Ejercicio03{
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        int a = teclado.nextInt();

        System.out.print("Ingrese el segundo numero : ");
        int b = teclado.nextInt();

        int c=a;
        a=b;
        b=c;
        System.out.print("el valor del primer numero es: "+a+", el valor de la segunda variable es: "+b);
    }
}
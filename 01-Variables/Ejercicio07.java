import java.util.Scanner;

public class Ejercicio07{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        float a = entrada.nextInt();

        System.out.print("Ingrese el valor del descuento: ");
        float b = entrada.nextInt();

        float des=(a*b)/100;
        float total=a-des;

        System.out.print("El valor del descuento es de: "+des+". El valor a pagar es de: "+total);
    }
}
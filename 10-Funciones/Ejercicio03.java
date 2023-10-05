import java.util.Scanner;

public class Ejercicio03{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int n1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = entrada.nextInt();

        System.out.println("");
        System.out.println("La multiplicacion es: "+Multi(n1,n2));
    }
    public static int Multi(int n1, int n2){
        return n1*n2;
    }
}
import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int n1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = entrada.nextInt();

        System.out.println("");
        System.out.println("La suma es: "+Suma(n1,n2));
    }
    public static int Suma(int n1, int n2){
        return n1+n2;
    }
}
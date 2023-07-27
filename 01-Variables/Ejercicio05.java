import java.util.Scanner;

public class Ejercicio05{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la altura del triangulo: ");
        float a = entrada.nextInt();

        System.out.print("Ingrese la base del triangulo: ");
        float b = entrada.nextInt();
        
        float total=(b*a)/2;
        System.out.print("El area del triangulo es de: "+total);
    }
}
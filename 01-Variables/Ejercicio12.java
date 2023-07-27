import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        float a = entrada.nextfloat();

        System.out.print("Ingrese la altura del rectangulo: ");
        float b = entrada.nextFloat();

        float res=b*a;

        System.out.print("El area del rectangulo es de: "+res);
    }
}
import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el dividendo de la operacion: ");
        float n1 = entrada.nextFloat();

        System.out.print("Ingrese el divisor de la operacion: ");
        float n2 = entrada.nextFloat();

        float resusltado=n1/n2;
        float residuo= n1%n2;

        System.out.print("El resultado de la divicion es: "+resusltado+" y el residuo es de: "+residuo);
    }
}
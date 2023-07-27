import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el capital inical: ");
        double cI = entrada.nextDouble();

        System.out.print("Ingrese la tasa de interes: ");
        double i = entrada.nextDouble();

        System.out.print("Ingrese el numero de cuotas: ");
        double n = entrada.nextDouble();

        double cF = Math.pow(cI*(1+i), n);

        System.out.print(cF);
    }
}
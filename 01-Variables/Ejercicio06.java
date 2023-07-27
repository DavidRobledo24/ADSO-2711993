import java.util.Scanner;

public class Ejercicio06{
    public static void main(String[]args){

        float prom;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        float n1 = entrada.nextFloat();

        System.out.print("Ingrese la segunda nota: ");
        float n2 = entrada.nextFloat();

        System.out.print("Ingrese la tercera nota: ");
        float n3 = entrada.nextFloat();

        System.out.print("Ingrese la cuarta nota: ");
        float n4 = entrada.nextFloat();

        System.out.print("Ingrese la quinta nota: ");
        float n5 = entrada.nextFloat();

        prom=(n1+n2+n3+n4+n5)/5;

        System.out.println("\n");
        System.out.println("El promedio de notas es de: "+prom);

        entrada.close();
    }
}
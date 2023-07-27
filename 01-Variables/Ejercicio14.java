import java.util.Scanner;

public class Ejercicio14{

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

            float prom;
            float promar=0f; 
            float promab=0f;

        System.out.print("Ingrese la nota: " );
        float n1 = entrada.nextFloat();

        System.out.print("Ingrese el valor del credito: ");
        float c1 = entrada.nextFloat();

        System.out.print("Ingrese la nota: " );
        float n2 = entrada.nextFloat();

        System.out.print("Ingrese el valor del credito: ");
        float c2 = entrada.nextFloat();

        System.out.print("Ingrese la nota: " );
        float n3 = entrada.nextFloat();

        System.out.print("Ingrese el valor del credito: ");
        float c3 = entrada.nextFloat();

        prom=(n1*c1)*(n2*c2)*(n3*c3)/(c1+c2+c3);

        System.out.println("");
        System.out.println("El promedio de notas es de: "+prom);

    }
}
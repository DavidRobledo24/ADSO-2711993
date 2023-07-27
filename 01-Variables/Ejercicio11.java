import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el radio del circulo a calcular: ");
        float ra = entrada.nextFloat();

        double area=(3.1416*(ra*ra));
        double peri=(2*3.1416*ra);

        System.out.print("El area del triangulo es: "+area+" y el perimetro es de: "+peri);
    }
}
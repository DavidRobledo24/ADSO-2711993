import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura en grados Celsius para la conversion: ");
        float c = teclado.nextFloat();

        float f=(c*9/5)+32;

        System.out.print("El resusltado de la conversion de Ceslsius a Fahrenheit es: "+f);
    }
}        
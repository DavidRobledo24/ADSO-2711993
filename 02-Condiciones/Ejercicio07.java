import java.util.Scanner;
import java.text.NumberFormat;

public class Ejercicio07{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero de 10 digitos como maximo, y menor a dos mil millones: ");
        double num = entrada.nextFloat();

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String numString = formatter.format(num);       

        System.out.println("||--------------------FORMATO DE MONEDA-------------------||");
        System.out.println("Moneda: "+numString); 
        System.out.println("||--------------------------------------------------------||");
    }
}
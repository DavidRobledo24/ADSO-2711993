import java.util.Scanner;

public class Ejercicio17{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de pesos a convertir: ");
        double cop = teclado.nextDouble();

        double usd = cop*0.00024;
        double eur = cop*0.0002;
        double jpy = cop*0.035;
        double gbp = cop*0.0001;
        System.out .print("la conversion es igual a:\n"+"todo esto en dolares: "+usd+" USD"+
        "\ntodo esto en euros: "+eur+" EUR"+"\ntodo esto en yenes: "+jpy+" JPY"+"\ny todo esto en libras: "+gbp+" GBP");

    }
}
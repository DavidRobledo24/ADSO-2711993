import java.util.Scanner;

public class PracticaMetodo01{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese a: ");
        int a = entrada.nextInt();
        System.out.print("Ingrese b: ");
        int b = entrada.nextInt();

        System.out.println("");
        System.out.println("La suma es: "+Suma(a,b));
        System.out.println("La resta es: "+Resta(a,b));
        System.out.println("La multiplicacion es: "+Multi(a,b));
        System.out.println("La divicion es: "+Divi(a,b));

    }

    public static int Suma(int a, int b){
        return a+b;
    }
    public static int Multi(int a, int b){
        return a*b;
    }
    public static int Resta(int a, int b){
        return a-b;
    }
    public static int Divi(int a, int b){
        return a/b;
    }


}
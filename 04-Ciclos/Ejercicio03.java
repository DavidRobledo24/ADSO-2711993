import java.util.Scanner;

public class Ejercicio03{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la altura de la piramide: ");
        int numFilas = entrada.nextInt();

        for (int altura = 1; altura<=numFilas; altura++){
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
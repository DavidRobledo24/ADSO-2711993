import java.util.Scanner;

public class Ejercicio05{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int n1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = entrada.nextInt();

        int result = Potencia(n1,n2);
        System.out.println("");
        System.out.println("La divicion es: "+result);
    }
    public static int Potencia(int n1, int n2){
        int result = n1;
        for(int i=1;i<n2;i++){
            result*=n1;
        }
        return result;
    }
}
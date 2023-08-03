import java.util.Scanner;

public class Ejercicio08{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la altuda del triangulo: ");
        float altura = entrada.nextFloat();
        System.out.print("Ingrese la base del triangulo: ");
        float base = entrada.nextFloat();

        if (altura > 0 && base >0){
            float area = (base*altura)/2;
            System.out.print("El area del triangulo es: "+area);
        }
        else{
            System.out.print("Los valores deben de ser mayores a cero.");
        }
    }
}
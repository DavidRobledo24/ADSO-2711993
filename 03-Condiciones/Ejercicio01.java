import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        float num = teclado.nextFloat();

        if (num>0){
            System.out.print("El numero es positivo");
        }
        else if(num<0){
            System.out.print("El numero es negativo");
        }
        else{
            System.out.print("El numero es cero");
        }
    }
}
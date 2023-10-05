import java.util.Scanner;

public class Ejercicio08{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de valores: ");
        int cant = entrada.nextInt();

        int array[] = new int [cant];
        LlenadoArray(array);

        System.out.println("El contenido del array es: ");
        for(int i=0; i<array.length; i++){
            System.out.print("["+array[i]+"] ");
        }
        System.out.print(" ");
        System.out.print("\n");  
    }

    public static void LlenadoArray(int array[]){
        Scanner entrada1 = new Scanner(System.in);
        for(int i=0; i<array.length;i++){
            System.out.print("Ingrese un numero: ");
            array[i]= entrada1.nextInt();
        }
    }
}
import java.util.Scanner;

public class Ejercicio07{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int array[] = new int [10];
        LlenadoArray(array);

        System.out.println("El contenido del array es: ");
        for(int i=0; i<array.length; i++){
            System.out.print("["+array[i]+"] ");
        }
        System.out.print(" ");
        System.out.print("\n");
    }

    public static void LlenadoArray(int array[]){
        for(int i=0; i<array.length; i++){
            array[i]= (int) (Math.random()*10+1);
        }
    }
}
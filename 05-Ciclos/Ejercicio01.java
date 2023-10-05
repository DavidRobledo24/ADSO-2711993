import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int numeroRandom [] = new int [n];

        System.out.print("Ingrese un numero entre 1 y 6:");
        int n = entrada.nextInt();

        for(int i=0; i<n;i++){
            numeroRandom [i] = (int)Math.random()*10;  
        }
    }
}
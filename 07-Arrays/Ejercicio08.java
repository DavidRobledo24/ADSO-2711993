import java.util.Scanner;

public class Ejercicio08{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = entrada.nextInt();

        int array [] = new int [num];
        
        int pares = 0;
        int impares = 0;

        for(int i=0; i<array.length; i++){
            array[i]= (int) (Math.random()*10+1);

            if(array[i]%2==0){
                pares++;
            }
            else{
                impares++;
            }
        }

        int par [] = new int [pares];
        int impar [] = new int [impares];

        pares =0;
        impares=0;

        for(int i=0; i<array.length; i++){
            
            if(array[i]%2==0){
                par[pares] = array[i];
                pares++;
            }
            else{
                impar[impares] = array[i];
                impares++;
            }
            
        }

        System.out.println("El contenido del array es: ");
        for(int i=0; i<array.length; i++){
            System.out.print("["+array[i]+"] ");
        }
        System.out.print(" ");
        System.out.print("\n");

        System.out.println("Los pares son: ");
        for(int i=0; i<par.length; i++){
            System.out.print("["+par[i]+"] ");
        }
        System.out.print(" ");
        System.out.print("\n");

        System.out.println("Los impares son: ");
        for(int i=0; i<impar.length; i++){
            System.out.print("["+impar[i]+"] ");
        }
        System.out.print(" ");
        System.out.print("\n");
    }
}
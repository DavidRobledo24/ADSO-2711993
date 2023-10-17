import java.util.Scanner;

public class Ejercicio09{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la medida del array: ");
        int n = entrada.nextInt();
        System.out.print("Ingrese la medida del array: ");
        int m = entrada.nextInt();

        int array [] = new int [n];

        for(int j=0; j<array.length; j++){
            array[j]= (int) (Math.random()*10+1);
        }

        int i;
        int numeroBuscado=0;

        for(i=0; i<array.length; i++){
            if(m==array[i]){
               numeroBuscado=i;
               return 1;
            }
            else{
                return -1;
            }
        }
        if(m==array[i]){
                System.out.print("la posicion es: "+i+" dentro del array");
            }
            else{
                System.out.print("-1 no se encontro dentro del array");
            }
    }
}
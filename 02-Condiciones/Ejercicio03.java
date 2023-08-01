import java.util.Scanner;

public class Ejercicio03{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero de la coordenada: ");
        float n1 = entrada.nextFloat();
        System.out.print("Ingrese el segundo numero de la coordenada: ");
        float n2 = entrada.nextFloat();

        if(n1>0 && n2>0){
            System.out.print("Esta coordenada esta en el primer cuadrante");
        }
        else if(n1<0 && n2>0){
            System.out.print("Esta coordenada esta en el segundo cuadrante");
        }
        else if(n1<0 && n2<0){
            System.out.print("Esta coordenada esta en el tecer cuadrante");
        }
        else{
            System.out.print("Esta coordenada esta en el cuarto cuadrante");
        }
    }
}
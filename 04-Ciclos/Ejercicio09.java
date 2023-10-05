import java.util.Scanner;

public class Ejercicio09{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int contador,i,numero;
 
        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();
 
        contador = 0;
 
        for(i = 1; i <= numero; i++)
        {
            if((numero % i) == 0)
            {
                contador++;
            }
        }
 
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}
import java .util.Scanner;

public class Ejercicio06{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();

        if (edad>=18){
            System.out.print("Es mayor de edad, puede votar.");
        }
        else{
            System.out.print("Es menor de edad, no puede votar.");
        }
    }
}
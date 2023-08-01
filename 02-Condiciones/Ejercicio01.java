import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        System.out .print("Ingrese su nombre: ");
        String nombre = entrada2.nextLine();
        System.out.println("Bienvenido "+nombre+" al sistema");
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();

        if (edad >= 18){
            System.out.print("Usted recibe un auxilio de 200000$");
        }
        else{
            System.out.print("Usted recibe un auxilio de 800000$");
        }
    }
}
import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        Scanner entradaText = new Scanner(System.in);

        System.out.print("Ingrese su año de nacimiento: ");
        int age = entrada.nextInt();
        System.out.print("Ingrese el dia y meses de nacimiento: ");
        String mes = entradaText.nextLine();

        if (age >= 2006 && age<=2023){
            System.out.print("Es menor de edad.");
        }
        else if(age >2023){
            System.out.print("Fecha invalida.");
        }
        else{
            System.out.print("Es mayor de edad.");
        }
    }
}
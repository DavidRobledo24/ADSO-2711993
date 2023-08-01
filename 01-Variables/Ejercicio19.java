import java.util.Scanner;

public class Ejercicio19{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        System.out.println("Registro de empleados");
        System.out.print("Ingrese el nombre del empleado: ");
        String nom = entrada2.nextLine();

        System.out.print("Insgre se la edad del empleado: ");
        int edad = entrada.nextInt();

        System.out.print("Ingrese el salario del empleado: ");
        double sal = entrada.nextDouble();

        System.out.println("La informacion del empleado es: ");
        System.out.print("Su nombre es: "+nom+" \n");
        System.out.print("Su edad es: "+edad+" \n");
        System.out.print("Su salario es: "+sal+" \n");
    }
}
import java.util.Scanner;

public class Ejercicio06{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int n1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = entrada.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int n3 = entrada.nextInt();

        int mayor = obtenerMayor(n1, n2, n3);

        System.out.println(" ");
        System.out.println("El mayor de los numero es: "+mayor);
    }   
    public static int obtenerMayor(int n1, int n2, int n3){
        if(n1>=n2 && n1>=n3){
            return n1;
        }
        if(n2>=n1 && n2>=n3){
            return n2;
        }
        return n3;
    }
}
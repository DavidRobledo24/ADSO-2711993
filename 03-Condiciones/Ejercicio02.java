import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int n1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = entrada.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int n3 = entrada.nextInt();
        System.out.print("Ingrese el cuarto numero: ");
        int n4 = entrada.nextInt();

        if(n1>n2 && n1>n3){
            if(n1>n4){
                System.out.print(n1+" Es el mayor");
            }
        }
        else if(n2>n1 && n2>n3){
            if (n2>n4){
                System.out.print(n2+" Es el mayor");
            }
        }
        else if(n3>n1 && n3>n2){
            if(n3>n4){
                System.out.print(n3+" Es el mayor");
            }
        }
        else{
            System.out.print(n4+" Es el mayor");
        }
    }
}
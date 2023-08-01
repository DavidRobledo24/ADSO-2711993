import java.util.Scanner;

public  class Ejercicio05{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insgrese el primer numero: ");
        int n1 = entrada.nextInt();
        System.out.print("Insgrese el segundo numero: ");
        int n2 = entrada.nextInt();
        System.out.print("Insgrese el tercer numero: ");
        int n3 = entrada.nextInt();

        if(n1 < n2 && n1 < n3){
            if(n2 < n3){
            System.out.println("Se ingrese en orden ascendente"); 
                }
                else{
                    System.out.println("No estan orden ascendente");
                }               
        }
    }
}
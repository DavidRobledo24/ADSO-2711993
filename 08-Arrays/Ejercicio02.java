import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = entrada.nextInt();

        String palabra [] = new String [num];

        for(int i=0; i<palabra.length; i++){
        System.out.print("Ingrese una palabra: ");
        String pal = entrada2.nextLine();
            palabra[i] = pal;
        }

        System.out.print("El contenido del array es: ");
        for(int i=0; i<palabra.length; i++){
            System.out.print("["+palabra[i]+"] ");
        }
        System.out.println(" ");

        System.out.print("Ingrese una palabra a encontar: ");
        String pal2 = entrada2.nextLine();

        for(int i=0; i<palabra.length;i++){
            if(pal2.equals(palabra[i])){
                System.out.print(i+1);
            }
        }
        System.out.println(" ");
    }
}
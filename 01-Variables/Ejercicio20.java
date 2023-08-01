import java.util.Scanner;

public class Ejercicio20{
    public static void main(String[]args){
    
        Scanner entrada = new Scanner(System.in);

        String num;

        System.out.print("Ingrese un numero de 5 digitos: ");
        num = entrada.nextLine();

        int n1 = num.charAt(0)-48;
        int n2 = num.charAt(1)-48;
        int n3 = num.charAt(2)-48;
        int n4 = num.charAt(3)-48;
        int n5 = num.charAt(4)-48;

        int suma = n1+n2+n3+n4+n5;
        System.out.print(n1+"+"+n2+"+"+n3+"+"+n4+"+"+n5+"="+suma);
    }
}
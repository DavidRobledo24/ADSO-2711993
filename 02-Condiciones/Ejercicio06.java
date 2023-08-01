import java.util.Scanner;

public class Ejercicio06{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        System.out .print("Ingrese un numero de 6 digitos: ");
        String num = entrada2.nextLine();

        System.out.println("|---------------------------------------------------------------|");
        System.out.println("MENU:");
        System.out.println("1. Primer Digito. "+"2. segundo Digito. "+"3. tecer Digito. ");
        System.out.println("4. cuarto Digito. "+"5. quinto Digito.  "+"6. sexto Digito.  ");
        System.out.println("|---------------------------------------------------------------|");

        System.out.print("Ingrese una opcion: ");
        int op = entrada.nextInt();

        if(op == 1){
            int dig = num.charAt(0)-48;
            System.out.print("El Primer Digito es: "+dig);
        }
        if(op == 2){
            int dig = num.charAt(1)-48;
            System.out.print("El segundo Digito es: "+dig);
        }
        if(op == 3){
            int dig = num.charAt(2)-48;
            System.out.print("El tercer Digito es: "+dig);
        }
        if(op == 4){
            int dig = num.charAt(3)-48;
            System.out.print("El cuarto Digito es: "+dig);
        }
        if(op == 5){
            int dig = num.charAt(4)-48;
            System.out.print("El quinto Digito es: "+dig);
        }
        if(op == 6){
            int dig = num.charAt(5)-48;
            System.out.print("El sexto Digito es: "+dig);
        }
    }
}
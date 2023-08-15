import java.util.Scanner;

public class esVocal{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        char vocal = entrada.nextLine().charAt(0);

        if(esVocalMethod(vocal)){
            System.out.print("Es Vocal");
        }
        else{
            System.out.print("No es Vocal");
        } 
    }

    public static boolean esVocalMethod(char vocal){
        return vocal == 'a' || vocal == 'e' ||vocal == 'i' ||vocal == 'o' ||vocal == 'u';
    }
}
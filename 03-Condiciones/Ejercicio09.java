import java.util.Scanner;

public class Ejercicio09{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        float totaladic=0;
        float adic=0;
        float hextra=0;

        System.out.print("Ingrese el numero de horas trabajadas: ");
        float horas = entrada.nextFloat();
        System.out.print("Ingrese la tarifa por hora: ");
        float tarifa = entrada.nextFloat();

        float total = horas*tarifa;

        if (horas>40){
            hextra = horas-40;
            totaladic=((hextra*tarifa)*50)/100;
            System.out.print("El valor neto a pagar es: "+total+" y el adicional por horas extra es de: "+hextra);
        }
        else{
            System.out.print("El valor neto a pagar es de: "+total);
        }
    }
}
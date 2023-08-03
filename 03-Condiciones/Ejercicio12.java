import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        float valor = entrada.nextFloat();
        System.out.print("Ingrese el porcentaje de descuento: ");
        float descu = entrada.nextFloat();

        if(descu>0 && descu <=100){
            float totalDescu = (valor*descu)/100;
            float total = valor - totalDescu; 
            System.out.print("El total del descuento es: "+totalDescu+" El valor a pagar es: "+total);
        }
        else{
            System.out.print("El valor del descuento es incorrecto.");
        }
    }
}
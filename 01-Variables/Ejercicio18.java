import java.util.Scanner;

public class Ejercicio18{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Calculadora del imc");
        System.out.print("Ingrese su altura: ");
        float h = teclado.nextFloat();

        System.out.print("Insgrese su peso: ");
        float w = teclado.nextFloat();

        float imc = w / (h*h);

        /*if (imc < 18.5){
            System.out.print("Su IMC o indice de masa corporal es: "+imc+" usted se encuentra en Bajo");
        }else if(imc >= 18.5){
            System.out.print("Su IMC o indice de masa corporal es: "+imc+" usted se encuentra en Normal");
        }else if(imc > 25){
            System.out.print("Su IMC o indice de masa corporal es: "+imc+" usted se encuentra es Sobre peso");   
        }else if(imc > 30){
            System.out.print("Su IMC o indice de masa corporal es: "+imc+ " usted se encuentra en Obesidad");
        }*/
        System.out.print("Su IMC o indice de masa corporal es: "+imc+ " usted se encuentra en Obesidad");
    }
}
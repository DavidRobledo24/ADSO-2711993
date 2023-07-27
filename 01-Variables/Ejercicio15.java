import java.util.Scanner;

public class Ejercicio15{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de METROS: ");
        float met = entrada.nextFloat();

        float cent= met*100;
        double pulg = met*39.37;
        double pies = met*3.281;

        System.out.print("La convercion a Centenmetros es de: "+cent+". En Pulgadas es: "+pulg+". En pies es: "+pies);
    }
}
import java.util.Scanner;

public class Ejercicio04{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int mayor =0;
        int menor =0;

        System.out.print("Insgrese el primer numero: ");
        int n1 = entrada.nextInt();
        System.out.print("Insgrese el segundo numero: ");
        int n2 = entrada.nextInt();
        System.out.print("Insgrese el tercer numero: ");
        int n3 = entrada.nextInt();

        if(n1 > n2 && n1 > n3){
            mayor= n1;
            if(n2 > n3){
            menor = n3;
                }else{
                    menor = n3;
                }
            System.out.println("El numero mayor es: " + mayor +" El numero menor es: " + menor);            
        }
        if(n2 > n1 && n2 > n3){
            mayor= n2;
            if(n1 > n3){
            menor = n3;
                }else{
                    menor = n1;
                }
            System.out.println("El numero mayor es: " + mayor +" El numero menor es: " + menor);            
        }
        if(n3 > n1 && n3 > n2){
            mayor= n3;
            if(n2 > n1){
            menor = n1;
                }else{
                    menor = n2;
                }
            System.out.println("El numero mayor es: " + mayor +" El numero menor es: " + menor);            
        }
    }
}

/*n1>n2 n1>n3*/
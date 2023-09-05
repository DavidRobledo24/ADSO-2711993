import java.util.Scanner;

public class Ejemplo14{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        float num=0;
        float menor =0;
        int pos= 0;

        System.out.println("Ingrese dos numeros.");
        int n = entrada.nextInt();
        float m = entrada.nextFloat();

        float arreglo[]=new float[n];

        for(int i=0; i<arreglo.length; i++){
            arreglo[i] = (float)(Math.random() * 10) + 1;
        }

        System.out.print("El contenido del array es: ");
        for(int i=0; i<arreglo.length; i++){
            System.out.print("["+arreglo[i]+"] ");
        }
        System.out.print(" ");

        if(m>=arreglo[0]){
            menor = arreglo[0]-m;
        }
        else if(m<=arreglo[0]){
            menor= m-arreglo[0];
        }

        for(int i=0; i<arreglo.length;i++){
            if(m>=arreglo[i]){
                num = arreglo[i]-m;
            }
            else if(m<=arreglo[i]){
                num = m-arreglo[i];
            }

            if(menor<num){
                menor = num;
                pos= i;
            }
        }
        System.out.print("el numero mas cercano a M es: "+arreglo[pos]);
    }
}
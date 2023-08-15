import java.util.Scanner;

public class Ejercicio04{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas: ");
        int nFila = entrada.nextInt();
        int n = 1;
        if(nFila > 0){
            for(int i = 1; i <= nFila; i++){
                for(int j = 1; j <= nFila; j++){
                    
                    System.out.print(n+" ");
                    
                    if(j != nFila){
                        n++;
                        if(n > nFila){
                            n = 1;
                        }
                    }
                    
                }
                System.out.print("\n");
            }
        }
        else{
            System.out.print("Error, numero invalido");
        }
    }
}
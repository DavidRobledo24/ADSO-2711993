import java.util.Scanner;

public class Ejercicio05{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int n1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = entrada.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int n3 = entrada.nextInt();

        boolean mcm = false;
        int c1=1;
        int c2=1;
        int c3=1;
        int r1=n1;
        int r2=n2;
        int r3=n3;

        while(mcm == false){
            while(r1<=r2 && r1<=r3){
                r1 = n1*c1;
                c1++;
                if(r1==r2 && r1==r3){
                    mcm=true;
                    break;
                
            }
            if(mcm == true) break;
            

            while(r2<=r1 && r2<=r3){
                r2 = n2*c2;
                c2++;
                if(r1==r2 && r1==r3){
                    mcm=true;
                    break;
                }
            }
            if(mcm == true) break;

            while(r3<=r1 && r3<=r2){
                r3 = n3*c3;
                c3++;
                if(r1==r2 && r1==r3){
                    mcm=true;
                    break;
                }
            }
            if(mcm == true) break;
        } 
        System.out.print("\n");
        System.out.print("El mcm es: "+r1);
    }
}
}
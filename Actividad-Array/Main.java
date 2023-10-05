import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        int cont = 0;
        String nombre;
        int edad;
        double altura;
        double peso;
        boolean valido= true;
        
        Persona listado [] = new Persona [10];

        while(true){
            System.out.println("------------------------");
            System.out.println("-        OPCIONES      -");
            System.out.println("-1. Crear Persona      -");
            System.out.println("-2. Ver Lista Personas -");
            System.out.println("-3. Salir              -");
            System.out.println("------------------------");
            System.out.print("ingrese la opcion: ");
            int opc = entrada.nextInt();

            if(opc == 1){
                System.out.print("Ingrese la cedula de la persona: ");
                int cedula = entrada.nextInt();
                for(int i=0; listado[i]!=null;i++){
                    if(cedula==listado[i].getCedula()){
                        valido = false;
                        System.out.println("cedula duplicada."); 
                        break;
                    }
                }
                
                if(valido==true){
                    System.out.print("Ingrese el nombre se la persona: ");
                    nombre = entrada2.nextLine();
                    System.out.print("Ingrese la edad de la persona: ");
                    edad = entrada.nextInt();
                    System.out.print("Ingrese la altura de la persona: ");
                    altura = entrada.nextDouble();
                    System.out.print("Ingrese el peso de la persona: ");
                    peso = entrada.nextDouble();
                    
                    listado[cont] = new Persona(cedula, nombre, edad, altura, peso);
                    cont++;    
                }
                else valido = true;
            }
            if(opc == 2){
                for(int i=0; listado[i]!=null; i++){
                    System.out.println(" ");
                    System.out.println("Datos de la persona: "+(i+1));
                    System.out.println(listado[i].toString());    
                }
            }
            if(opc == 3){
                System.out.print("Ingrese la cedula de la persona que quiere modificar. ");
                int cedula = entrada.nextInt();

                for(int i=0; listado[i]!=null;i++){
                    if(cedula==listado[i].getCedula){
                        
                    }
                }
            }
        }
    }
}
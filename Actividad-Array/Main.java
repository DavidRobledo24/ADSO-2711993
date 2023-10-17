import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        int contPos = 0;
        String nombre;
        int edad;
        double altura;
        double peso;
        boolean valido= true;
        boolean validoEdit= true;
        double personaALta;
        double personaBaja;
        double personaPesada;
        double personaLiviana;
        String nombrePersonaAlta ="";
        String nombrePersonaBaja ="";
        String nombrePersonaPesada ="";
        String nombrePersonaLiviana ="";
        int sumaAltura=0;
        int sumaPeso=0;
        double promAltura=0;
        double promPeso=0;
        
        Persona listado [] = new Persona [10];

        while(true){
            System.out.println("---------------------------");
            System.out.println("-         OPCIONES        -");
            System.out.println("-1. Crear Persona         -");
            System.out.println("-2. Ver Lista Personas    -");
            System.out.println("-3. Editar Persona        -");
            System.out.println("-4. Eliminar Persona      -");
            System.out.println("-5. Persona mas Alta      -");
            System.out.println("-6. Persona mas Baja      -");
            System.out.println("-7. Persona mas Pesanda   -");
            System.out.println("-8. Persona menos Pesanda -");
            System.out.println("-9 Promedio Altura        -");
            System.out.println("-10. Promedio Peso        -");
            System.out.println("-11. Salir                -");
            System.out.println("---------------------------");
            System.out.print("ingrese la opcion: ");
            int opc = entrada.nextInt();

            if(opc == 1){
                System.out.print("Ingrese la cedula de la persona: ");
                int cedula = entrada.nextInt();
                for(int i=0; i!=contPos;i++){
                    if(cedula==listado[i].getCedula()){
                        valido = false;
                        System.out.println("cedula duplicada.\n"); 
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
                    
                    listado[contPos] = new Persona(cedula, nombre, edad, altura, peso);
                    contPos+=1;    
                }
                else valido = true;
            }
            else if(opc == 2){
                for(int i=0; i<listado.length && listado[i]!=null; i++){
                    System.out.println(" ");
                    System.out.println("Datos de la persona: "+(i+1));
                    System.out.println(listado[i].toString());    
                }
            }
            else if(opc == 3){
                System.out.print("Ingrese la cedula de la persona que quiere modificar. ");
                int cedulaEdit = entrada.nextInt();

                for(int i=0; i<listado.length && listado[i] != null; i++){
                    if(cedulaEdit==listado[i].getCedula()){
                        contPos = i;
                        validoEdit = false; 
                    }

                    if(validoEdit==false){
                        System.out.println("Que dato quiere cambiar: ");
                        System.out.println("1. para Cedula.");
                        System.out.println("2. para Nombres.");
                        System.out.println("3. para Edad.");
                        System.out.println("4. para altura.");
                        System.out.println("5. para peso.");
                        int opcEdit = entrada.nextInt();

                        if(opcEdit == 1){
                            System.out.println("Ingrese la nueva cedula.");
                            listado[i].setCedula(entrada.nextInt());
                        }
                        else if(opcEdit == 2){
                            System.out.println("Ingrese el nuevo nombre de la persona.");
                            listado[i].setNombres(entrada2.nextLine());
                        }
                        else if(opcEdit == 3){
                            System.out.println("Ingrese la nueva edad de la persona.");
                            listado[i].setEdad(entrada.nextInt());
                        }
                        else if(opcEdit == 4){
                            System.out.println("Ingrese la nueva altura de la persona.");
                            listado[i].setAltura(entrada.nextDouble());
                        }
                        else if(opcEdit == 5){
                            System.out.println("Ingrese el nuevo peso de la persona.");
                            listado[i].setPeso(entrada.nextDouble());
                        }
                        else{
                            System.out.print("La cedula no se encontro.");
                            validoEdit = true;
                        } 
                        break;             
                    }
                }
            }
            else if(opc == 4){
                System.out.print("Ingrese la cedula de la persona que desea eliminar.");
                int cedulaDelet = entrada.nextInt();

                for(int i=0; i!=contPos && listado[i]!= null;i++){
                    if(listado[i].getCedula() == cedulaDelet){
                        for(; listado[i] != null;i++){
                            listado[i] = listado[i+1];
                        }
                        contPos--;
                        System.out.println("Se elimino la persona.");
                        break;
                    }
                }
            }
            else if(opc == 5){
                personaALta=listado[0].getAltura();
                nombrePersonaAlta=listado[0].getNombres();
                for(int i=0;i<contPos;i++){
                    if(listado[i].getAltura()>personaALta){
                        personaALta=listado[i].getAltura();
                        nombrePersonaAlta=listado[i].getNombres();
                    }
                }
                System.out.println("---------------------------");
                System.out.println("La persona mas alta es:");
                System.out.println("--"+nombrePersonaAlta+"->"+personaALta+"--");
                System.out.println("---------------------------");
            }
            else if(opc == 6){
                personaBaja=listado[0].getAltura();
                nombrePersonaBaja=listado[0].getNombres();
                for(int i=0; i<contPos;i++){
                    if(listado[i].getAltura()<personaBaja){
                       personaBaja=listado[i].getAltura();
                        nombrePersonaBaja=listado[i].getNombres(); 
                    }
                }
                System.out.println("---------------------------");
                System.out.println("La persona mas baja es:");
                System.out.println("--"+nombrePersonaBaja+"->"+personaBaja+"--");
                System.out.println("---------------------------");
            }
            else if(opc == 7){
                personaPesada=listado[0].getPeso();
                nombrePersonaPesada=listado[0].getNombres();
                for(int i=0;i!=contPos && listado[i]!= null;i++){
                    if(listado[i].getPeso()>personaPesada){
                       personaPesada=listado[i].getPeso();
                        nombrePersonaPesada=listado[i].getNombres(); 
                    }
                }
                System.out.println("---------------------------");
                System.out.println("La persona mas pesada es:");
                System.out.println("--"+nombrePersonaPesada+"->"+personaPesada+"--");
                System.out.println("---------------------------");
            }
            else if(opc == 8){
                personaLiviana=listado[0].getPeso();
                nombrePersonaLiviana=listado[0].getNombres();
                for(int i=0;i!=contPos && listado[i]!= null;i++){
                    if(listado[i].getPeso()<personaLiviana){
                       personaLiviana=listado[i].getPeso();
                        nombrePersonaLiviana=listado[i].getNombres(); 
                    }
                }
                System.out.println("---------------------------");
                System.out.println("La persona mas liviana es:");
                System.out.println("--"+nombrePersonaLiviana+"->"+personaLiviana+"--");
                System.out.println("---------------------------");
            }
            else if(opc == 9){
                for(int i=0;i<contPos;i++){
                    sumaAltura+=listado[i].getAltura();
                    promAltura=sumaAltura/contPos;
                }
                System.out.println("---------------------------");
                System.out.println("El promedio de altura es:");
                System.out.println("->"+promAltura+"--");
                System.out.println("---------------------------");
            }
            else if(opc == 10){
                for(int i=0;i<contPos;i++){
                    sumaPeso+=listado[i].getPeso();
                    promPeso=sumaPeso/contPos;
                }
                System.out.println("---------------------------");
                System.out.println("El promedio de los pesos es:");
                System.out.println("->"+promPeso+"--");
                System.out.println("---------------------------");
            }
            else if(opc == 11){
                System.out.println("Get out of here.");
                break;
            }
            else{
                System.out.println("Opcion invalidad, intente de nuevo. Try again.");
            }

        }
    }
}
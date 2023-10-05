public class Principal{
    public static void main(String[]args){

        Persona pe01 = new Persona(1010105189, "David Robledo" , 23, 175, 67);

        Persona listado [] = new Persona [10];
        listado[0] = new Persona (1010105189, "David Robledo", 23, 175, 67);
        listado[1] = new Persona (15252525, "Carolina Robledo", 19, 164, 62);
        listado[2] = new Persona (1025262, "Fernando Robledo", 54, 178, 75);
        listado[3] = new Persona (23524647, "Martha Acevedo", 52, 165, 67);
   
        for(int i=0; i<listado.length; i++){

            if(listado[i] != null){
                System.out.println(" ");
                System.out.println("=> "+i+": "+listado[i].getCedula()+" - "+listado[i].getNombres());
                System.out.println(" ");
            }
        }
    }
}


/*for(int i=0; i<1; i++){
            System.out.print("Ingrese la cedula.");
            listado[i]= entrada.nextInt();
            System.out.print("Ingrese el nombre.");
            listado[i]= entrada2.nextLine();
            System.out.print("Ingrese la edad.");
            listado[i]= entrada.nextInt();
            System.out.print("Ingrese la altura.");
            listado[i]= entrada.nextDouble();
            System.out.print("Ingrese el peso.");
            listado[i]= entrada.nextDouble();
        }*/






/*System.out.println(" ");
        System.out.println(pe01.toString());*/
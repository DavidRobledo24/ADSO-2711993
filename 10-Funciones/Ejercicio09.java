public class Ejercicio09{
    public static void main(String[]args){
        
        int array[]=new int [10];
        LlenadoArray(array);
        int menor=Menor(array);

        System.out.println("El contenido del array es: ");
        for(int i=0; i<array.length; i++){
            System.out.print("["+array[i]+"] ");
        }
        System.out.print(" ");
        System.out.print("\n");
        System.out.println("El numero menor es: "+menor);
    }
    public static void LlenadoArray(int[] array){
        for(int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*10+1);
        }
    }
    public static int Menor(int array[]){
        int menor=11;

        for(int i=0;i<array.length;i++){
            if(menor>array[i]){
                menor=array[i];
            }
        }
        return menor;
    }
}
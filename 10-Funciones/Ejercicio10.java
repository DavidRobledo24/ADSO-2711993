public class Ejercicio10{
    public static void main(String[]args){
        
        //crear array con contenido
        int array[] = {2,4,7,4,1,6,4,5,5,2};

        System.out.print("El promedio del array es: "+Promedio(array));
    }
    public static int Promedio(int[] array){
        int suma=0;
        int prom=0;
        for(int i=0;i<10;i++){
            suma+=array[i];
            prom=suma/10;
        }
        return prom;
    }
}
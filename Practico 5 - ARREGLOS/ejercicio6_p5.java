//Hacer un programa que dado un arreglo de enteros de tamaño 10
//que se encuentra cargado, obtenga la cantidad de números pares
//que tiene y la imprima.

public class ejercicio6_p5{
    public static final int MAX = 10;
    public static void main (String[]args){
        int[]arr = {5,6,32,77,88,101,23,55,1000,3};
        int cantidad = cantidadDePares(arr);
    }
    public static int cantidadDePares(int[]arr){
        int sumatoria = 0;
        for(int pos = 0; pos<=MAX; pos++){
            if(arr[pos] % 2 == 0){
                sumatoria = sumatoria++;
            }
            
        }
        return sumatoria;
    }

}
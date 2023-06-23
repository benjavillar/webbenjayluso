//Hacer un programa que dado un arreglo ya cargado con 10
//enteros, calcule el promedio y lo muestre por la consola.

public class ejercicio222 {
    public static final int MAX = 10;

    public static void main(String[] args) {
        int[]arr = {5,4,7,0,2,1,5,7,9,3};
        double promedio = calcularPromedio(arr);
        System.out.println("El promedio es: "+ promedio);
    }
    public static double calcularPromedio(int[]arr){
       int resultado = 0;
       for(int pos = 0; pos<MAX; pos++){
           resultado += arr[pos];
       }
       return resultado/MAX;
    }
}

//Con el mismo arreglo del ejercicio anterior informe por pantalla
//cuantos elementos del mismo están por encima del promedio
//calculado.

public class ejercicio3_p5 {
    public static final int MAX = 10;

    public static void main(String[] args) {
        int[]arr = {5,4,7,0,2,1,5,7,9,3};
        double promedio = calcularPromedio(arr);
        System.out.println(promedio);
        mayorPromedio(arr, promedio);

    }
    public static double calcularPromedio(int[]arr){
        int resultado = 0;
        for(int pos = 0; pos<MAX; pos++){
            resultado += arr[pos];

        }
        int promedio= resultado/MAX;
        return promedio;
    }

}



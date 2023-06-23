//1. Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
//de valores entre 1 y 12.

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejercicio1_p5 {
    public static final int MAX = 15;
    public static void main(String[]args){
        int[]arr = new int[MAX];
        cargarArreglo(arr);
        mostrarArreglo(arr);
    }
    public static void cargarArreglo(int[]arr){

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            for(int pos = 0; pos<MAX; pos++) {
                System.out.println("Ingrese numeros entre 1 y 12 para cargar el arreglo");
                arr[pos] = Integer.valueOf(entrada.readLine());
            }
        }
        catch(Exception exc){
            System.out.println("error");
        }
    }

    public static void mostrarArreglo(int[]arr){
        for(int pos = 0; pos<MAX; pos++){
            System.out.println(arr[pos]+ "|");
        }
    }
}


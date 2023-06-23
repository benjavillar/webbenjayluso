//Hacer un programa que dado un arreglo de enteros de tamaño
//10 que se encuentra precargado, solicite al usuario un número
//entero y elimine todas las ocurrencia de número en el arreglo.
//Mientras exista (en cada iteración tiene que buscar la posición
//dentro del arreglo) tendrá que usar la posición para realizar un
//corrimiento a izquierda (quedarán tantas copias de la última
//
//posición del arreglo como cantidad de ocurrencias del número).

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio11_p5 {
    public static final int MAX = 10;

    public static void main(String[] args) {
        int[] arr = {12, 3, 6, 23, 3, 8, 9, 7, 4, 6};
        int entero = obtenerNumero();
        eliminaNumero(arr,entero);
        mostrarArreglo(arr);
    }
    public static int obtenerNumero() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese numero entero");
            numero = Integer.valueOf(entrada.readLine());
        }
        catch (Exception exc) {
            System.out.println("error");
        }
        return numero;
    }

    public static void eliminaNumero(int[]arr, int entero){
        int pos = 0;
        while(pos <MAX){
            if (arr[pos] == entero) {
                //CORRIMIENTO IZQUIERDA
                int i = pos;
                while ( i < MAX-1) {
                    arr[i] = arr[i + 1];
                    i++;
                }
            }
            else{
                pos++;
            }
        }
    }

    public static void mostrarArreglo(int[]arr){
        for(int pos = 0; pos<MAX; pos++){
            System.out.print(arr[pos]+ "|");
        }
    }
}
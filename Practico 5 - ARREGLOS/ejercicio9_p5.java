//Hacer un programa que dado un arreglo de enteros de tamaño 10
//que se encuentra cargado, solicite al usuario un número entero y
//lo agregue al principio del arreglo (posición 0). Para ello tendrá
//que realizar un corrimiento a derecha (se pierde el último valor del
//arreglo) y colocar el número en el arreglo en la posición indicada.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio9_p5 {
    public static final int MAX = 10;

    public static void main(String[] args) {
        int[] arr = {12, 3, 6, 23, 3, 8, 9, 7, 4, 6};
        int entero = obtenerNumero();
        corrimientoDerecha(arr, entero);

        mostrarArreglo(arr);
    }

    public static int obtenerNumero() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese numero entero");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println("error");
        }
        return numero;
    }

    public static void corrimientoDerecha(int[] arr, int entero) {
        for (int pos = MAX-1 ; pos > 0; pos--) {
            arr[pos] = arr[pos - 1];
        }
        arr[0] = entero;
    }
    public static void mostrarArreglo(int[]arr){
        for(int pos = 0; pos<MAX; pos++){
            System.out.print(arr[pos]+ "|");
        }
    }
}

//Hacer un programa que dado un número N ingresado por el
//usuario, elimine las secuencias de tamaño N de números distintos
//de cero.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio19_p5 {
    public static final int MAX = 20;

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 0, 4, 5, 6, 0, 7, 8, 9, 0, 10, 11, 12, 0, 13, 14, 0};
        int ini = 0;
        int fin = -1;
        int num = obtenerNumero();
        while (ini < MAX) {
            ini = buscarInicio(arr, fin + 1);
            if (ini < MAX) {
                fin = buscarFin(arr, ini);
            }
            int tamano = (fin - ini) + 1;
            if (tamano == num) {
                corrimientoIzquierda(arr, ini, fin);
                fin=0;
            }
            mostrarArreglo(arr);
        }
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

    public static int buscarInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }


    public static void corrimientoIzquierda(int[] arr, int ini, int fin) {
        for (int i = ini + 1; i <= fin; i++) {
            arr[i - 1] = arr[i];
        }
    }

    public static void mostrarArreglo(int[] arr) {
        for (int pos = 0; pos < MAX - 1; pos++) {
            System.out.print(arr[pos] + "|");
        }
    }
}

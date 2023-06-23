//Se tiene un arreglo de enteros de tamaño 20 de secuencias de
//números entre 1 y 9, separadas por 0. El arreglo está precargado,
//y además empieza y termina con uno o más separadores 0. Hacer
//un programa que permita obtener a través de métodos la posición
//de inicio y la posición de fin de la secuencia ubicada a partir de
//una posición entera ingresada por el usuario. Finalmente, si
//existen imprima por pantalla ambas posiciones obtenidas.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio24_p5 {
    public static final int MAX=20;

    public static void main(String[] args) {
        int[]arr = {0,5,4,6,0,7,8,0,9,4,9,0,3,2,3,0,1,1,1,0};
        int posicion = obtenerNumero();
        while(arr[posicion]!= 0) {
            posicion++;
        }
        posicion = posicion +1;
        int ini = posicion;
        int fin = posicion-1;
        ini = obtenerIni(arr, fin+1);
        fin = obtenerFin(arr, ini);
        System.out.println("El inicio es: "+ ini + " y el fin es: " + fin);
    }

    public static int obtenerNumero(){
        int validacion = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese numero");
            validacion =Integer.valueOf(entrada.readLine());
        }
        catch (Exception exc){
            System.out.println("error");
        }
        return validacion;
    }

    public static int obtenerIni(int[]arr, int pos){

        while(pos<MAX && arr[pos]==0){
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int[]arr, int pos){
        while(pos<MAX && arr[pos]!=0){
            pos++;
        }
        return pos-1;
    }

}



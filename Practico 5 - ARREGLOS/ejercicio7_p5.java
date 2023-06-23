
//CORRIMIENTOS
//7. Implementar un método que realice un corrimiento a derecha en
//un arreglo ordenado de tamaño MAX=10 a partir de una posición.

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejercicio7_p5{
    public static final int MAX = 10;
    public static void main(String[]args){
        int[]arr = {12,3,6,23,3,8,9,7,4,6};
        int numusuario = obtenerPosicion();
        corrimientoDerecha(arr, numusuario);
        mostrarArreglo(arr);
    }

    public static int obtenerPosicion(){
        int posicion=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese posicion que desea modificar");
            posicion = Integer.valueOf(entrada.readLine());
        }
        catch(Exception exc){
            System.out.println("error");
        }
        return posicion;
    }

    public static void corrimientoDerecha(int[]arr, int numusuario){
        for(int pos = MAX-1; pos>=numusuario; pos--){
            arr[pos] = arr[pos-1];
        }
    }
    public static void mostrarArreglo(int[]arr){
        for(int pos = 0; pos<MAX; pos++){
            System.out.print(arr[pos]+ "|");
        }
    }
}
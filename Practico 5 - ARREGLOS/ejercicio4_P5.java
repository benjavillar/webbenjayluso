//Buscar un elemento en un arreglo de caracteres ya cargado de
//tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
//estar indicarlo también.

import java.io.BufferedReader;
import java.io.InputStreamReader; 

public class ejercicio4_P5{
    public static final int MAX = 10;
    public static void main(String[]args){
        char[]arr = {'a','1','d','%','f','D','4','@','l','0'};
        char elemento = pedirElemento();
        int posicion = buscarElemento(arr, elemento);
        System.out.println("el elemento se encuentra en la posicion:" + posicion);
    }

    public static char pedirElemento() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char caracter = 0;
        try {
            System.out.println("Ingrese un caracter:");
            caracter = entrada.readLine().charAt(0);
        } catch (Exception exc) {
            System.out.println("Error");
        }
        return caracter;
    }


    public static int buscarElemento(char[]arr, char elemento){
        int lugar = -1;
        for(int pos = 0; pos<MAX; pos++){
            if(arr[pos] == elemento){
                lugar = pos ;
            }
           
    }
    return lugar;
}
}

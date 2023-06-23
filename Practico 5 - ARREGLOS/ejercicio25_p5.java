//Hacer un programa que dado el arreglo definido y precargado,
//y un número entero ingresado por el usuario, copie de forma
//continua las secuencias de tamaño igual al número ingresado en
//otro arreglo de iguales características e inicializado con 0. La
//copia en este último arreglo deben comenzar desde el principio
//del mismo.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio25_p5 {
    public static final int MAX_A = 20;
    public static final int MAX_B = 20;

    public static void main(String[] args) {
        int[]arrA = {0,10,2,0,2,8,9,1,0,2,1,1,0,4,5,0,7,8,1,0};
        int[]arrB = new int[MAX_B];
        int numero = obtenerNumero();
        int iniA = 0;
        int finA= -1;
        int posicionB = 0;
            while (iniA < MAX_A) {
                iniA = obtenerIniA(arrA, finA + 1);
                if (iniA < MAX_A) {
                    finA = obtenerFinA(arrA, iniA);
                }
                int tamano = (finA - iniA) + 1;
                if (tamano == numero) {
                    copiarSecuencia(arrA, iniA, finA, arrB, posicionB);
                    posicionB = finA+1;

                }
            }
        mostrarArreglo(arrA);
        System.out.println();
        mostrarArreglo(arrB);


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

    public static int obtenerIniA(int[]arr, int pos){
        while(pos<MAX_A && arr[pos]==0){
            pos++;
        }
        return pos;
    }

    public static int obtenerFinA(int[]arr, int pos){
        while (pos < MAX_A && arr[pos]!=0) {
            pos++;
        }
        return pos-1;
    }

    public static void copiarSecuencia(int[]arrA, int iniA, int finA, int[]arrB, int pos) {
        while ( pos < MAX_B && iniA <= finA) {
                arrB[pos] = arrA[iniA];
                pos++;
                iniA++;
        }
    }

    public static void mostrarArreglo(int[]arr){
        for(int pos=0; pos<MAX_A; pos++){
            System.out.print(arr[pos] + "|");
        }
    }






}

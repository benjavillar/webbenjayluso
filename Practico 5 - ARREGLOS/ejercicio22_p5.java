//Hacer un programa que remplace de un arreglo A todas las
//ocurrencias de una secuencia patrón dada en un arreglo P, por la
//secuencia contenida en el arreglo R de igual tamaño.

public class ejercicio22_p5{
    public static final int MAX_A = 10;
    public static final int MAX_B_C = 3;
    public static void main(String[]args){
        int[]arrA={0,1,2,0,4,5,6,0,1,0};
        int[]arrB={4,5,6};
        int[]arrC={11,23,34};
        int ini_A = 0;  
        int fin_A = -1;
        while(ini_A<MAX_A){
            ini_A = buscarIniA(arrA, fin_A+1);
            if(ini_A < MAX_A){
                buscarFinA(arrA, ini_A);
            }
            int tamano = (fin_A - ini_A ) + 1;
            int concidencias = secuenciaIgual(arrA, ini_A, fin_A, arrB,tamano);
            while(concidencias==3){
                remplazo(arrA, arrC, ini_A, fin_A);
            }
        }
        mostrarArreglo_A(arrA); 
    }

     public static int buscarIniA(int[]arr, int pos){
        while(pos<MAX_A && arr[pos]==0){
            pos++;
        }
        return pos;
    }

    public static int buscarFinA(int[]arr, int pos){
        while (pos < MAX_A && arr[pos]!=0) {
            pos++;
        }
        return pos-1;
    }

    public static int secuenciaIgual(int[]arr_A, int ini_A, int fin_A, int[]arr_B, int tamano){
        int cantidadDeConcidencias = 0;
        int pos = ini_A;
        int i = 0;
        while(tamano == MAX_B_C){
            while( pos <= fin_A && arr_A[pos] == arr_B[i]){
                cantidadDeConcidencias = cantidadDeConcidencias+1;
                pos++;
                i++;
            }
        }
        return cantidadDeConcidencias;
    }

    public static void remplazo(int[]arr_A, int[]arr_C, int ini_A, int fin_A){
        int i = 0;
        for(int pos = ini_A; pos<= fin_A; pos++){
            arr_A[ini_A] = arr_C[i];
            i++;
        }
    }

    public static void mostrarArreglo_A(int[]arr){
        for(int pos=0; pos<MAX_A; pos++){
            System.out.print(arr[pos] + "|");
        }
    }
}

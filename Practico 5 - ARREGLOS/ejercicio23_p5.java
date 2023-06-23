//Hacer un programa que invierta el orden de la última secuencia
//en un arreglo.

public class ejercicio23_p5{
    public static final int MAX = 20;
    public static void main (String[]args){
        int[]arr= {0,1,2,3,0,4,5,0,7,8,9,0,10,12,0,15,16,17,13,0};
        int ini = MAX;
        int fin = MAX-1;
        while(ini>=0){
            ini = obtenerInicio(arr, fin-1);
            System.out.println(ini);
            if(ini>0){
                fin = obtenerFin(arr,ini);
                System.out.println(fin);
            }
            invertirSec(arr, ini, fin);
        }
        mostrarArreglo(arr);
    }

    public static int obtenerInicio(int[]arr, int pos){
        while(pos>0 && arr[pos] == 0){
            pos--;
        }
        return pos;
    }

    public static int obtenerFin(int[]arr, int pos){
        while (pos>=0 && pos!=0){
            pos--;
        }
        return pos+1;
    }

    public static void invertirSec(int[]arr, int ini, int fin){
        for(int pos=ini; pos >= fin; pos--){
            arr[pos] = arr[fin];
            fin++;
        }
    }

    public static void mostrarArreglo(int[]arr){
        for(int pos=0; pos<MAX; pos++){
            System.out.print(arr[pos] + "|");
        }
    }

}
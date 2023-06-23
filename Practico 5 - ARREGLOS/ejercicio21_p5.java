//Hacer un programa que elimine de un arreglo todas las
//secuencias que tienen orden descendente entre sus elementos.

public class ejercicio21_p5{
    public static final int MAX=20;
    public static void main(String[]args){
        int[]arr = {0,4,3,2,1,0,1,2,0,9,8,7,6,0,1,1,0,5,2,0};
        int ini = 0;
        int fin = -1;
        while(ini<MAX){
            ini = buscarInicio(arr, fin+1);
            if(ini<MAX-1){
               fin = buscarFin(arr, ini);
            }
            if(esDescendente(arr,ini,fin)){
                eliminarSecuencia(arr,ini);
                fin=ini-1;
            }  
        }
        mostrarArreglo(arr);
    }

    public static int buscarInicio(int[]arr, int pos){
        while(pos<MAX && arr[pos]==0){
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[]arr, int pos){
        while (pos < MAX && arr[pos]!=0) {
            pos++;
        }
        return pos-1;
    }

    public static boolean esDescendente(int[]arr, int ini, int fin){
        boolean descendente = false;
        int pos = ini;
        while(pos <= fin && arr[pos] > arr[pos+1]){
            pos++;
        }
        if(pos>fin){
            descendente = true;
        }

        return descendente;
    }

    public static void eliminarSecuencia(int[]arr, int ini) {
        while (arr[ini] != 0) {
            for (int pos = ini; pos < MAX - 1; pos++) {
                arr[pos] = arr[pos + 1];
            }
        }
    }

    public static void mostrarArreglo ( int[] arr){
        for (int pos = 0; pos < MAX - 1; pos++) {
            System.out.print(arr[pos] + "|");
        }
    }
}

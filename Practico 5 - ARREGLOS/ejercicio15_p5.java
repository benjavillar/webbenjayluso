//Hacer un programa que devuelva la posición de inicio y fin de la
//primera secuencia de números distinta de ceros.



public class ejercicio15_p5{
    public static final int MAX=20;
    public static void main(String[]args){
        int[]arr_sec = {0,1,2,3,0,4,5,6,0,7,8,9,0,10,11,12,0,13,14,0};
        int ini= 0;
        int fin=-1;
        ini = buscarInicio(arr_sec,fin+1);
        fin = buscarFin(arr_sec, ini);
        System.out.println("El inicio de la secuencia es:" + ini + " y el fin de la secuencia es:" + fin);
    }
    public static int buscarInicio(int[]arr, int pos){
        while(pos<MAX && arr[pos] == 0){
            pos++;
        }
        return pos;
    }
    public static int buscarFin(int[]arr, int pos){
        while(pos<MAX && arr[pos]!=0){
            pos++;
        }
        return pos-1;
    }

}
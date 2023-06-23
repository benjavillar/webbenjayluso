//Hacer un programa que devuelva la posición de inicio y fin de la
//secuencia de números distintos de ceros cuya suma del contenido
//sea mayor.

public class ejercicio16_p5{
    public static final int MAX = 20;
    public static void main(String[]args){
        int [] arr_sec = {0,20,3,20,0,4,5,6,0,7,8,9,0,10,11,12,0,13,14,0};
        int ini = 0;
        int fin = -1;
        int sumaMayor = 0;
        int sumaDeSecuencia = 0;
        int iniMayor = 0;
        int finMayor = 0;
        while(ini<MAX){
            ini = buscarInicio(arr_sec, fin+1);
            if(ini<MAX){
                fin = buscarFin(arr_sec,ini);
            }
            sumaDeSecuencia = sumarSecuencia(arr_sec,ini,fin);
            if(sumaDeSecuencia >= sumaMayor){
                sumaMayor = sumaDeSecuencia;
                iniMayor = ini;
                finMayor = fin;
            }
        }
         System.out.println("El inicio de la secuencia de mayor suma es:" + iniMayor + " y el fin de la secuencia de mayor suma es:" + finMayor);
    
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

    public static int sumarSecuencia(int[]arr, int ini ,int fin){
        int suma = 0;
        for(int pos = ini; pos<= fin; pos++){
            suma += arr[pos];
        }
        return suma;
    }
    
}

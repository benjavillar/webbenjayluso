//Hacer un programa que devuelva la posición de inicio y de fin
//de la secuencia de mayor tamaño.


public class ejercicio18_p5 {
    public static final int MAX = 20;

    public static void main(String[] args) {
        int[]arr ={0,2,2,3,0,4,5,6,0,7,8,9,0,10,11,12,2,13,14,0};
        int ini = 0;
        int fin = -1;
        int tamano = 0;
        int tamanoMayor = 0;
        int finMayor = 0; 
        int iniMayor = 0;
        while(ini<MAX){
            ini = buscarInicio(arr, fin+1);
            if(ini<MAX){
                fin = buscarFin(arr,ini);
            }
            tamano = fin-ini+1;
            if(tamano >= tamanoMayor){
                tamanoMayor = tamano;
                iniMayor = ini;
                finMayor = fin;
            }
        }

    System.out.println("El inicio de la secuencia de mayor tamaño es:" + iniMayor+ " y el fin de la secuencia de mayor tamaño es:" +finMayor);
    
    }

    public static int buscarInicio(int[]arr, int pos){
        while(pos<MAX && arr[pos]==0){
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

     
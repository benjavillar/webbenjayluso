//hacer un programa que devuelva la posicion de inicio y fin de la anteultima secuencia distinta de ceros

//0 123 0 456 0 789 0 10 11 12 0 13 14 0
public class ejercicio17_p5 {
    public static final int MAX = 20;

    public static void main(String[] args) {
        int[]arr ={0,1,2,3,0,4,5,6,0,7,8,9,0,10,11,12,0,13,14,0};
        int ini = MAX-1;
        int fin = MAX;
        int cantidadDeSecuencias = 0;
        while(ini > 0 && cantidadDeSecuencias != 2){
            ini = buscarInicio(arr,fin-1);
            if(ini>0){
                fin = obtenerFin(arr,ini);
            }
            cantidadDeSecuencias++;
        }
        System.out.println("El inicio de la anteultima secuencia es: " + fin + " y el fin de esta misma es: " + ini);
    }
    public static int buscarInicio(int[]arr, int pos){
        while(pos>0 && arr[pos]==0){
            pos--;
        }
        return pos;
    }
    public static int obtenerFin(int[]arr, int pos){
        while(pos>=0 && arr[pos]!=0){
            pos--;
        }
        return pos+1;
    }
}

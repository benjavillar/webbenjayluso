public class ejerciciotipoparcial3 {
    public static final int MAX=21,SEPARADOR=-1,N=2;
    public static void main(String[] args) {
        int[] arrA = {-1, 85, 25, 52, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 57, -1};
        int[] arrPatron = {-1, -1, -1, -1, -1, -1, -1, -1, 23, 34, 55, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        procesarPrograma(arrA, arrPatron);
        //arreglo resultante= -1 |12| 22| 44| -1| 23| 34| 55| -1| 23| 34| 55| -1 |-1| 23| 34| 57| -1| -1| -1| -1|
        imprimir(arrA);
    }

    public static void imprimir(int[]arr){
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " | ");
        }
    }

    public static int obtenerInicSec(int[]arr,int inicio){
        while((inicio<MAX)&&(arr[inicio]==SEPARADOR)){
            inicio++;
        }
        return inicio;
    }

    public static int obtenerFinSec(int[]arr,int inicio){
        while(inicio<MAX && arr[inicio]!=SEPARADOR){
            inicio++;
        }
        return inicio - 1;
    }

    public static void procesarPrograma(int[]arr,int[]arrPatron){
        int inicio=0,fin=-1,contador=0;

        while(inicio<MAX){
            inicio=obtenerInicSec(arr,fin+1);
            if (inicio<MAX){
                fin=obtenerFinSec(arr,inicio);
                if (arrPatronEncontrado(arr,arrPatron,inicio,fin)){
                    contador++;
                    if (contador>N){
                        eliminarSecuencia(arr,inicio,fin);
                        fin=inicio;
                    }
                }else{
                    contador=0;
                }
            }
        }
    }

    public static boolean arrPatronEncontrado(int[]arr,int[]arrPatron,int inicio,int fin){
        int inicP=0,finP=-1;

        while (inicP<MAX){
            inicP=obtenerInicSec(arrPatron,finP+1);
            if (inicP<MAX){
                finP=obtenerFinSec(arrPatron,inicP);
                if (sonIguales(arr,inicio,fin,arrPatron,inicP,finP)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean sonIguales(int[]arr,int inicio,int fin,int[]arrPatron,int inicP,int finP){
        if((fin-inicio+1)==(finP-inicP+1)){
            while ((inicio<=fin)&&(arr[inicio]==arrPatron[inicP])){
                inicio++;
                inicP++;
            }
            return inicio>fin;
        }
        return false;
    }

    public static void eliminarSecuencia(int[]arr,int inicio,int fin){
        for (int i = inicio; i <=fin; i++) {
            corrimientoIzq(arr,inicio);
        }
    }

    public static void corrimientoIzq(int[]arr,int pos){
        while(pos<MAX-1){
            arr[pos]=arr[pos+1];
            pos++;
        }
    }

}


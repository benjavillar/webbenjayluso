public class ejercicioTipoParcial3_p5 {
    public static final int MAX_A=20;
    public static final int MAX_B = 14;
    public static final char separador = '-';
    public static final int min_sec = 1;
    public static final int MAX_SEC = 3;

    public static void main(String[] args) {
        char[]arrA = {'-','h','o','r','n','o','-','y','-','m','a','s','-','f','f','f','f','f','f','-'};
        char[]arrB = {'d','a','r','x','h','a','t','m','g','c','e','r','y','y','f','r','w','j','k','d'};
        int iniA = 0;
        int finA = -1;
        int contadorDeSec = 0;
        while(iniA<MAX_A){
            iniA = buscarInicio(arrA, finA+1);
            if(iniA<MAX_A){
                finA = buscarFin(arrA, iniA);
            }
            contadorDeSec++;
            if ( contadorDeSec <= MAX_SEC){
                int tamano = (finA - iniA) + 1;
                if (tamano % 2 == 0 || tamano % 5 == 0) {
                    eliminarSecuencia(arrA, iniA);
                    finA = iniA - 1;
                } else {
                    reemplazar(arrA, iniA, finA, arrB);
                }
            }

        }

        mostrarArreglo(arrA);
        System.out.println();
        mostrarArreglo(arrB);
        System.out.println();
    }

    public static int buscarInicio(char[]arrA, int pos){
        while(pos< MAX_A && arrA[pos]== separador){
            pos++;
        }
        return pos;
    }

    public static int buscarFin(char[]arrA, int pos){
        while(pos< MAX_A && arrA[pos]!= separador){
            pos++;
        }
        return pos-1;
    }

    public static void eliminarSecuencia(char[]arrA, int iniA) {
        while (arrA[iniA] != separador) {
            for (int pos = iniA; pos < MAX_A - 1; pos++) {
                arrA[pos] = arrA[pos + 1];
            }
        }
    }
    public static void reemplazar(char[]arrA, int iniA, int finA, char[]arrB){
        int pos = iniA;
        int posB = 0;
        while(pos<= finA && arrA[pos]!=separador){
            arrA[pos] = arrB[posB];
            pos++;
            posB++;
        }
    }

    public static void mostrarArreglo(char[]arr){
        for(int pos = 0; pos<MAX_A; pos++){
            System.out.print(arr[pos]+ "|");
        }
    }
}




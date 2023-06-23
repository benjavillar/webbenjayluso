public class ejercicioTipoParcial2 {
    public static final int MAX_A = 21;
    public static final int MAX_B = 21;
    public static final int N = 2;

    public static void main(String[] args) {
        int[]arrA = {-1,12,32,42,-1,23,34,55,-1,23,34,55,-1,23,34,55,-1,23,34,57,-1};
        int[]arrB = {-1,-1,-1,-1,-1,-1,-1,-1,23,34,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int iniA= 0;
        int finA=-1;
        int iniB= 0;
        int finB=-1;
        int cantidad=0;
        iniB = buscarIniB(arrB,finB+1);
        finB = buscarFinB(arrB, iniB);
        while(iniA<MAX_A){
            iniA=buscarIniA(arrA,finA+1);
            if (iniA<MAX_A){
                finA=buscarFinA(arrA,iniA);
            }
            if(sonIguales(arrA,iniA,finA,arrB,iniB,finB)){
                cantidad++;
                if(cantidad>N){
                    eliminarSecuencia(arrA, iniA);
                    finA=iniA-1;
                }
            }
            else{
                cantidad = 0;
            }
        }
        mostrarArreglo(arrA);
    }

    public static int buscarIniB(int[]arrB, int pos){
        while(pos<MAX_B && arrB[pos]==-1){
            pos++;
        }
        return pos;
    }

    public static int buscarFinB(int[]arrB,int pos){
        while(pos<MAX_B && arrB[pos]!=-1){
            pos++;
        }
        return pos-1;
    }

    public static int buscarIniA(int[]arrA, int pos){
        while(pos<MAX_A && arrA[pos]==-1){
            pos++;
        }
        return pos;
    }

    public static int buscarFinA(int[]arrA,int pos){
        while(pos<MAX_A && arrA[pos]!=-1){
            pos++;
        }
        return pos-1;
    }

    public static boolean sonIguales(int[]arrA,int iniA, int finA, int[]arrB, int iniB ,int finB){
        boolean esIgual = false;
        int tamanoA = finA-iniA-1;
        int tamanoB = finB-iniB-1;
        if(tamanoA == tamanoB){
            while(iniA<=finA && arrA[iniA]==arrB[iniB]) {
                iniA++;
                iniB++;
            }
            if(iniA>finA) {
                esIgual = true;
            }
        }
        return esIgual;
    }

    public static void eliminarSecuencia(int[]arrA, int iniA){
        while (arrA[iniA] != -1) {
            for (int pos = iniA; pos < MAX_A-1; pos++) {
                arrA[pos] = arrA[pos + 1];
            }
        }
    }

    public static void mostrarArreglo ( int[] arrA){
        for (int pos = 0; pos < MAX_A-1; pos++) {
            System.out.print(arrA[pos] + "|");
        }
    }

}


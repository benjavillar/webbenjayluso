public class ejerciciotipoParcial1_p5 {
    public static final int MAX_SEC = 18;

    public static void main(String[] args) {
        int[] arrSec = {0, 1, 2, 3, 4, 0, 5, 6, 7, 0, 6, 7, 6, 0, 10, 9, 8, 0};
        int ini = 0;
        int fin = -1;
        int numeroDeSec = 0;
        while (ini < MAX_SEC) {
            ini = buscarInicio(arrSec, fin + 1);
            if (ini < MAX_SEC) {
                fin = buscarFin(arrSec, ini);
            }
            numeroDeSec = numeroDeSec + 1;
            if (numeroDeSec % 2 == 0) {
                if (esAscendente(arrSec, ini, fin)) {
                    sumarUno(arrSec, ini, fin);
                } else if (esDescendente(arrSec, ini, fin)) {
                    restarUno(arrSec, ini, fin);
                }
            } else {
                if (esCapicua(arrSec, ini, fin)) {
                    rellenar(arrSec, ini, fin);
                } else {
                    invertirSecuencia(arrSec, ini, fin);
                }
            }
        }
        mostrarArreglo(arrSec);
    }

    public static int buscarInicio(int[] arr, int pos) {
        while (pos < MAX_SEC && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAX_SEC && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    public static boolean esAscendente(int[] arr, int pos, int fin) {
        boolean ascendente = false;
        while (pos <= fin && arr[pos] < arr[pos + 1]) {
            pos++;
        }
        if (pos >= fin) {
            ascendente = true;
        }
        return ascendente;
    }

    public static boolean esDescendente(int[] arr, int pos, int fin) {
        boolean descendente = false;
        while (pos <= fin && arr[pos] > arr[pos + 1]) {
            pos++;
        }
            if (pos > fin) {
                descendente = true;
            }
            return descendente;
        }

        public static void sumarUno (int[]arr, int ini, int fin){
            for (int pos = ini; pos <= fin; pos++) {
                arr[pos] = arr[pos] + 1;
            }
        }

        public static void restarUno(int[] arr, int ini, int fin){
            for (int pos = ini; pos <= fin; pos++) {
                arr[pos] = arr[pos] - 1;
            }
        }

        public static boolean esCapicua ( int[] arr, int pos, int fin){
            boolean capicua = false;
            while (pos <= fin && arr[pos] == arr[fin]) {
                pos++;
                fin--;
            }
            if (pos > fin) {
                capicua = true;
            }
            return capicua;
        }

        public static void rellenar ( int[] arr, int ini, int fin){
            for (int pos = ini; pos <= fin; pos++) {
                arr[pos] = -1;
            }
        }

        public static void invertirSecuencia ( int[] arr, int ini, int fin){
            for (int pos = ini; pos <= fin; pos++) {
                int temp = arr[pos];
                arr[pos] = arr[fin];
                arr[fin] = temp;
                pos++;
                fin--;
            }
        }

        public static void mostrarArreglo ( int[] arr){
            for (int pos = 0; pos < MAX_SEC; pos++) {
                System.out.print(arr[pos] + "|");
            }
        }
    }




public class ejercicio14_p5{
    public static final int MAX = 10;
    public static void main (String[]args){
        int [] arr = {12,3,6,23,3,8,9,7,4,6};
        eliminaPares(arr);
        mostrarArreglo(arr);
    }

    public static void eliminaPares(int[]arr){
        for(int pos=0; pos<MAX-1;pos++){
            if(arr[pos] % 2 == 0){
                arr[pos] = arr[pos+1];
            }
        }
    }

    public static void mostrarArreglo(int[]arr){
        for(int pos=0; pos<MAX; pos++){
            System.out.print(arr[pos] + "|");
        }
    }
}
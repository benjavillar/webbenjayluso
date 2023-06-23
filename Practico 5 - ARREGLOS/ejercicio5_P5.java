//Hacer un programa que dado un arreglo de caracteres de tamaño
//10 que se encuentra cargado, invierta el orden del contenido. Este
//intercambio no se debe realizar de manera explícita, hay que
//hacer un método que incluya una iteración de intercambio.
 

public class ejercicio5_P5{
    public static final int MAX = 10;
    public static void main(String[]args){
        char[]arr = {'a','1','d','%','f','D','4','@','l','0'};
        iteracionIntercambio(arr);
    }
    public static void iteracionIntercambio(char[]arr){
        for(int pos = MAX; pos >= 0; pos--){
            System.out.println(arr[pos-1]);
        }
    }
}
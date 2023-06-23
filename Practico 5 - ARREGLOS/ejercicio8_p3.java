
//Realizar un programa que dado dos números enteros y un
//carácter, todos ingresados por el usuario, muestre por pantalla el
//resultado de la operación matemática básica considerando el valor
//del carácter. Si ingreso el carácter: ‘a’ la suma, ‘b’ la resta, ‘c’ la
//multiplicación y ‘d’ la división entre ambos números.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio8_p3 {
    public static void main(String[] args) {
        int numero1 = obtenerNumero();
        int numero2 = obtenerNumero();
        char caracter = obtenerCaracter();

        if (caracter == 'a'){
           int suma = sumar(numero1, numero2);
            System.out.println(suma);
        }
        else if(caracter == 'b'){
            int resta = restar(numero1, numero2);
            System.out.println(resta);
        }
        else if(caracter == 'c'){
            int multiplicacion = multiplicar(numero1, numero2);
            System.out.println(multiplicacion);
        }
        else if(caracter == 'd'){
            int division = dividir(numero1, numero2);
            System.out.println(division);
        }
        else{
            System.out.println("El caracter ingresado no es ni a ni b ni c ni d");
        }
    }
    //FIN DEL MAIN
    //ARRANCAN LOS METODOS!!!
    public static int obtenerNumero(){
        int validacion = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese numero");
            validacion =Integer.valueOf(entrada.readLine());
        }
        catch (Exception exc){
            System.out.println("error");
        }
        return validacion;
    }

    public static char obtenerCaracter(){
        char validacion = 'a';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese caracter entre a y d");
            validacion = entrada.readLine().charAt(0);
        }
        catch (Exception exc){
            System.out.println("error");
        }
        return validacion;
    }

    public static int sumar(int numero1, int numero2){
        int resultado = numero1 + numero2;
        return resultado;
    }

    public static int restar(int numero1, int numero2){
        int resultado = numero1 - numero2;
        return resultado;
    }

    public static int multiplicar(int numero1, int numero2){
        int resultado = numero1 * numero2;
        return resultado;
    }

    public static int dividir(int numero1, int numero2){
        int resultado = numero1 / numero2;
        return resultado;
    }

}

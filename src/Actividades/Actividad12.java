package Actividades;

import Actividades.Actividad08;

import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Actividad08.pedirValor("n: ", sc);
        //System.out.println("Resultado: " + fibonacci(n));
        for (int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    static int fibonacci(int n) {
        int resultado = 0;
        if (n == 0 || n == 1)
            resultado = 1;
        else
            resultado = fibonacci(n - 1) + fibonacci(n - 2);
        return resultado;
    }
}

package Actividades;

import Actividades.Actividad08;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte a = Actividad08.pedirValor("a: ", sc);
        byte n = Actividad08.pedirValor("n: ", sc);
        int resultado = 1;

        for (int i = 0; i < n; i++){
            resultado *= a;
        }
        //System.out.println("Resultado: " + resultado);
        System.out.println("Recursivamente: " + potenciaRecursiva(a, n));
    }
    static int potenciaRecursiva(byte a, byte n) {
        int resultado = 1;
        if (n == 0)
            resultado = 1;
        else
            resultado = a * potenciaRecursiva(a, (byte) (n - 1)); // resultado = resultado * potenciaRecursiva(a, (byte) (n - 1)); esto siempre da 1
        return resultado;
    }
}

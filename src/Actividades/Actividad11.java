package Actividades;

import Actividades.Actividad08;

import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Actividad08.pedirValor("a: ", sc);
        int b = Actividad08.pedirValor("b: ", sc);
        System.out.println("Resultado: " + mcd(a, b));
    }
    static int mcd(int a, int b) {
        int resultado = 0;
        if (a >= b)
            resultado = mcd(a - b, b);
        else if (b > a)
           resultado = mcd(a, b - a);
        else if (b == 0)
            resultado = a;
        else if (a == 0)
            resultado = b;
        return resultado;
    }
}

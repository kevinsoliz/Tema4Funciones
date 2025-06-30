package Actividades;

import java.util.Scanner;

public class Actividad04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        byte a = sc.nextByte();
        System.out.println("Introduce un número: ");
        byte b = sc.nextByte();
        System.out.println("Máximo: " + maximo(a, b));
    }
    static byte maximo(byte a, byte b) {
        return a > b ? a : b;
    }
}

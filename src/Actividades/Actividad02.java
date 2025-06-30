package Actividades;

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dosNumeros numeros = getDosNumeros(sc);

        mostrarNumeros(numeros.principio(), numeros.limite());
    }

    private static dosNumeros getDosNumeros(Scanner sc) {
        System.out.println("Introduce un número: ");
        byte principio = sc.nextByte();
        System.out.println("Introduce un número: ");
        byte limite = sc.nextByte();
        dosNumeros numeros = new dosNumeros(principio, limite);
        return numeros;
    }

    private record dosNumeros(byte principio, byte limite) {
    }

    public static void mostrarNumeros(byte principio, byte limite){
        for ( int i = principio; i <= limite; i++){
            System.out.print(i + " ");
        }
    }
}

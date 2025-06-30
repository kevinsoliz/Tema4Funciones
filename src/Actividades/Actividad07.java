package Actividades;

import java.util.Scanner;

public class Actividad07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        //numDivosoresPrimos(sc.nextInt());
        descomponerFactoresPrimos(sc.nextInt());
    }
    static void numDivosoresPrimos(int n){
        int contador = 0;
        for (int i = 2; i <= n/2; i++){
            if ((n % i == 0) && Actividad06.esPrimo(i)){
                contador++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nNúmero de divisores primos: " + contador);
    }
    static void descomponerFactoresPrimos(int n) {
        System.out.print("Factores primos de " + n + ": ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }


}

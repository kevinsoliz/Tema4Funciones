package Practica;

import Actividades.Actividad08;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Valor de a: ");
        int a = sc.nextInt();
        System.out.print("Valor de b: ");
        int b = sc.nextInt();
        System.out.println(sonAmigos(a, b));
        */
        System.out.println("Limite: ");
        int limite = sc.nextInt();
        numerosAmigos(limite);
    }
    static String sonAmigos(int a, int b){
        return (sumaDivisores(a) == b && sumaDivisores(b) == a) ? "Son amigos" : "No son amigos"; // No sé si es and u or.
    }
    static int sumaDivisores(int a){
        int suma = 0;
        for (int i = 1; i < a; i++){
            if(a % i == 0){
                suma += i;
            }
        }
        return suma;
    }

    static void numerosAmigos(int limite){
        for (int i = 1; i <= limite; i++){
            for (int j = 1; j <= limite; j++){
                if(sumaDivisores(i) == j && sumaDivisores(j) == i)
                    System.out.println("Son amigos: " + i + " y " + j);
            }
        }
    }
}

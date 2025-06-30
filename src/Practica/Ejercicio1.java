package Practica;

import Actividades.Actividad08;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        muestraPares(Actividad08.pedirValor("Valor de n: ", sc));
    }
    static void muestraPares(int n){
        for (int i = 2; i <= n; i++){
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}

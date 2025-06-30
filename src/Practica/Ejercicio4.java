package Practica;

import Actividades.Actividad08;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = Actividad08.pedirValor("Cantidad: ", sc);
        int minimo = Actividad08.pedirValor("Minimo: ", sc);
        int maximo = Actividad08.pedirValor("Maximo: ", sc);
        numsAleaotorios(cantidad, minimo, maximo);
    }
    static void numsAleaotorios(int cantidad, int minimo, int maximo){
        for (int i = 0; i < cantidad; i++){
            int aleaotorio = (int)(Math.random() * (maximo - minimo + 1) + minimo); //What da faaaaaaaaccccccccc?!!!!!!!!
            System.out.print(aleaotorio + " ");
        }
    }
}

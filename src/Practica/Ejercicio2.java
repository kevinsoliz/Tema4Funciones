package Practica;

import Actividades.Actividad08;

import java.util.Scanner;

public class Ejercicio2 {
    static final int MINUTOS_DIA = 24 * 60;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora1 = Actividad08.pedirValor("Hora 1: ", sc);
        int minuto1 = Actividad08.pedirValor("Minuto 1: ", sc);
        int hora2 = Actividad08.pedirValor("Hora 2: ", sc);
        int minuto2 = Actividad08.pedirValor("Minuto 2: ", sc);

        System.out.println("Diferencia: " + diferenciaMin(hora1, minuto1, hora2, minuto2) + " minutos.");
        System.out.println("Diferencia: " + diferenciaMinProf(hora1, minuto1, hora2, minuto2) + " minutos.");

    }
    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2){
        int diferencia = 0;
        int totalMinutos1 = hora1 * 60 + minuto1;
        int totalMinutos2 = hora2 * 60 + minuto2;
        if (hora1 < hora2)
            diferencia = totalMinutos2 - totalMinutos1;
        else
            diferencia = MINUTOS_DIA - (totalMinutos1 - totalMinutos2);
        return  diferencia;
    }
    static int diferenciaMinProf(int horas1, int minutos1, int horas2, int minutos2) {
        int diferencia = (horas1*60 + minutos1) - (horas2*60 + minutos2);
        if (diferencia<0) {
            diferencia *= -1;
        }
        return diferencia;
    }

    /*
    El profesor usó la palabra “diferencia” no como “duración transcurrida”, sino como “distancia absoluta entre dos puntos”,
    como si fuera una resta numérica de minutos.
    Ahí está la clave: no estaba pensando en tiempo real, sino en números.
    Tú interpretaste "diferencia entre dos instantes" como intervalo temporal —lo cual tiene muchísimo más sentido en contextos prácticos
    como viajes, trabajo, alarmas, etc.
     */
}

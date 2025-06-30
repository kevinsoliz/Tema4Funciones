import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcion = pedirValor("Introduce la opción: ", sc);
        byte operando1 = pedirValor("Operando 1: ", sc);
        byte operando2 = pedirValor("Operando 2: ", sc);
        System.out.println("Resultado = " + calculadora(opcion, operando1, operando2));
    }

    static double calculadora(byte opcion, byte operando1, byte operando2) {
        short resultado = 0;
        switch (opcion) {
            case 1 -> resultado = (short)(operando1 + operando2);
            case 2 -> resultado = (short)(operando1 - operando2);
            case 3 -> resultado = (short)(operando1 * operando2);
            case 4 -> resultado = operando2 > 0 ? (short)(operando1 / operando2) : 0;
            default -> resultado = 0;
        }
        return resultado;
    }
    public static byte pedirValor(String prompt, Scanner sc){
        byte valor = 0;
        while (true) {
            try {
                System.out.print(prompt);
                valor = sc.nextByte();
                break;
            } catch (InputMismatchException e){
                sc.next();
                System.out.println("Shit!");
            }
        }
        return valor;
    }
}

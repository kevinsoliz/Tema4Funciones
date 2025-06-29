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
        System.out.println("Resultado: " + resultado);
    }
}

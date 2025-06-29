import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Actividad08.pedirValor("a: ", sc);
        int n = Actividad08.pedirValor("n: ", sc);

        for (int i = 0; i < n; i++){
            a *= a;
        }
        System.out.println("Resultado: " + a);
    }
}

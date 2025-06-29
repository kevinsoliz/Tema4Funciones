import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Actividad08.pedirValor("a: ", sc);
        byte n = Actividad08.pedirValor("n: ", sc);

        for (int i = 0; i < n; i++){
            a += a; //Hay un problema aqui, creo la multiplicación no es adecuada, tampoco la suma.
                    //a = 2 y n = 3 p.e. En la primera iteración a vale 4, en la segunda hace 4 * 4, en la tercera hace 16 * 16
                    //Con la suma igual. En la primera iteración a vale 4, en la segunda hace 4 + 4, en la tercera hace 8 + 8
        }
        System.out.println("Resultado: " + a);
    }
}

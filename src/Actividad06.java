import java.util.Scanner;

public class Actividad06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        System.out.println("Es primo: " + esPrimo(sc.nextInt()));
    }
    static boolean esPrimo(int n){
        boolean esPrimo = false;
        if (n != 1){
            if (n == 2)
                esPrimo = true;
            else if (n % 2 == 1)
                esPrimo = true;
        }

        return esPrimo;
    }
}

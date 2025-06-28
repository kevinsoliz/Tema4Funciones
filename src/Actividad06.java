import java.util.Scanner;

public class Actividad06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        System.out.println("Es primo: " + esPrimo(sc.nextInt()));
    }
    static boolean esPrimo(int num) {
        boolean esPrimo = true;
        if (num < 2)
            esPrimo = false;
        for (int i = 2; i < num && esPrimo; i++) { //La única manera en la que esPrimo será false seria
                                                    //solo cuando num se menor que 2, para el resto siempre será true.
            if (num % i == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }

}

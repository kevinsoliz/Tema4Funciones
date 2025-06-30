import java.util.Scanner;

public class Actividad06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        //System.out.println("Es primo: " + esPrimo(sc.nextInt()));
        tomaPrimo(sc.nextInt());
    }
    static boolean esPrimo(int num) {
        boolean esPrimo = true;
        if (num == 2)
            esPrimo = true;
        else if (num < 2 || num % 2 == 0)
                esPrimo = false;
        else {
            for (int i = 3; i <= Math.sqrt(num); i += 2) { //De esta manera te saltas los pares
                if (num % i == 0)
                    esPrimo = false;
            }
        }
        return esPrimo;
    }
    static void tomaPrimo(int limite){
        for (int i = 0; i < limite; i++){
            if (esPrimo(i)){
                System.out.print(i + " ");
            }
        }
    }

}

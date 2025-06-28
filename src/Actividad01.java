import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        eco(sc.nextByte());
    }
    public static void eco(byte veces){
        for (int i = 0; i < veces; i++) {
            System.out.println("Eco...");
        }
    }
}

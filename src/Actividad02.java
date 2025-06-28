import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        byte principio = sc.nextByte();
        System.out.println("Introduce un número: ");
        byte limite = sc.nextByte();

        mostrarNumeros(principio, limite);
    }
    public static void mostrarNumeros(byte principio, byte limite){
        for ( int i = principio; i <= limite; i++){
            System.out.print(i + " ");
        }
    }
}

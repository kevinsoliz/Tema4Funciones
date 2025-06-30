import java.util.Scanner;

public class Actividad05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una vocal:");
        String vocal = sc.next();
        System.out.println("Es vocal: " + esVocal(vocal));
    }
    static boolean esVocal(String vocal){
        boolean esVocal = false;
        if(vocal.equalsIgnoreCase("a")
            || vocal.equalsIgnoreCase("e")
            || vocal.equalsIgnoreCase("i")
            || vocal.equalsIgnoreCase("o")
            || vocal.equalsIgnoreCase("u")){
            esVocal = true;
        }
        return esVocal;
    }
}

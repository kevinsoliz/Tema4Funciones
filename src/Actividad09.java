import java.util.Scanner;

public class Actividad09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = Actividad08.pedirValor("a : ", sc);
        byte b = Actividad08.pedirValor("b : ", sc);
        byte c = Actividad08.pedirValor("c : ", sc);
        System.out.println("Máximo: " + maxTres(a,b,c));
    }
    static byte maxTres(byte a, byte b, byte c){
        byte max = Actividad04.maximo(a, b);
        return Actividad04.maximo(max, c);
    }
}

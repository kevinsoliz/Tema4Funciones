import java.util.Scanner;

public class Actividad03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una opción: 1 para el área y 2 para el volumen.");
        byte opcion = sc.nextByte();
        System.out.print("Introduce el radio: ");
        float radio = sc.nextFloat();
        System.out.print("Introduce la altura: ");
        float altura = sc.nextFloat();

        String mensaje = opcion == 1 ? "El área es: " + areaOVolumen(opcion, radio, altura) : "El volumen es: " + areaOVolumen(opcion, radio, altura);
        System.out.println(mensaje);
    }
    static double areaOVolumen(byte opcion, float radio, float altura) {
        double area = 2 * Math.PI * radio * (altura + radio);
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        return opcion == 1 ? area : volumen;
    }
}

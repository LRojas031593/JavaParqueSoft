package B1;
import java.util.Scanner;

public class MenorDeDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double menor = Math.min(numero1, numero2);

        System.out.println("El menor número es: " + menor);
    }
}

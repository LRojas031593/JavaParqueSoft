package B2;

import java.util.Scanner;

public class NparesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numeroMaximo = scanner.nextInt();

        System.out.println("Los números pares del 1 al "+numeroMaximo+" son:");
        for (int i = 2; i <= numeroMaximo; i += 2) {
            System.out.println(i);
        }

        System.out.println("Los números impares del 1 al "+numeroMaximo+" son:");
        for (int i = 1; i <= numeroMaximo; i += 2) {
            System.out.println(i);
        }
    }
}

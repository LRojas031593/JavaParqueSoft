package B1;
import java.util.Calendar;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su año de nacimiento: ");
        int yearOfBirth = scanner.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - yearOfBirth;

        System.out.println("Su edad es: " + age + " años.");
    }
}

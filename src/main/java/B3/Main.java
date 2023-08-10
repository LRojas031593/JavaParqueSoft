package B3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String user = "pepe";
        final String psw = "123";
        int intentosFallidos = 0;

        System.out.println("****************************");
        System.out.println("Ingrese una opcion del menu");
        System.out.println("****************************");
        System.out.println("1. Ingresar al login");
        System.out.println("2. Comprar boletas");
        System.out.println("3. Vender boletas");
        System.out.println("****************************");

        int menu = scanner.nextInt();

        String opcion;
        switch (menu) {
            case 1:
                while (intentosFallidos < 3) {
                    System.out.println("****************************");
                    opcion = "Ventana de logueo";
                    System.out.println(opcion);
                    System.out.println("****************************");
                    System.out.println("Ingrese su usuario");
                    String useri = scanner.next();
                    System.out.println("****************************");
                    System.out.println("Ingrese su Contraseña");
                    String pwdi = scanner.next();

                    if (useri.equals(user) && pwdi.equals(psw)) {
                        System.out.println("****************************");
                        System.out.println("Login Correcto");
                        System.out.println("****************************");
                        break;
                    } else {
                        intentosFallidos++;
                        System.out.println("****************************");
                        System.out.println("Usuario y/o contraseña incorrectos");
                        System.out.println("Intentos restantes: " + (3 - intentosFallidos));
                        System.out.println("****************************");
                    }
                }

                if (intentosFallidos >= 3) {
                    System.out.println("****************************");
                    System.out.println("Usuario bloqueado. Contacte al administrador.");
                    System.out.println("****************************");
                }
                break;

            case 2:
                opcion = "COmpra de Compras de boletos";
                System.out.println("****************************");
                System.out.println(opcion);
                System.out.println("****************************");
                break;
            case 3:
                opcion = "Ventana de venta de boletos";
                System.out.println("****************************");
                System.out.println(opcion);
                System.out.println("****************************");
                break;
        }

    }
}

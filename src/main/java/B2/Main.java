package B2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nombre=new ArrayList<>();
        nombre.add("Luis");
        nombre.add("Miguel");
        nombre.add("Rojas");

        int[]edades={12,15,22,44};

        for (String name:nombre) {
            System.out.println(name);

        }
        for (int edad:edades) {
            System.out.println(edad);

        }
        for (int i = 0; i <nombre.size() ; i++) {
            //System.out.println(nombre[i]);
        }
        for (int i = 0; i <edades.length ; i++) {
            System.out.println(edades[i]);
        }

    }
}

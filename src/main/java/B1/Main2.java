package B1;

public class Main2 {
    public static void main(String[] args) {
        Boolean esNumerico=null;
        if(esNumerico == null){
            System.out.println("El booleano es util");
        }else if (esNumerico){
            System.out.println("Es Nuemrico");
        }else{
            System.out.println("No Es Nuemrico");

        }
        //If ternario
        int edad=19;
        String mensaje=(edad>=18)? "Mayor edad":"Menor de edad";
        System.out.println(mensaje);


    }
}

package B4;
import javax.swing.JOptionPane;

public class Division{
    public static void main(String[] args) {
        while (true) {
            try {
                String n1 = JOptionPane.showInputDialog("Ingrese el numerador:");
                String n2 = JOptionPane.showInputDialog("Ingrese el denominador:");

                if (n1 == null || n2 == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada. Hasta luego!");
                    break;
                }

                double n1d = Double.parseDouble(n1);
                double n2d = Double.parseDouble(n2);

                if (n2d == 0) {
                    throw new ArithmeticException("No se puede dividir entre cero");
                }

                double resultado = n1d / n2d;

                JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultado);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Debe ingresar valores numéricos.");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    }
}
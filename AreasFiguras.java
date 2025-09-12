import javax.swing.JOptionPane;

public class AreasFiguras {
    public static void main(String[] args) {
        String menu = "Cálculo de Áreas\n\n"
                    + "1. Cuadrado\n"
                    + "2. Rectángulo\n"
                    + "3. Triángulo\n"
                    + "4. Círculo\n"
                    + "Elija una opción (1-4):";

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

        double resultado = 0;
        String mensaje = "";

        switch (opcion) {
            case 1: // Cuadrado
                double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado:"));
                resultado = lado * lado;
                mensaje = "El área del cuadrado es: " + resultado;
                break;

            case 2: // Rectángulo
                double baseR = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectángulo:"));
                double alturaR = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectángulo:"));
                resultado = baseR * alturaR;
                mensaje = "El área del rectángulo es: " + resultado;
                break;

            case 3: // Triángulo
                double baseT = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triángulo:"));
                double alturaT = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triángulo:"));
                resultado = (baseT * alturaT) / 2;
                mensaje = "El área del triángulo es: " + resultado;
                break;

            case 4: // Círculo
                double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo:"));
                resultado = Math.PI * Math.pow(radio, 2);
                mensaje = "El área del círculo es: " + resultado;
                break;

            default:
                mensaje = "Opción no válida. Debe elegir entre 1 y 4.";
        }

        // Mostrar resultado
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

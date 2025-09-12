import javax.swing.JOptionPane;

public class Figuras {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de líneas"));
        String resultado = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                resultado += "*  ";
            }
            resultado += "\n";
        }

        resultado += "\n";

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                resultado += " ";
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                resultado += "*";
            }
            resultado += "\n";
        }

        resultado += "\n";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                resultado += " ";
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                resultado += "*";
            }
            resultado += "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}


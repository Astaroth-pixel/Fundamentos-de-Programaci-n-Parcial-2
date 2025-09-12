import javax.swing.JOptionPane;

public class PiramideNumeros {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número entero"));
        String resultado = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                resultado += j + " ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}

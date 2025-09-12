import javax.swing.JOptionPane;

public class Tablas{
    public static void main(String[] args) {
        int n;

        do {
            
            String input = JOptionPane.showInputDialog(
                    "Ingrese un número (0 para salir): ");
            
            
            if (input == null) {
                break; 
            }
            
            n = Integer.parseInt(input);

            if (n != 0) {
                StringBuilder tabla = new StringBuilder();
                tabla.append("Tabla del ").append(n).append(":\n");

                for (int i = 1; i <= 10; i++) {
                    tabla.append(n).append(" x ").append(i)
                         .append(" = ").append(n * i).append("\n");
                }

                JOptionPane.showMessageDialog(null, tabla.toString());
            }

        } while (n != 0);

        JOptionPane.showMessageDialog(null, "Programa finalizado.");
    }
}


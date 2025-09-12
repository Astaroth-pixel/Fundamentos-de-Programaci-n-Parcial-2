import javax.swing.JOptionPane;

public class Cantidades {
    public static void main(String[] args) {
        int CP = 0, CN = 0, CA;
        int NU = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cantidades"));

        for (int C = 1; C <= NU; C++) {
            CA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad " + C + ":"));
            if (CA > 0) {
                CP++;
            } else {
                CN++;
            }
        }

        JOptionPane.showMessageDialog(null, "Cantidad de positivos: " + CP + "\nCantidad de menores o iguales a cero: " + CN);
    }
}


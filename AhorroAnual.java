import javax.swing.JOptionPane;

public class AhorroAnual {
    public static void main(String[] args) {
        double AH = 0; 
        int CA;        

        for (int M = 1; M <= 12; M++) {
            String input = JOptionPane.showInputDialog("Ingrese la cantidad a ahorrar en el mes " + M + ":");
            CA = Integer.parseInt(input);

            AH = AH + CA;

            JOptionPane.showMessageDialog(null, "Ahorro acumulado hasta el mes " + M + ": " + AH);
        }

        JOptionPane.showMessageDialog(null, "El ahorro total al final del año es: " + AH);
    }
}






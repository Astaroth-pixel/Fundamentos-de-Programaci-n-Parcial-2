import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número entero:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número entero:"));
       
        String operacion = JOptionPane.showInputDialog("Ingrese la operación (+, -, *, /):");

        int resultado;
        String mensaje = "";
        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                mensaje = num1 + " + " + num2 + " = " + resultado;
                break;
            case "-":
                resultado = num1 - num2;
                mensaje = num1 + " - " + num2 + " = " + resultado;
                break;
            case "*":
                resultado = num1 * num2;
                mensaje = num1 + " * " + num2 + " = " + resultado;
                break;
            case "/":
                if (num2 != 0) {
                    double division = (double) num1 / num2; 
                    mensaje = num1 + " / " + num2 + " = " + division;
                } else {
                    mensaje = "No se puede dividir entre 0";
                }
                break;
            default:
                mensaje = "Operación no válida. Use solo (+, -, *, /).";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
import java.util.Arrays;
import javax.swing.JOptionPane;

public class OperacionesArreglo {
    static int[] arreglo = new int[0];

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = leerEntero(
                "=== MENÚ DE OPERACIONES ===\n" +
                "1. Almacenar valores\n" +
                "2. Recorrer arreglo (Ascendente por posicion)\n" +
                "3. Recorrer arreglo (Descendente por posicion)\n" +
                "4. Buscar elemento\n" +
                "5. Modificar elemento\n" +
                "6. Eliminar un elemento\n" +
                "7. Eliminar todo el arreglo\n" +
                "8. Ordenar Ascendente\n" +
                "9. Ordenar Descendente\n" +
                "0. Salir"
            );

            switch (opcion) {
                case 1 -> guardarValores();
                case 2 -> recorrerAscendente();
                case 3 -> recorrerDescendente();
                case 4 -> buscarElemento();
                case 5 -> modificarElemento();
                case 6 -> eliminarElemento();
                case 7 -> eliminarTodo();
                case 8 -> ordenarAscendente();
                case 9 -> ordenarDescendente();
                case 0 -> JOptionPane.showMessageDialog(null, "¡Adiós!");
                default -> JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (opcion != 0);
    }

    static int leerEntero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                if (input == null) { 
                    JOptionPane.showMessageDialog(null, "Debes ingresar un valor.");
                    continue;
                }
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido.");
            }
        }
    }

    static void guardarValores() {
        int n = leerEntero("¿Cuántos valores deseas guardar?");
        arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = leerEntero("Ingresa el valor #" + (i + 1));
        }
        JOptionPane.showMessageDialog(null, "Valores almacenados correctamente.\n" + Arrays.toString(arreglo));
    }

    static void recorrerAscendente() {
        if (arreglo.length == 0) {
            JOptionPane.showMessageDialog(null, "El arreglo está vacío.");
            return;
        }
        JOptionPane.showMessageDialog(null, "Recorrido ascendente:\n" + Arrays.toString(arreglo));
    }

    static void recorrerDescendente() {
        if (arreglo.length == 0) {
            JOptionPane.showMessageDialog(null, "El arreglo está vacío.");
            return;
        }
        StringBuilder sb = new StringBuilder("Recorrido descendente:\n");
        for (int i = arreglo.length - 1; i >= 0; i--) {
            sb.append(arreglo[i]).append(" ");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    static void buscarElemento() {
        if (arreglo.length == 0) {
            JOptionPane.showMessageDialog(null, "El arreglo está vacío.");
            return;
        }
        int valor = leerEntero("Ingresa el valor a buscar:");
        boolean encontrado = false;
        int i = 0;
        while(i<arreglo.length){
            if (arreglo[i] == valor) {
                JOptionPane.showMessageDialog(null, "Valor encontrado en la posición " + i);
                encontrado = true;
                
            }
            i++;
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Valor no encontrado.");
        }
        }

    static void modificarElemento() {
        if (arreglo.length == 0) {
            JOptionPane.showMessageDialog(null, "El arreglo está vacío.");
            return;
        }
        int pos = leerEntero("Ingresa la posición a modificar (0 - " + (arreglo.length - 1) + "):");
        if (pos >= 0 && pos < arreglo.length) {
            int nuevo = leerEntero("Nuevo valor:");
            arreglo[pos] = nuevo;
            JOptionPane.showMessageDialog(null, "Elemento modificado correctamente.\n" + Arrays.toString(arreglo));
        } else {
            JOptionPane.showMessageDialog(null, "Posición inválida.");
        }
    }

    static void eliminarElemento() {
        if (arreglo.length == 0) {
            JOptionPane.showMessageDialog(null, "El arreglo está vacío.");
            return;
        }
        int pos = leerEntero("Ingresa la posición a eliminar (0 - " + (arreglo.length - 1) + "):");
        if (pos >= 0 && pos < arreglo.length) {
            int[] nuevo = new int[arreglo.length - 1];
            for (int i = 0, j = 0; i < arreglo.length; i++) {
                if (i != pos) {
                    nuevo[j++] = arreglo[i];
                }
            }
            arreglo = nuevo;
            JOptionPane.showMessageDialog(null, "Elemento eliminado correctamente.\n" + Arrays.toString(arreglo));
        } else {
            JOptionPane.showMessageDialog(null, "Posición inválida.");
        }
    }

    static void eliminarTodo() {
        arreglo = new int[0];
        JOptionPane.showMessageDialog(null, "Se eliminaron todos los elementos.");
    }

    static void ordenarAscendente() {
        Arrays.sort(arreglo);
        JOptionPane.showMessageDialog(null, "Arreglo ordenado en forma ascendente.\n" + Arrays.toString(arreglo));
    }

    static void ordenarDescendente() {
        Arrays.sort(arreglo);
        int[] temp = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            temp[i] = arreglo[arreglo.length - 1 - i];
        }
        arreglo = temp;
        JOptionPane.showMessageDialog(null, "Arreglo ordenado en forma descendente.\n" + Arrays.toString(arreglo));
    }
}

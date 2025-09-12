import javax.swing.JOptionPane;

public class UnaHoraUnSaludo {
    public static void main(String[] args) {
        String respuesta;

        do {
            // Solicitar la hora al usuario (1 a 24)
            String entrada = JOptionPane.showInputDialog("Escribe la hora actual (1 a 24):");

            try {
                int horaActual = Integer.parseInt(entrada);

                if (horaActual < 1 || horaActual > 24) {
                    JOptionPane.showMessageDialog(null, "Error: la hora debe estar entre 1 y 24.");
                } else {
                    String saludo;

                    switch (horaActual) {
                        // Buenas noches (22 a 24 y 1 a 5)
                        case 1: case 2: case 3: case 4: case 5:
                        case 22: case 23: case 24:
                            saludo = "¡Que tengas buenas noches!";
                            break;

                        // Buenos días (6 a 12)
                        case 6: case 7: case 8: case 9: case 10: case 11: case 12:
                            saludo = "¡Buenos días a ti!";
                            break;

                        // Buenas tardes (13 a 21)
                        case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21:
                            saludo = "¡Buenas tardes!";
                            break;

                        default:
                            saludo = "Hora ingresada no válida.";
                    }

                    JOptionPane.showMessageDialog(null, saludo);
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Debes escribir un número entero.");
            }

            // Preguntar si desea hacer otra operación
            respuesta = JOptionPane.showInputDialog("¿Desea consultar otra hora? (si/no)").toLowerCase();

        } while (respuesta.equals("si"));

        JOptionPane.showMessageDialog(null, "Que tenga un...");
    }
}

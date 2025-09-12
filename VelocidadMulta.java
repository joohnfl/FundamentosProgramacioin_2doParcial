
import javax.swing.JOptionPane;

public class VelocidadMulta {
    public static void main(String[] args) {
        String respuesta;

        do {
            // Pedir velocidad al usuario
            String textoVel = JOptionPane.showInputDialog("Escribe tu velocidad en km/h:");
            int vel = Integer.parseInt(textoVel);

            // Preguntar si es cumpleaños
            String cumpleanos = JOptionPane.showInputDialog("¿Es tu cumpleaños? (si/no)").toLowerCase();

            if (cumpleanos.equals("si")) {
                JOptionPane.showMessageDialog(null, "¡Feliz cumpleaños! No tienes multa 😊");
            } else {
                if (vel < 60) {
                    JOptionPane.showMessageDialog(null, "Tu velocidad está bien. No hay multa.");
                } else if (vel <= 80) {
                    JOptionPane.showMessageDialog(null, "Cuidado! Tienes una multa pequeña.");
                } else {
                    JOptionPane.showMessageDialog(null, "¡Alto riesgo! Tienes una multa grande.");
                }
            }

            // Preguntar si desea realizar otra operación
            respuesta = JOptionPane.showInputDialog("¿Desea verificar otra velocidad? (si/no)").toLowerCase();

        } while (respuesta.equals("si"));

        JOptionPane.showMessageDialog(null, "Condusca con cuidado.");
    }
}

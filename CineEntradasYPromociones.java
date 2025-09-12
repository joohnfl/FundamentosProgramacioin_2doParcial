import javax.swing.JOptionPane;

public class CineEntradasYPromociones {
    public static void main(String[] args) {
        String respuesta;

        do {
            try {
                // Definición de precios
                final double PRECIO_NORMAL = 50.0;
                final double PRECIO_PROMO_MIERCOLES = 30.0;
                final double PRECIO_PAREJA_JUEVES = 75.0;
                final double DESCUENTO_MEMBRESIA = 0.10;

                // Solicitar datos al usuario
                int cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas personas asistirán al cine?"));
                String diaSemana = JOptionPane.showInputDialog("Escribe el día de la semana (ej: lunes, martes, ...):").toLowerCase();
                int respuestaMembresia = JOptionPane.showConfirmDialog(null, "¿Tienes membresía?", "Membresía", JOptionPane.YES_NO_OPTION);

                double totalAPagar = 0.0;

                switch (diaSemana) {
                    case "miercoles":
                    case "miércoles":
                        totalAPagar = cantidadPersonas * PRECIO_PROMO_MIERCOLES;
                        break;

                    case "jueves":
                        int numParejas = cantidadPersonas / 2;
                        int individuales = cantidadPersonas % 2;
                        totalAPagar = (numParejas * PRECIO_PAREJA_JUEVES) + (individuales * PRECIO_NORMAL);
                        break;

                    default:
                        totalAPagar = cantidadPersonas * PRECIO_NORMAL;
                        break;
                }

                // Aplicar descuento si tiene membresía
                if (respuestaMembresia == JOptionPane.YES_OPTION) {
                    totalAPagar = totalAPagar * (1 - DESCUENTO_MEMBRESIA);
                }

                // Mostrar resultado final
                JOptionPane.showMessageDialog(null, "El costo total de las entradas es: $" + totalAPagar);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: debes ingresar un número entero válido.");
            }

            // Preguntar si desea hacer otra operación
            respuesta = JOptionPane.showInputDialog("¿Desea agregar alguna otra cosa? (si/no)").toLowerCase();

        } while (respuesta.equals("si"));

        JOptionPane.showMessageDialog(null, "que tenga un buen dia, gracias por su preferencia.");
    }
}

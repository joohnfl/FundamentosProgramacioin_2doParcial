import javax.swing.JOptionPane;

public class Meses {
    public static void main(String[] args) {
        String respuesta;

        do {
            // Solicitar al usuario un número de mes
            String entrada = JOptionPane.showInputDialog("Escribe un número de mes entre 1 y 12:");

            try {
                int opcion = Integer.parseInt(entrada);
                String mesNombre = "";
                int cantidadDias = 0;

                if (opcion >= 1 && opcion <= 12) {
                    switch (opcion) {
                        case 12 -> {mesNombre = "Diciembre"; cantidadDias = 31; break;}
                        case 11 -> {mesNombre = "Noviembre"; cantidadDias = 30; break;}
                        case 10 -> {mesNombre = "Octubre"; cantidadDias = 31; break;}
                        case 9 -> {mesNombre = "Septiembre"; cantidadDias = 30; break;}
                        case 8 -> {mesNombre = "Agosto"; cantidadDias = 31; break;}
                        case 7 -> {mesNombre = "Julio"; cantidadDias = 31; break;}
                        case 6 -> {mesNombre = "Junio"; cantidadDias = 30; break;}
                        case 5 -> {mesNombre = "Mayo"; cantidadDias = 31; break;}
                        case 4 -> {mesNombre = "Abril"; cantidadDias = 30; break;}
                        case 3 -> {mesNombre = "Marzo"; cantidadDias = 31; break;}
                        case 2 -> {mesNombre = "Febrero"; cantidadDias = 28; break;}
                        case 1 -> {mesNombre = "Enero"; cantidadDias = 31; break;}
                    }

                    JOptionPane.showMessageDialog(
                        null,
                        "Seleccionaste: " + mesNombre + "\nNúmero de días: " + cantidadDias
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "El número ingresado no corresponde a un mes válido (1-12)."
                    );
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: Solo puedes escribir un número entero.");
            }

            // Preguntar si desea hacer otra operación
            respuesta = JOptionPane.showInputDialog("¿Deseas consultar otro mes.? (si/no)").toLowerCase();

        } while (respuesta.equals("si"));

        JOptionPane.showMessageDialog(null, "gracias.");
    }
}

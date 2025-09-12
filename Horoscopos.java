import javax.swing.JOptionPane;

public class Horoscopos {
    public static void main(String[] args) {
        String respuesta;

        do {
            try {
                // Solicitar día y mes de nacimiento
                int diaNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Escribe el día de tu nacimiento (1-31):"));
                int mesNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Escribe el mes de tu nacimiento (1-12):"));

                String signoZodiacal = "";

                switch (mesNacimiento) {
                    case 12: // Diciembre
                        signoZodiacal = (diaNacimiento >= 1 && diaNacimiento <= 21) ? "Sagitario" : "Capricornio";
                        break;
                    case 11: // Noviembre
                        signoZodiacal = (diaNacimiento >= 1 && diaNacimiento <= 21) ? "Escorpio" : "Sagitario";
                        break;
                    case 10: // Octubre
                        signoZodiacal = (diaNacimiento >= 1 && diaNacimiento <= 22) ? "Libra" : "Escorpio";
                        break;
                    case 9: // Septiembre
                        signoZodiacal = (diaNacimiento >= 1 && diaNacimiento <= 22) ? "Virgo" : "Libra";
                        break;
                    case 8: // Agosto
                        signoZodiacal = (diaNacimiento >= 1 && diaNacimiento <= 22) ? "Leo" : "Virgo";
                        break;
                    case 7: // Julio
                        signoZodiacal = (diaNacimiento >= 1 && diaNacimiento <= 22) ? "Cáncer" : "Leo";
                        break;
                    case 6: // Junio
                        signoZodiacal = (diaNacimiento >= 1 && diaNacimiento <= 20) ? "Géminis" : "Cáncer";
                        break;
                    case 5: // Mayo
                        signoZodiacal = (diaNacimiento >= 1 && diaNacimiento <= 20) ? "Tauro" : "Géminis";
                        break;
                    case 4: // Abril
                        signoZodiacal = (diaNacimiento >= 1 && diaNacimiento <= 19) ? "Aries" : "Tauro";
                        break;
                    case 3: // Marzo
                        signoZodiacal = (diaNacimiento >= 1 && diaNacimiento <= 20) ? "Piscis" : "Aries";
                        break;
                    case 2: // Febrero
                        signoZodiacal = (diaNacimiento >= 1 && diaNacimiento <= 18) ? "Acuario" : "Piscis";
                        break;
                    case 1: // Enero
                        signoZodiacal = (diaNacimiento >= 1 && diaNacimiento <= 19) ? "Capricornio" : "Acuario";
                        break;
                    default:
                        signoZodiacal = "Mes ingresado no válido.";
                }

                JOptionPane.showMessageDialog(null, "Según tu fecha de nacimiento, tu signo es: " + signoZodiacal);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error. Debes escribir un número entero.");
            }

            // Preguntar si desea hacer otra operación
            respuesta = JOptionPane.showInputDialog("¿Deseas consultar alguna otra fecha? (si/no)").toLowerCase();

        } while (respuesta.equals("si"));

        JOptionPane.showMessageDialog(null, "Que tengas un buen dia.");
    }
}


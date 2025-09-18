
import java.util.Scanner;

public class TablasDeMultiplicar {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int LIMITE=10; // Tablas del 1 al 10
    while(true) {
        System.out.println("Ingresar un numero (ingresar 0 si deseas terminar): ");
String linea = sc.nextLine().trim();

            // Validar que la entrada sea un entero
            int n;
            try {
                n = Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor ingrese un número entero.");
                continue; // pedir otra entrada
            }

            // Condición de salida
            if (n == 0) {
                System.out.println("Programa terminado.");
                break;
            }

            // Imprimir la tabla de multiplicar de n
            System.out.println("Tabla de multiplicar del " + n + " (1 a " + LIMITE + "):");
            for (int i = 1; i <= LIMITE; i++) {
                System.out.printf("%d x %d = %d%n", n, i, n * i);
            }
            System.out.println(); // línea en blanco para separar tablas
        }

        sc.close();
    }
}

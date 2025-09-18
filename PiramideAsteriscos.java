import java.util.Scanner;

public class PiramideAsteriscos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir número de líneas
        System.out.print("Ingrese el número de líneas: ");
        int n = sc.nextInt();

        // Pirámide completa
        System.out.println("\n=== Pirámide ===");
        dibujarPiramide(n);

        // Pirámide invertida
        System.out.println("\n=== Pirámide invertida ===");
        dibujarPiramideInvertida(n);

        // Cuadrado
        System.out.println("\n=== Cuadrado ===");
        dibujarCuadrado(n);

        sc.close();
    }

    // Pirámide centrada
    public static void dibujarPiramide(int n) {
        for (int i = 1; i <= n; i++) {
            // espacios
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pirámide invertida
    public static void dibujarPiramideInvertida(int n) {
        for (int i = n; i >= 1; i--) {
            // espacios
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Cuadrado
    public static void dibujarCuadrado(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class PiraamideNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero n: ");
        int n = sc.nextInt();

        dibujarPiramideConMarco(n);

        sc.close();
    }

    // Pirámide centrada con marco
    public static void dibujarPiramideConMarco(int n) {
        int ancho = 2 * n - 1; // ancho máximo de la pirámide

        // marco superior
        for (int i = 0; i < ancho + 4; i++) System.out.print("-");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.print("| "); // marco izquierdo

            // espacios
            for (int j = i; j < n; j++) System.out.print(" ");

            // números ascendentes
            for (int k = 1; k <= i; k++) System.out.print(k);

            // números descendentes
            for (int k = i - 1; k >= 1; k--) System.out.print(k);

            // espacios
            for (int j = i; j < n; j++) System.out.print(" ");

            System.out.println(" |"); // marco derecho
        }

        // marco inferior
        for (int i = 0; i < ancho + 4; i++) System.out.print("-");
        System.out.println();
    }
}


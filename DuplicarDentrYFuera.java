import java.util.Scanner;

public class DuplicarDentrYFuera {

    public void duplicar(int numero) {
        numero = numero * 2;
        System.out.println("Número dentro del método: " + numero);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        DuplicarDentrYFuera duplicar = new DuplicarDentrYFuera();

        do {
            System.out.print("Ingresa un número (0 para salir): ");
            numero = sc.nextInt();

            if (numero != 0) {
                duplicar.duplicar(numero);
                System.out.println("Número fuera del método: " + numero);
            }

        } while (numero != 0);

        System.out.println("Programa finalizado.");
        sc.close();
    }
}



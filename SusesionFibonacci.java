
import java.util.Scanner;

public class SusesionFibonacci {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int A = 0, B = 1, C, M = 1, N;
        System.out.println("Ingresar la cantidad de elementos de la susecion: ");
        N = scanner.nextInt();

        if (N >= 1) System.out.print(A + " ");
        if (N >= 2) System.out.print( B + " ");

        while (M < (N - 2)){
            C = A + B;
            System.out.print(C + " ");
            A = B;
            B = C;
            M++;

        }
    scanner.close();
    }
}

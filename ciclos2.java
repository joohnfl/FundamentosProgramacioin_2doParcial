public class ciclos2 {
    public static void main(String[] args) {
        int n;
        int resultado;

        n = 1;
        resultado = 0;

        if (n == 1) {
            resultado = 0;
        }

        do {
            resultado = resultado + n;
            n = n + 1;
        } while (n < 10);

        System.out.println("El resultado es: " + resultado);
    }
}

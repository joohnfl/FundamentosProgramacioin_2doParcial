public class ParametrosValor {
    
    public static void duplicar(int numero) {
        numero = numero * 2;
        System.out.println("Dentro del método: " + numero);
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Antes de llamar al método: " + x);
        duplicar(x);
        System.out.println("Después de llamar al método: " + x);
    }
}


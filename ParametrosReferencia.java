class Caja {
    int valor;
}

public class ParametrosReferencia {

    public static void duplicar(Caja c) {
        c.valor = c.valor * 2; // modificamos atributo del objeto
        System.out.println("Dentro del método: " + c.valor);
    }

    public static void main(String[] args) {
        Caja miCaja = new Caja();
        miCaja.valor = 10;

        System.out.println("Antes de llamar al método: " + miCaja.valor);
        duplicar(miCaja);
        System.out.println("Después de llamar al método: " + miCaja.valor);
    }
}


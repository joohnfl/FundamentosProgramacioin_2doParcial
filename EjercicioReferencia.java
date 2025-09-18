class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class EjercicioReferencia {

    // Método que aumenta la edad de la persona
    public static void cumplirAnios(Persona p) {
        p.edad += 1;
        System.out.println("Dentro del método -> " + p.nombre +
                " tiene ahora " + p.edad + " años");
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 25);

        System.out.println("Antes del método -> " +
                persona1.nombre + " tiene " + persona1.edad + " años");

        cumplirAnios(persona1);

        System.out.println("Después del método -> " +
                persona1.nombre + " tiene " + persona1.edad + " años");
    }
}

import java.util.Scanner;
public class Ahorro {
    public static void main(String[] args) {
        double AH = 0.0;
        int M = 1;
        Scanner sc = new 
        Scanner(System.in);
        while ( M <= 12){
            System.out.print("Ingresar la cantidad a ahorrar este mes " + M + ": ");
            double CA = sc.nextDouble();
            AH = AH + CA;
            System.out.println("El Ahorro Del mes " + M + " es: " + AH);
            M = M + 1;
        }
        System.out.println ("El ahorro total fue de: " + AH);
        sc.close();
    }
    
}

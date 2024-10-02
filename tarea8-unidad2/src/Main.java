import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del primer punto (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del segundo punto (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        double anguloRadianes = Math.atan2(y2 - y1, x2 - x1);

        double anguloGrados = anguloRadianes * (180 / Math.PI);

        System.out.printf("Distancia: %.2f\n", distancia);
        System.out.printf("Ángulo en radianes: %.2f\n", anguloRadianes);
        System.out.printf("Ángulo en grados: %.2f\n", anguloGrados);

    }
}

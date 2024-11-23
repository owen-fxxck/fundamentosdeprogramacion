import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(100) + 1;
        int intento;

        System.out.println("Adivina el número (entre 1 y 100): ");
        do {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            }
        } while (intento != numeroSecreto);

        System.out.println("¡Felicidades! Adivinaste el número.");
    }
}

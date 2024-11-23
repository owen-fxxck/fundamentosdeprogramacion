import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        System.out.print("Divisores de " + n + ": ");

        boolean tieneDivisores = false;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                tieneDivisores = true;
            }
        }

        if (!tieneDivisores) {
            System.out.println("El número no tiene divisores más que 1 y él mismo.");
        }
    }
}

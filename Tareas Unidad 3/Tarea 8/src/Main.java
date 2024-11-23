import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número: ");
        int numero = scanner.nextInt();
        System.out.print("Ingrese el rango: ");
        int rango = scanner.nextInt();

        for (int i = 1; i <= rango; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

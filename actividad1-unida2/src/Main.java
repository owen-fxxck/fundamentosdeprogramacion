//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los 5 números al usuario
        System.out.print("Ingrese el número 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el número 2: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el número 3: ");
        int numero3 = scanner.nextInt();

        System.out.print("Ingrese el número 4: ");
        double numero4 = scanner.nextDouble();

        System.out.print("Ingrese el número 5: ");
        double numero5 = scanner.nextDouble();

        // Calcular el dividendo
        double dividendo = ((numero1 / numero4) * ((numero3 + numero2)) / numero5) / ((numero2 + numero3) * numero4);

        // Calcular el divisor
        double divisor = ((numero5 / numero1) + (numero2 / numero3) - numero4) / (numero1 + numero2 + numero3);

        // Mostrar el resultado
        System.out.println("Resultado de la primera fórmula: " + (dividendo/divisor) );

        scanner.close();
    }
}
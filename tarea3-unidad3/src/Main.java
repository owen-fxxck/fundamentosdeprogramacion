//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número para verificar si es divisible entre 3, 5 o ambos:");
        int numeroDivisibilidad = scanner.nextInt();

        System.out.println("Introduce los tres lados del triángulo:");
        int lado1 = scanner.nextInt();
        int lado2 = scanner.nextInt();
        int lado3 = scanner.nextInt();

        System.out.println("Introduce el salario de una persona:");
        double salario = scanner.nextDouble();

        System.out.println("Introduce un número para verificar si es par o impar:");
        int numeroParImpar = scanner.nextInt();

        if (numeroDivisibilidad % 3 == 0 && numeroDivisibilidad % 5 == 0) {
            System.out.println("El número " + numeroDivisibilidad + " es divisible entre 3 y 5.");
        } else if (numeroDivisibilidad % 3 == 0) {
            System.out.println("El número " + numeroDivisibilidad + " es divisible entre 3.");
        } else if (numeroDivisibilidad % 5 == 0) {
            System.out.println("El número " + numeroDivisibilidad + " es divisible entre 5.");
        } else {
            System.out.println("El número " + numeroDivisibilidad + " no es divisible ni entre 3 ni entre 5.");
        }

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }

        if (salario <= 10000) {
            System.out.println("No paga impuestos.");
        } else if (salario <= 20000) {
            double impuesto = salario * 0.10;
            System.out.println("Paga un impuesto del 10%. El monto es: " + impuesto);
        } else {
            double impuesto = salario * 0.20;
            System.out.println("Paga un impuesto del 20%. El monto es: " + impuesto);
        }

        if (numeroParImpar % 2 == 0) {
            System.out.println("El número " + numeroParImpar + " es par.");
        } else {
            System.out.println("El número " + numeroParImpar + " es impar.");
        }
    }
}

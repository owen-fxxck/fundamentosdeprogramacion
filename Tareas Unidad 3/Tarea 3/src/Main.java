import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número límite n: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;

        System.out.print("Serie de Fibonacci: ");
        while (a <= n) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}

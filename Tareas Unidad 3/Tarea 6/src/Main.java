import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        int original = num;
        int reverso = 0;

        while (num > 0) {
            reverso = reverso * 10 + (num % 10);
            num /= 10;
        }

        if (original == reverso) {
            System.out.println(original + " es un número palíndromo.");
        } else {
            System.out.println(original + " no es un número palíndromo.");
        }
    }
}

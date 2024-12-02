import java.util.Random;
import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Ingrese el tamaño de la matriz cuadrada: ");
        int n = sc.nextInt();
        
        int[][] matriz = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
        
        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumaDiagonalPrincipal += matriz[i][j];
                }
                if (i + j == n - 1) {
                    sumaDiagonalSecundaria += matriz[i][j];
                }
            }
        }
        
        System.out.println("\nSuma de la diagonal principal: " + sumaDiagonalPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaDiagonalSecundaria);
        
    }
}

import java.util.Random;
import java.util.Scanner;

public class intercambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
        
        System.out.println("Matriz original:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("Ingrese el número de la primera fila a intercambiar (0-" + (filas-1) + "): ");
        int fila1 = scanner.nextInt();
        System.out.println("Ingrese el número de la segunda fila a intercambiar (0-" + (filas-1) + "): ");
        int fila2 = scanner.nextInt();
        
        for (int j = 0; j < columnas; j++) {
            int temp = matriz[fila1][j];
            matriz[fila1][j] = matriz[fila2][j];
            matriz[fila2][j] = temp;
        }
        
        System.out.println("Matriz después del intercambio:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
}

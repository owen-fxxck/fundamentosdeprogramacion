import java.util.Scanner;

public class elementoMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el número de filas: ");
        int filas = sc.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("Ingrese el elemento: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        
        int mayor = matriz[0][0];
        int filaMayor = 0;
        int columnaMayor = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                }
            }
        }
        
        System.out.println("El elemento mayor es: " + mayor);
        System.out.println("Se encuentra en la fila: " + filaMayor);
        System.out.println("Se encuentra en la columna: " + columnaMayor);
    }
}

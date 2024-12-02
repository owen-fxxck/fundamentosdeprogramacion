import java.util.Scanner;
public class frecuencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del arreglo:");
        int n = sc.nextInt();
        
        int[] numeros = new int[n];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if (numeros[i] == Integer.MIN_VALUE) continue;
            
            int frecuencia = 1;
            for (int j = i + 1; j < n; j++) {
                if (numeros[i] == numeros[j]) {
                    frecuencia++;
                    numeros[j] = Integer.MIN_VALUE;
                }
            }
            System.out.println("El número " + numeros[i] + " aparece " + frecuencia + " veces");
        }
    }
}

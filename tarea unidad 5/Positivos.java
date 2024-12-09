public class Positivos {
    public static void imprimirPositivos(int[] numeros) {
        System.out.println("Números positivos en el arreglo:");
        for (int numero : numeros) {
            if (numero > 0) {
                System.out.println(numero);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arreglo = {-2, 5, 0, 12, -8, 3, 7, -1};
        
        imprimirPositivos(arreglo);
    }
}

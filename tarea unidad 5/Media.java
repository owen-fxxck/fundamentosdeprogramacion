public class Media {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};
        
        double resultado = calcularMedia(numeros);
        
        System.out.println("Los números del arreglo son:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\nLa media es: " + resultado);
    }
    
    public static double calcularMedia(int[] arreglo) {
        double suma = 0;
        
        for (int numero : arreglo) {
            suma += numero;
        }
        
        return suma / arreglo.length;
    }
}

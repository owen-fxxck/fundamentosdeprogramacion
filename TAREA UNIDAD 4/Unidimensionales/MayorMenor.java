import java.util.Random;

public class MayorMenor {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        Random random = new Random();
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
            System.out.print(numeros[i] + " ");
        }
        
        int mayor = numeros[0];
        int menor = numeros[0];
        int posisionM = 0;
        int posisionm = 0;
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posisionM = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posisionm = i;
            }
        }
        
        System.out.println("Número mayor: " + mayor);
        System.out.println("Posición del mayor: " + posisionM );
        System.out.println("Número menor: " + menor);
        System.out.println("Posición del menor: " + posisionm);
    }
}

import java.util.Scanner;
public class promediio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] calificaciones = new double[10];
        double suma = 0;
        
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese la calificación: ");
            calificaciones[i] = sc.nextDouble();
            suma += calificaciones[i];
        }

        double promedio = suma / calificaciones.length;
        int a = 0;
        int b = 0;
        
        for (double calificacion : calificaciones) {
            if (calificacion > promedio) {
                a++;
            } else if (calificacion < promedio) {
                b++;
            }
        }
        System.out.println("Estudiantes arriba del promedio: " + a);
        System.out.println("Estudiantes abajo del promedio: " + b);
    }
}
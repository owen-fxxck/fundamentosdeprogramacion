import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa las coordenadas del punto 1 (x1, y1):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Ingresa las coordenadas del punto 2 (x2, y2):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println("Ingresa las coordenadas del punto 3 (x3, y3):");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();


        double ladoA = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double ladoB = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double ladoC = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        System.out.printf("Lado A: " + ladoA + "\n");
        System.out.printf("Lado B: " + ladoB + "\n");
        System.out.printf("Lado C: " + ladoC + "\n");


        double perimetro = ladoA + ladoB + ladoC;
        System.out.printf("Perímetro del triángulo: " + perimetro + "\n");


        double s = perimetro / 2;
        double area = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
        System.out.printf("Área del triángulo: " + area + "\n");


        double altura = (2 * area) / ladoA;
        System.out.printf("Altura desde el vértice (x1, y1): " + altura + "\n");


        double anguloA = Math.toDegrees(Math.acos((ladoB * ladoB + ladoC * ladoC - ladoA * ladoA) / (2 * ladoB * ladoC)));
        double anguloB = Math.toDegrees(Math.acos((ladoA * ladoA + ladoC * ladoC - ladoB * ladoB) / (2 * ladoA * ladoC)));
        double anguloC = Math.toDegrees(Math.acos((ladoA * ladoA + ladoB * ladoB - ladoC * ladoC) / (2 * ladoA * ladoB)));

        System.out.printf("Ángulo A: " + anguloA + "\n");
        System.out.printf("Ángulo B: " + anguloB + "\n");
        System.out.printf("Ángulo C: " + anguloC + "\n");


        boolean equilatero = (Math.abs(ladoA - ladoB) + Math.abs(ladoB - ladoC) + Math.abs(ladoC - ladoA)) < 0;
        System.out.println("El triángulo es equilátero: " + equilatero + "\n" );


        double puntoMedioABx = (x1 + x2) / 2;
        double puntoMedioABy = (y1 + y2) / 2;

        double puntoMedioBCx = (x2 + x3) / 2;
        double puntoMedioBCy = (y2 + y3) / 2;

        double puntoMedioCAx = (x3 + x1) / 2;
        double puntoMedioCAy = (y3 + y1) / 2;

        System.out.printf("Punto medio del lado AB: " + puntoMedioABx + "," + puntoMedioABy + "\n");
        System.out.printf("Punto medio del lado BC: " + puntoMedioBCx + "," + puntoMedioBCy + "\n");
        System.out.printf("Punto medio del lado CA: " + puntoMedioCAx + "," + puntoMedioCAy + "\n");

    }
}

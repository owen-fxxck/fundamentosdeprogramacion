import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[3];
        int[] cantidades = new int[3];
        double[] preciosUnitarios = new double[3];
        double[] descuentos = new double[3];
        double[] impuestos = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa el nombre del producto " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            System.out.println("Ingresa la cantidad de productos: ");
            cantidades[i] = sc.nextInt();

            System.out.println("Ingresa el precio unitario del producto: ");
            preciosUnitarios[i] = sc.nextDouble();

            System.out.println("Ingresa el porcentaje de descuento: ");
            descuentos[i] = sc.nextDouble();

            System.out.println("Ingresa los impuestos aplicables en porcentaje: ");
            impuestos[i] = sc.nextDouble();

            sc.nextLine();
        }

        double totalAcumulado = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("\nProducto " + (i + 1) + ": " + nombres[i]);
            System.out.println("Cantidad: " + cantidades[i]);

            double precioTotalSinDescuento = cantidades[i] * preciosUnitarios[i];
            System.out.println("Precio total sin descuento: $" + precioTotalSinDescuento);

            double descuentoAplicado = (descuentos[i] / 100) * precioTotalSinDescuento;
            System.out.println("Descuento aplicado: $" + descuentoAplicado);

            double precioConDescuento = precioTotalSinDescuento - descuentoAplicado;
            System.out.println("Precio con descuento: $" + precioConDescuento);

            double impuestosAplicados = (impuestos[i] / 100) * precioConDescuento;
            System.out.println("Impuestos aplicados: $" + impuestosAplicados);

            double totalPagar = precioConDescuento + impuestosAplicados;
            System.out.println("Total a pagar: $" + totalPagar);

            totalAcumulado += totalPagar;
        }

        System.out.println("\nTotal acumulado a pagar por los tres productos: $" + totalAcumulado);

    }
}

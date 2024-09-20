import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos del domicilio
        System.out.println("Ingrese los datos de su domicilio:");
        System.out.print("Calle: ");
        String calle = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Colonia: ");
        String colonia = scanner.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.print("Código Postal: ");
        String codigoPostal = scanner.nextLine();

        // Datos de la primaria, secundaria y preparatoria
        System.out.println("\nIngrese los datos de sus estudios:");
        System.out.print("Nombre de la primaria: ");
        String primaria = scanner.nextLine();
        System.out.print("Nombre de la secundaria: ");
        String secundaria = scanner.nextLine();
        System.out.print("Nombre de la preparatoria: ");
        String preparatoria = scanner.nextLine();

        // Datos del deporte favorito
        System.out.println("\nIngrese los datos de su deporte favorito:");
        System.out.print("Nombre del deporte: ");
        String deporte = scanner.nextLine();
        System.out.print("Posición o rol en el deporte: ");
        String posicion = scanner.nextLine();
        System.out.print("Equipo favorito: ");
        String equipoFavorito = scanner.nextLine();


        System.out.println("\n--- Datos Ingresados ---");
        System.out.println("Domicilio: " + calle + " #" + numero + ", " + colonia + ", " + ciudad + ", CP: " + codigoPostal);
        System.out.println("Primaria: " + primaria);
        System.out.println("Secundaria: " + secundaria);
        System.out.println("Preparatoria: " + preparatoria);
        System.out.println("Deporte favorito: " + deporte + ", Posición: " + posicion + ", Equipo favorito: " + equipoFavorito);

    }
}

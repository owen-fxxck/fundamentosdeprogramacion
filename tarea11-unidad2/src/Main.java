public class Main {
    public static void main(String[] args) {
        String nombreCompleto = "García, Juan Carlos";

        System.out.println("1. Longitud del nombre completo: " + nombreCompleto.length());

        String apellido = nombreCompleto.substring(0, nombreCompleto.indexOf(','));
        System.out.println("2. Apellido: " + apellido);

        String nombreSinApellido = nombreCompleto.substring(nombreCompleto.indexOf(',') + 2);
        System.out.println("3. Nombre sin apellido: " + nombreSinApellido);

        String primerNombre = nombreSinApellido.split(" ")[0];
        System.out.println("4. Primer nombre: " + primerNombre);

        System.out.println("5. Apellido en mayúsculas: " + apellido.toUpperCase());

        System.out.println("6. Nombre completo en minúsculas: " + nombreCompleto.toLowerCase());

        System.out.println("7. Carácter en la posición 5: " + nombreCompleto.charAt(4));

        System.out.println("8. Primera ocurrencia de 'a': " + nombreCompleto.indexOf('a'));

        System.out.println("9. Última ocurrencia de 'a': " + nombreCompleto.lastIndexOf('a'));
    }
}



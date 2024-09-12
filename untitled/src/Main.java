//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Sección 1: Información de un libro favorito
        System.out.println("Titulo del libro: El principito");
        System.out.println("Autor: Saint-Exupéry");
        System.out.println("Año de publicacion: 1943");
        System.out.println("Genero: Fantasia");
        System.out.println("Numero de paginas: 120");

        //Sección 2: Información de un país que deseas visitar
        String pais = "España";
        String capital = "Madrid";
        String idioma = "Español de España";
        Double poblacion = 47.5;
        String moneda = "Euro";


        System.out.println("El pais es: " + pais);
        System.out.println("La capital es: " + capital);
        System.out.println("El idioma es: " + idioma);
        System.out.println("La poblacion es: " + poblacion + "Millones");
        System.out.println("La moneda es: " + moneda);

        //Sección 3: Información de un personaje histórico favorito
        String nombre = "Emilanio Zapata Salazar";
        int dia = 8;
        String mes = "Agosoto";
        int año = 1879;
        String nacionalidad = "Mexicano";
        String ocupacion = "Politico";
        String logro = "Heroe de guerra";

        System.out.println("El nombre era: " + nombre);
        System.out.println("Su fecha de nacimiento era: " + dia + " de " + mes + " de " + año);
        System.out.println("Su nacionalidad era: " + nacionalidad);
        System.out.println("Su ocupacion era: " + ocupacion);
        System.out.println("Su logro destacado fue: " + logro);
    }
}
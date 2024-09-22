//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Cadena de texto
        String palabra = "supercalifragilisticoespialidoso";

        System.out.println("Longitud: " + palabra.length());

        System.out.println("Carácter en posición 10: " + palabra.charAt(9));

        String mayusculas = palabra.toUpperCase();
        System.out.println("En mayúsculas: " + mayusculas);

        String subcadena1 = palabra.substring(4, 15);
        System.out.println("Subcadena (5-15): " + subcadena1);

        int primeraI = palabra.indexOf('i');
        System.out.println("Primera ocurrencia de 'i': " + (primeraI + 1)); // +1 para contar la posición desde 1

        int ultimaO = palabra.lastIndexOf('o');
        System.out.println("Última ocurrencia de 'o': " + (ultimaO + 1));

        String minusculas = palabra.toLowerCase();
        System.out.println("En minúsculas: " + minusculas);

        String subcadena2 = palabra.substring(6);
        System.out.println("Subcadena desde la posición 7: " + subcadena2);

        int ultimaLi = palabra.lastIndexOf("li");
        System.out.println("Última ocurrencia de 'li': " + (ultimaLi + 1));
    }
}

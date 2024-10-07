import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el correo electrónico:");
        String correo = scanner.nextLine();

        int indexArroba = correo.indexOf('@');
        String nombreUsuario = correo.substring(0, indexArroba);
        String dominio = correo.substring(indexArroba);
        StringBuilder nombreInvertido = new StringBuilder(nombreUsuario);
        nombreInvertido.reverse();

        System.out.println("Ingrese la fecha de ascenso (YYYY-MM-DD):");
        String fecha = scanner.nextLine();

        int primerGuion = fecha.indexOf('-');
        int segundoGuion = fecha.indexOf('-', primerGuion + 1);

        String anio = fecha.substring(0, primerGuion);
        String mes = fecha.substring(primerGuion + 1, segundoGuion);
        String dia = fecha.substring(segundoGuion + 1);

        int sumaFecha =Integer.valueOf(anio)+Integer.valueOf(mes)+Integer.valueOf(dia);

        System.out.println("Ingrese el salario anual:");
        String salario = scanner.nextLine();

        int calcularSalario = salario.indexOf('.');

        String parteEntera = salario.substring(0, calcularSalario);
        String parteDecimal = salario.substring(calcularSalario + 1);

        double diferencia = Math.abs(Integer.valueOf(parteEntera) - Integer.valueOf(parteDecimal));
        double salarioCifrado = diferencia * 2 ;

        System.out.println(nombreInvertido + dominio + "|" + sumaFecha + "|" + salarioCifrado);

    }
}
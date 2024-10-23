import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Ejercicio 1
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su numero de identificacion:");
        int id = sc.nextInt();

        System.out.println("Ingrese su promedio general:");
        double promedio = sc.nextDouble();

        System.out.println("Ingrese a cuantas materias se desea inscribir:");
        int materia = sc.nextInt();

        if (promedio < 7.0){
            System.out.println("No se puede inscribir a ninguna materia.");
        }else if (promedio > 7.0 && promedio < 8.5){
            if (materia < 3){
                System.out.println("Se le permite la inscripcion");
            }else {
                System.out.println("Inscripcion denegada por sobrecarga academica");
            }
        }else {
            if (nombre.length() > 25) {
                System.out.println("Nombre demasiado largo, por favor corrija el nombre.");
            }else if (id < 8){
                System.out.println("Error: formato incorrecto");
            }else if (id == 8 && materia <= 5){
                System.out.println("Inscripcion permitida");
            }else if (materia > 5) {
                System.out.println("¿Cuantas materias aprobo?");
                int aprobadas = sc.nextInt();

                if (aprobadas > 3){
                    System.out.println("Inscripcion permitida hasta 6 materias.");
                }else {
                    System.out.println("Se le permite la inscripcion a 5 materias.");
                }
            }
        }

        //Ejercicio 2
        System.out.println("Tipo de membresia:");
        String membresia = sc.nextLine();

        System.out.println("Ingrese su edad:");
        int edad = sc.nextInt();

        System.out.println("Ingrese el evento al cual desea asistir");
        String evento = sc.nextLine();

        if (membresia.equals("Premium")){
            if (edad < 18){
                System.out.println("Compra para eventos internacionales no permitida");
            }else if (edad > 18 && edad < 25){
                if (evento.equals("internacional")){
                    System.out.println("Descuento del 20%");
                }else {
                    System.out.println("Descuento del 10%");
                }
            }else {
                if (evento.equals("internacional")){
                    System.out.println("Descuento del 25%");
                }else {
                    System.out.println("Descuento del 15%");
                }
            }
        }else if (membresia.equals("Estandar")){
            if (edad < 18) {
                System.out.println("Compra para eventos internacionales no permitida");
            }else {
                if (evento.equals("nacional")){
                    System.out.println("Descuento del 5%");
                }
            }
        }else {
            System.out.println("Sin derecho a descuentos y eventos internacionales");
        }

        //Ejercicio 3
        System.out.println("Ingrese su nombre:");
        String usuario = sc.nextLine();

        System.out.println("Ingrese su edad:");
        int edad2 = sc.nextInt();

        System.out.println("Ingrese su pais de residencia:");
        String pais = sc.nextLine();

        System.out.println("Estado cilvil:");
        String estadoCivil = sc.nextLine();

        System.out.println("Ingresos anuales:");
        double ingresos = sc.nextDouble();

        System.out.println("¿Tiene hijos? true/false");
        boolean hijos = sc.nextBoolean();

        if (usuario.matches(".*\\d.*")){
            System.out.println("Error en el nombre");
        }else if (edad2 < 25){
            System.out.println("No es elegible para beneficios");
        }else {
            if (pais.equals("Mexico") && estadoCivil.equals("Casado")){
                if (ingresos < 300000 && hijos){
                    System.out.println("Descuento del 10% en su seguro");
                }else {
                    System.out.println("Descuento del 5% en su seguro");
                }
            }else if (pais.equals("Mexico") && estadoCivil.equals("Soltero")){
                if (ingresos < 400000){
                    System.out.println("Descuento del 8% en su seguro");
                }else {
                    System.out.println("No recibe beneficios");
                }
            }else if (pais.equals("USA")){
                if (ingresos < 500000 && estadoCivil.equals("Casado")){
                    System.out.println("Descuento del 12% en su seguro");
                }else if (estadoCivil.equals("Soltero") && ingresos < 200000){
                    System.out.println("Descuento del 7% en su seguro");
                }
                if (hijos){
                    System.out.println("Se agrega 3% de descuento en su seguro");
                }
            }else {
                if (estadoCivil.equals("Casado")){
                    System.out.println("Descuento del 5% en su seguro");
                }else if (estadoCivil.equals("Soltero")){
                    System.out.println("Descuento del 3% en su seguro");
                }
                if (ingresos < 200000 && hijos){
                    System.out.println("Descuento adicional de 2% en su seguro");
                }
            }
        }

    }
}
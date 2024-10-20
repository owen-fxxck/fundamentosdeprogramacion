import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar nacionalidad
        System.out.println("Ingrese su nacionalidad:");
        String nacionalidad = sc.nextLine();

        // Solicitar visa
        System.out.println("Visa de trabajo válida (true/false):");
        Boolean visa = sc.nextBoolean();
        sc.nextLine();  // Limpiar el buffer después de nextBoolean()

        // Solicitar experiencia en años
        System.out.println("Ingrese su experiencia en años:");
        int experiencia = sc.nextInt();
        sc.nextLine();

        // Evaluar si es elegible para empleo
        if (nacionalidad.equals("ciudadano") || nacionalidad.equals("residente")) {
            System.out.println("Elegible para cualquier puesto");
        } else {
            if (visa) {
                if (experiencia > 5) {
                    System.out.println("Es elegible para empleos calificados");
                } else {
                    System.out.println("Solo es elegible para empleos no calificados");
                }
            } else {
                System.out.println("Rechazado");
            }
        }

        // Validar identidad en compra en línea
        System.out.println("Ingrese su país de residencia:");
        String pais = sc.nextLine();

        System.out.println("Ingrese su código postal:");
        String codigo = sc.nextLine();

        System.out.println("¿Ha hecho compras previas? (true/false):");
        Boolean compras = sc.nextBoolean();
        sc.nextLine();

        if (pais.equals("USA")) {
            if (codigo.startsWith("9")) {
                if (compras) {
                    System.out.println("Se permite pago con PayPal");
                } else {
                    System.out.println("Verificar con su dirección");
                }
            } else {
                System.out.println("Utilizar tarjeta de crédito");
            }
        } else if (pais.equals("Europa")) {
            if (codigo.length() == 5) {
                if (compras) {
                    System.out.println("Se permite pago con transferencia bancaria");
                } else {
                    System.out.println("Verificación bancaria");
                }
            } else {
                System.out.println("Compra rechazada");
            }
        } else {
            System.out.println("Verificar identidad de manera manual");
        }

        // Verificar disponibilidad de habitaciones
        boolean disponible = true;

        System.out.println("Elija el tipo de habitación:");
        String habitacion = sc.nextLine();

        System.out.println("¿Cuántas personas se hospedarán?");
        int personas = sc.nextInt();
        sc.nextLine();

        System.out.println("Duración de la estadía (en noches):");
        int estadia = sc.nextInt();
        sc.nextLine();

        if (personas == 1) {
            if (habitacion.equals("suite")) {
                if (disponible && estadia > 3) {
                    System.out.println("Descuento del 10%");
                } else {
                    System.out.println("Asignar habitación estándar");
                }
            } else {
                System.out.println("Asignar habitación estándar");
            }
        } else {
            if (habitacion.equals("suite") && disponible) {
                if (estadia > 5) {
                    System.out.println("Paquete con desayuno incluido");
                } else {
                    System.out.println("Asignar solo suite");
                }
            } else {
                System.out.println("Asignar habitación doble estándar");
            }
        }
    }
}

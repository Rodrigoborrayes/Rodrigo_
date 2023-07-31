holzzz
import java.util.Scanner;



public class GimnasioApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Miembro miembro = null;
        Empleado empleadoAyuda = null;

        System.out.println("Bienvenido(a) a XYZ Gym");

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Registrar nuevo miembro activo");
            System.out.println("2. Registrar nuevo miembro inactivo");
            System.out.println("3. Consultar información de miembro");
            System.out.println("4. Reservar una clase");
            System.out.println("5. Ayuda de empleado");
            System.out.println("6. Consultar información de empleado");
            System.out.println("7. Salir");
            System.out.print("Ingrese el número de la opción que desea: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    miembro = new MiembroActivo();
                    break;
                case 2:
                    miembro = new MiembroInactivo();
                    break;
                case 3:
                    if (miembro != null) {
                        miembro.mostrarInformacion();
                    } else {
                        System.out.println("Primero registre un miembro para consultar la información.");
                    }
                    break;
                case 4:
                    if (miembro != null && miembro instanceof MiembroActivo) {
                        Reserva reserva = new Reserva(miembro.nombre);
                        reserva.mostrarInformacion();
                    } else {
                        System.out.println("Solo los miembros activos pueden reservar clases.");
                    }
                    break;
                case 5:
                    empleadoAyuda = new Empleado("Ayuda Empleado", 25);
                    empleadoAyuda.consultarEjercicio();
                    break;
                case 6:
                    if (empleadoAyuda != null) {
                        empleadoAyuda.mostrarInformacion();
                    } else {
                        System.out.println("El empleado de ayuda aún no ha sido registrado.");
                    }
                    break;
                case 7:
                    System.out.println("¡Gracias por usar XYZ Gym! ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese un número del 1 al 7.");
            }
        }
    }
}






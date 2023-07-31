import java.util.Scanner;

class Reserva {
    private static int contadorId = 1;
    private int id;
    private String nombreMiembro;
    private String clase;
    private String dia;
    private String hora;

    public Reserva(String nombreMiembro) {
        this.nombreMiembro = nombreMiembro;
        solicitarInformacion();
        id = contadorId++;
    }

    private void solicitarInformacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la clase que desea reservar: ");
        clase = scanner.nextLine();
        System.out.print("Ingrese el día de la reserva: ");
        dia = scanner.nextLine();
        System.out.print("Ingrese la hora de la reserva: ");
        hora = scanner.nextLine();
    }

    public void mostrarInformacion() {
        System.out.println("¡Reserva realizada con éxito!");
        System.out.println("ID de reserva: " + id);
        System.out.println("Miembro: " + nombreMiembro);
        System.out.println("Clase reservada: " + clase);
        System.out.println("Día: " + dia);
        System.out.println("Hora: " + hora);
    }
}
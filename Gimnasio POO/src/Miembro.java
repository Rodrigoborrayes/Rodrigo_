import java.util.InputMismatchException;
import java.util.Scanner;

class Miembro {
    protected String nombre;
    protected int edad;
    protected Membresia membresia;

    public Miembro() {
        solicitarInformacion();
        membresia = new Membresia();
    }

    private void solicitarInformacion() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese su nombre: ");
            String nombreInput = scanner.nextLine();

            
            if (nombreInput.matches("^[a-zA-Z\\s]+$")) {
                nombre = nombreInput;
                break;
            } else {
                System.out.println("Error: El nombre no puede contener números ni símbolos.");
            }
        }

        while (true) {
            try {
                System.out.print("Ingrese su edad: ");
                edad = scanner.nextInt();
                scanner.nextLine(); 

                if (edad < 15) {
                    System.out.println("Edad inválida. La membresía solo está disponible para personas de 15 años o más.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese una edad válida.");
                scanner.nextLine(); 
            }
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        membresia.mostrarBeneficios();
    }
}


class MiembroActivo extends Miembro {
    private int diasMembresia;

    public MiembroActivo() {
        super();
        seleccionarMembresia();
        ingresarDiasMembresia();
    }

    private void seleccionarMembresia() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("\nSeleccione el tipo de membresía:");
                System.out.println("1. Membresía Cobro (por día) - $30");
                System.out.println("2. Membresía Plata (por mes) - $280");
                System.out.println("3. Membresía Oro (por año) - $3360");
                System.out.print("Ingrese el número de la opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); 

                if (opcion == 1) {
                    membresia.tipoMembresia = "Cobro";
                    membresia.costoMembresia = 30.0;
                    break;
                } else if (opcion == 2) {
                    membresia.tipoMembresia = "Plata";
                    membresia.costoMembresia = 280.0;
                    break;
                } else if (opcion == 3) {
                    membresia.tipoMembresia = "Oro";
                    membresia.costoMembresia = 3360.0;
                    break;
                } else {
                    System.out.println("Opción inválida. Ingrese un número válido (1, 2 o 3).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido (1, 2 o 3).");
                scanner.nextLine(); 
            }
        }
    }

    private void ingresarDiasMembresia() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Ingrese la cantidad de días de membresía: ");
                diasMembresia = scanner.nextInt();
                scanner.nextLine(); 

                if (diasMembresia <= 0) {
                    throw new IllegalArgumentException("Error: Los días de membresía deben ser mayores a 0.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine(); 
            }
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Días de membresía: " + diasMembresia);
        System.out.println("¡Bienvenido(a) al gimnasio!");
    }
}

// Subclase: MiembroInactivo
class MiembroInactivo extends Miembro {
    private String motivoInactividad;

    public MiembroInactivo() {
        super();
        ingresarMotivoInactividad();
    }

    private void ingresarMotivoInactividad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el motivo de inactividad: ");
        motivoInactividad = scanner.nextLine();
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Motivo de inactividad: " + motivoInactividad);
    }
}
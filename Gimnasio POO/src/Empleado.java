/* Comentario */

import java.util.Scanner;
class Empleado {
    private String nombre;
    private int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public boolean tieneDudas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Tiene alguna duda sobre algún ejercicio del gimnasio? (Sí/No): ");
        String respuesta = scanner.nextLine();
        return respuesta.equalsIgnoreCase("Sí");
    }

    public void explicarEjercicio(String ejercicio) {
        System.out.println("Explicación del ejercicio \"" + ejercicio + "\":");
        switch (ejercicio) {
            case "Abdomen":
                System.out.println("El ejercicio de Abdomen se enfoca en fortalecer los músculos abdominales.");
                System.out.println("Puedes realizar abdominales, crunches o planchas para trabajar esta área.");
                break;
            case "Zumba":
                System.out.println("Zumba es una actividad aeróbica que combina movimientos de baile con ejercicio físico.");
                System.out.println("Es divertido y efectivo para quemar calorías y mejorar la resistencia.");
                break;
            case "Cardio":
                System.out.println("El ejercicio de Cardio incluye actividades como correr, saltar la cuerda o usar la bicicleta estática.");
                System.out.println("Estas actividades mejoran la salud cardiovascular y ayudan a quemar grasa.");
                break;
            case "Funcional":
                System.out.println("El entrenamiento funcional se centra en movimientos que imitan actividades cotidianas.");
                System.out.println("Puedes usar pesas, bandas elásticas y tu propio peso corporal para ejercitarte.");
                break;
            default:
                System.out.println("Lo siento, no tengo información sobre el ejercicio \"" + ejercicio + "\".");
        }
    }

    public void consultarEjercicio() {
        if (tieneDudas()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("¡Bienvenido(a) al menú de ejercicios!");
            System.out.println("Elije un ejercicio para recibir información detallada:");
            System.out.println("1. Abdomen");
            System.out.println("2. Zumba");
            System.out.println("3. Cardio");
            System.out.println("4. Funcional");
            System.out.print("Ingrese el número del ejercicio: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    explicarEjercicio("Abdomen");
                    break;
                case 2:
                    explicarEjercicio("Zumba");
                    break;
                case 3:
                    explicarEjercicio("Cardio");
                    break;
                case 4:
                    explicarEjercicio("Funcional");
                    break;
                default:
                    System.out.println("Opción inválida. No se mostrará información sobre el ejercicio.");
            }
        } else {
            System.out.println("¡No tienes dudas de ejercicios por el momento!");
        }
    }
}

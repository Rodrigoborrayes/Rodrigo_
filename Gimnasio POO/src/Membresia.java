class Membresia {
    protected String tipoMembresia;
    protected double costoMembresia;

    public void mostrarBeneficios() {
        System.out.println("Tipo de membres�a: " + tipoMembresia);
        System.out.println("Costo de la membres�a: $" + costoMembresia);
        System.out.println("Beneficios:");
        if (tipoMembresia.equals("Cobro")) {
            System.out.println("- Acceso al gimnasio por un d�a.");
        } else if (tipoMembresia.equals("Plata")) {
            System.out.println("- Acceso al gimnasio por un mes.");
            System.out.println("- Clases ilimitadas de diferentes disciplinas.");
        } else if (tipoMembresia.equals("Oro")) {
            System.out.println("- Acceso al gimnasio por un a�o.");
            System.out.println("- Clases ilimitadas de diferentes disciplinas.");
            System.out.println("- Entrenamiento personalizado con un instructor.");
        }
    }
}

class Membresia {
    protected String tipoMembresia;
    protected double costoMembresia;

    public void mostrarBeneficios() {
        System.out.println("Tipo de membresía: " + tipoMembresia);
        System.out.println("Costo de la membresía: $" + costoMembresia);
        System.out.println("Beneficios:");
        if (tipoMembresia.equals("Cobro")) {
            System.out.println("- Acceso al gimnasio por un día.");
        } else if (tipoMembresia.equals("Plata")) {
            System.out.println("- Acceso al gimnasio por un mes.");
            System.out.println("- Clases ilimitadas de diferentes disciplinas.");
        } else if (tipoMembresia.equals("Oro")) {
            System.out.println("- Acceso al gimnasio por un año.");
            System.out.println("- Clases ilimitadas de diferentes disciplinas.");
            System.out.println("- Entrenamiento personalizado con un instructor.");
        }
    }
}

class Funcional extends Actividad {
    public Funcional(int intensidad, int duracion) {
        super("Funcional", intensidad, duracion);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("- " + nombre + " (Intensidad: " + intensidad + ", Duración: " + duracion + " minutos).");
    }
}
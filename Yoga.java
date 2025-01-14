class Yoga extends Actividad {
    public Yoga(int intensidad, int duracion) {
        super("Yoga", intensidad, duracion);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("- " + nombre + " (Intensidad: " + intensidad + ", Duración: " + duracion + " minutos).");
    }
}
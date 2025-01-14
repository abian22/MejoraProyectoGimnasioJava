class Boxeo extends Actividad {
    public Boxeo(int intensidad, int duracion) {
        super("Boxeo", intensidad, duracion);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("- " + nombre + " (Intensidad: " + intensidad + ", Duración: " + duracion + " minutos).");
    }
}
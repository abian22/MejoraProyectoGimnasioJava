abstract class Actividad {
    protected String nombre;
    protected int intensidad;
    protected int duracion;

    public Actividad(String nombre, int intensidad, int duracion) {
        this.nombre = nombre;
        this.intensidad = intensidad;
        this.duracion = duracion;
    }

    public abstract void mostrarInfo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}

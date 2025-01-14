public class Gimnasio {
    private final String nombreGym;
    private final String[] actividades = {"Yoga", "Boxeo", "Funcional"};

    public Gimnasio(String nombreGym) {
        this.nombreGym = nombreGym;
    }

    public void mostrarActividades() {
        System.out.println("Actividades disponibles en el gimnasio " + nombreGym + ":");
        for (String actividad : actividades) {
            System.out.println("- " + actividad);
        }
    }

    public void registrarUsuario(String usuario) {
        System.out.println("Usuario " + usuario + " registrado en el gimnasio " + nombreGym + ".");
    }


}

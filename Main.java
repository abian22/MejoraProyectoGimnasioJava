public class Main {
    public static void main(String[] args) {
        Gimnasio miGimnasio = new Gimnasio("FitLife Gym");
        miGimnasio.mostrarActividades();
        miGimnasio.registrarUsuario("Juan Perez");

        Actividad yoga = new Yoga(3, 60);  
        Actividad boxeo = new Boxeo(5, 45);  
        Actividad funcional = new Funcional(4, 50);

        yoga.mostrarInfo();
        boxeo.mostrarInfo();
        funcional.mostrarInfo();
    }
}

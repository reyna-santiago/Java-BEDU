public class ProfesionalMedico implements Runnable {

    private String nombre;
    private final RecursoMedico recursoMedico;

    public ProfesionalMedico(String nombre, RecursoMedico recursoMedico) {
        this.nombre = nombre;
        this.recursoMedico = recursoMedico;
    }

    @Override
    public void run() {
        recursoMedico.usar(nombre);//Usa el recurso
    }
}
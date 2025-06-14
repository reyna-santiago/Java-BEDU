import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        RecursoMedico recursoMedico= new RecursoMedico("Sala de cirugía");

        System.out.println("Iniciando simulación de acceso al recurso "+recursoMedico);

        //simular concurrencia
        ExecutorService executor = Executors.newFixedThreadPool(4);

        executor.submit(new ProfesionalMedico("Dra. Santiago", recursoMedico));
        executor.submit(new ProfesionalMedico("Dr. Martinez", recursoMedico));
        executor.submit(new ProfesionalMedico("Enf. Perez", recursoMedico));
        executor.submit(new ProfesionalMedico("Enf. Ramirez", recursoMedico));

        executor.shutdown(); //No más tareas
    }
}
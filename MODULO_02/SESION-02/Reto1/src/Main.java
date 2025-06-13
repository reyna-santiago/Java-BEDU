import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("\uD83D\uDE80 Simulación de misión espacial iniciada...");

        ExecutorService executor = Executors.newFixedThreadPool(4);

        Future<String> navegacion = executor.submit(new SistemaNavegacion());
        Future<String> soporteVital = executor.submit(new SistemaSoporteVital());
        Future<String> controlTermico = executor.submit(new SistemaControlTermico());
        Future<String> comunicaciones = executor.submit(new SoporteComunicaciones());
        System.out.println(navegacion.get());
        System.out.println(soporteVital.get());
        System.out.println(controlTermico.get());
        System.out.println(comunicaciones.get());

        executor.shutdown();
        System.out.println("✅ Todos los sistemas reportan estado operativo.");
    }
}
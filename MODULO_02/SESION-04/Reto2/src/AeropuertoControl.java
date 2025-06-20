import java.util.concurrent.*;
import java.util.Random;

public class AeropuertoControl {

    private static final Random random = new Random();

    public static void main(String[] args) {
        System.out.println("GESTIÓN DE ATERRIZAJE\n");

        CompletableFuture<Boolean> pista = verificarPista();
        CompletableFuture<Boolean> clima = verificarClima();
        CompletableFuture<Boolean> trafico = verificarTraficoAereo();
        CompletableFuture<Boolean> personal = verificarPersonalTierra();

        CompletableFuture<Void> controlAterrizaje = CompletableFuture.allOf(pista, clima, trafico, personal)
                .thenAccept(v -> {
                    try {
                        boolean pista_var = pista.get();
                        boolean clima_var = clima.get();
                        boolean trafico_var = trafico.get();
                        boolean personal_var = personal.get();

                        if (pista_var && clima_var && trafico_var && personal_var) {
                            System.out.println("\nTodas las condiciones óptimas para aterrizar.");
                        } else {
                            System.out.println("\nCondiciones no óptimas para aterrizar.");
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        System.out.println("\nError en la evaluación de condiciones: " + e.getMessage());
                    }
                })
                .exceptionally(ex -> {
                    System.out.println("\nError en el aterrizaje: " + ex.getMessage());
                    return null;
                });

        controlAterrizaje.join();
    }

    //Verificar pista(con fallo aleatorio)
    public static CompletableFuture<Boolean> verificarPista() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Verificando pista...");
            latencia(3);
            boolean disponible = random.nextInt(100) < 80; // Probabilidad de éxito
            System.out.println("Pista disponible: " + disponible);
            return disponible;
        });
    }

    //Verificar clima(con fallo aleatorio)
    public static CompletableFuture<Boolean> verificarClima() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Verificando clima...");
            latencia(3);
            boolean bueno = random.nextInt(100) < 85;
            System.out.println("Clima favorable: " + bueno);
            return bueno;
        });
    }

    //Verificar tráfico aéreo (con fallo aleatorio)
    public static CompletableFuture<Boolean> verificarTraficoAereo() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Verificando tráfico aéreo...");
            latencia(2);
            boolean libre = random.nextInt(100) < 90;
            System.out.println("Tráfico aéreo despejado: " + libre);
            return libre;
        });
    }

    //Verificar personal en tierra(con fallo aleatorio)
    public static CompletableFuture<Boolean> verificarPersonalTierra() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Verificando personal en tierra...");
            latencia(3);
            boolean disponible = random.nextInt(100) < 95;
            System.out.println("Personal disponible: " + disponible);
            return disponible;
        });
    }

    //Latencia
    public static void latencia(int segundos) {
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
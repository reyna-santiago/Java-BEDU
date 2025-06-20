import java.util.concurrent.*;

public class MovilidadApp {

    public static void main(String[] args) {
        //Ejecutar las operaciones en paralelo
        CompletableFuture<String> rutaFuture = calcularRuta();
        CompletableFuture<Double> tarifaFuture = estimarTarifa();

        //Método para combinar operaciones
        CompletableFuture<Void> RutaTarifa= rutaFuture.thenCombine(tarifaFuture,
                        (ruta, tarifa) -> {
                            return "Ruta calculada: " + ruta + " | Tarifa estimada: $" + tarifa;
                        })
                .thenAccept(System.out::println) //Resultado final
                .exceptionally(ex -> {
                    System.out.println("Error: " + ex.getMessage());
                    return null;
                });
        RutaTarifa.join();
    }

    //Cálculo de la ruta
    public static CompletableFuture<String> calcularRuta() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Calculando ruta...");
            //dormir(3); // Simula latencia de 3 segundos
            return "Centro -> Norte";
        });
    }

    //Estimación de la tarifa
    public static CompletableFuture<Double> estimarTarifa() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Estimando tarifa...");
            //dormir(2); // Simula latencia de 2 segundos
            return 75.50;
        });
    }
}
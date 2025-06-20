package org.meridianprime;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Random;

public class Main {

    // Clase que representa los signos vitales
    static class SignosVitales {
        int pacienteId;
        int fc;
        int sistolica;
        int diastolica;
        int spo2;

        SignosVitales(int pacienteId, int fc, int sistolica, int diastolica, int spo2) {
            this.pacienteId = pacienteId;
            this.fc = fc;
            this.sistolica = sistolica;
            this.diastolica = diastolica;
            this.spo2 = spo2;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        // Crear flujo para un paciente
        Flux<SignosVitales> paciente1 = Flux.interval(Duration.ofMillis(300))
                .map(tick -> new SignosVitales(
                        1,
                        40 + random.nextInt(100),
                        80 + random.nextInt(91),
                        50 + random.nextInt(41),
                        80 + random.nextInt(21)
                ))
                .onBackpressureBuffer(50)
                .take(Duration.ofSeconds(20));

        Flux<SignosVitales> paciente2 = Flux.interval(Duration.ofMillis(300))
                .map(tick -> new SignosVitales(
                        2,
                        40 + random.nextInt(100),
                        80 + random.nextInt(91),
                        50 + random.nextInt(41),
                        80 + random.nextInt(21)
                ))
                .onBackpressureBuffer(50)
                .take(Duration.ofSeconds(20));

        Flux<SignosVitales> paciente3 = Flux.interval(Duration.ofMillis(300))
                .map(tick -> new SignosVitales(
                        3,
                        40 + random.nextInt(100),
                        80 + random.nextInt(91),
                        50 + random.nextInt(41),
                        80 + random.nextInt(21)
                ))
                .onBackpressureBuffer(50) 
                .take(Duration.ofSeconds(20));

        // Combinar flujos
        Flux<SignosVitales> signos = Flux.merge(paciente1, paciente2, paciente3);

        // Procesar solo eventos críticos, con backpressure simulado
        signos
                .filter(sv ->
                        sv.fc < 50 || sv.fc > 120 ||
                                sv.sistolica < 90 || sv.sistolica > 140 ||
                                sv.diastolica < 60 || sv.diastolica > 90 ||
                                sv.spo2 < 90
                )
                .delayElements(Duration.ofSeconds(1)) // procesamiento lento
                .doOnError(e -> System.err.println("❌ Error en el flujo: " + e.getMessage()))
                .doOnComplete(() -> System.out.println("\n✅ Monitoreo finalizado"))
                .subscribe(sv -> {
                    System.out.println("\n🚨 Paciente #" + sv.pacienteId + " - ALERTA:");
                    if (sv.fc < 50 || sv.fc > 120)
                        System.out.println("  ⚠️ FC crítica: " + sv.fc + " bpm");
                    if (sv.sistolica < 90 || sv.sistolica > 140 || sv.diastolica < 60 || sv.diastolica > 90)
                        System.out.println("  ⚠️ PA crítica: " + sv.sistolica + "/" + sv.diastolica + " mmHg");
                    if (sv.spo2 < 90)
                        System.out.println("  ⚠️ SpO2 baja: " + sv.spo2 + "%");
                });

        // Mantener vivo el programa durante 21s
        Thread.sleep(21000);
    }
}

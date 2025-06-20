package org.meridianprime;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Random random = new Random();
        enum Prioridad { BAJA, MEDIA, ALTA } //enum para la prioridad de los accidentes

        //Sensores de tráfico	Nivel de congestión (0-100%)	Cada 500 ms
        Flux<Integer> trafico = Flux.interval(Duration.ofMillis(500))
                .map(i -> random.nextInt(101))
                .filter(congestion -> congestion > 70);
        trafico.subscribe(congestion -> System.out.println("🚗Alerta: Congestión del " + congestion + "% en Avenida Solar"));

        //Contaminación del aire	Nivel de partículas PM2.5 (ug/m3)	Cada 600 ms
        Flux<Integer> contaminacion = Flux.interval(Duration.ofMillis(600))
                .map(i -> random.nextInt(80)) // PM2.5 entre 0-80 ug/m3
                .filter(congestion -> congestion > 50);
        contaminacion.subscribe(congestion -> System.out.println("☁️Alerta: Contaminación alta (PM2.5: " + congestion + " ug/m3 )"));

        //Accidentes viales	Evento con prioridad (Baja, Media, Alta)	Cada 800 ms
        Flux<Prioridad> accidentes = Flux.interval(Duration.ofMillis(800))
                .map(tick -> {
                    int val = random.nextInt(3);
                    return Prioridad.values()[val];
                })
                .filter(prio -> prio == Prioridad.ALTA);
        accidentes.subscribe(prio -> System.out.println("🚑Emergencia vial: Accidente con prioridad Alta"));

        //Trenes maglev	Retraso en minutos (0-10 min)	Cada 700 ms
        Flux<Integer> trenes = Flux.interval(Duration.ofMillis(700))
                .map(i -> random.nextInt(101)) // valor entre 0 y 100
                .filter(congestion -> congestion > 70) // solo alertas críticas
                .onBackpressureBuffer(10) // si se acumulan más de 10 sin procesar, se guardan en buffer
                .delayElements(Duration.ofMillis(500)); // simulamos que el procesamiento tarda 500ms

        trenes.subscribe(retraso -> System.out.println("🚝 Tren maglev con retraso crítico: " + retraso + "% minutos"));

        //Semáforos inteligentes	Estado (Verde, Amarillo, Rojo) por cruce	Cada 400 ms
        Flux<String> semaforos = Flux.interval(Duration.ofMillis(400))
                .map(tick -> {
                    String[] estados = {"Verde", "Amarillo", "Rojo"};
                    return estados[random.nextInt(estados.length)];
                });
        semaforos.buffer(3,1)
                .filter(list -> list.size() == 3 && list.stream().allMatch(e -> e.equals("Rojo")))
                .subscribe(list -> System.out.println("🚦Semáforo en Rojo detectado 3 veces seguidas"));

        // 🚨 ALERTA GLOBAL: Detectar si ocurren 3 o más eventos críticos en 2 segundos
        Flux.merge(trafico, contaminacion, accidentes, trenes, semaforos)
                .bufferTimeout(5, Duration.ofSeconds(2)) // Agrupar eventos por ventana de tiempo (máx 5 eventos o 2 segundos)
                .filter(lista -> lista.size() >= 3)
                .doOnNext(lista -> {
                    System.out.println("🚨 Alerta global: Múltiples eventos críticos detectados en Meridian Prime");
                })
                .subscribe();

        // Mantener el programa vivo para que el flujo siga ejecutándose
        Thread.sleep(15000);
    }
}
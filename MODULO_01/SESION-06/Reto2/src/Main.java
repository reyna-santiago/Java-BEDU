import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        // temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // Orden natural: por producto (Comparable)
        Collections.sort(temas);
        System.out.println("Temas ordenados por nombre (orden natural):");
        for (Tema tema : temas) {
            System.out.println(tema);
        }

        // Orden personalizado: por prioridad (Comparator)
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad);
            }
        });
        System.out.println("\nTemas ordenados por prioridad (1 = urgente):");
        for (Tema tema : temas) {
            System.out.println(tema);
        }

        // Mapa concurrente: sensores por máquina
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");

        System.out.println("\nRespositorio de recursos por tema:");
        for (String recurso : recursos.keySet()) {
            System.out.println(recurso + ": " + recursos.get(recurso) );
        }
    }
}
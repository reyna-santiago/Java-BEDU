import java.util.HashSet;
import java.util.Set;

public class RegistroEmisionesOptimizado {
    public static void main(String[] args) {
        // Datos simulados de emisiones de CO₂ por línea de producción (kg)
        double[] emisiones = {123.5, 200.0, 123.5, 300.0, 200.0};

        // HashSet evita duplicados y permite búsqueda rápida
        Set<Double> emisionesRegistradas = new HashSet<>();

        for (double valor : emisiones) {
            if (!emisionesRegistradas.add(valor)) {
                System.out.println("⚠️ Duplicado detectado: " + valor + " kg de CO₂");
            }
        }
    }
}
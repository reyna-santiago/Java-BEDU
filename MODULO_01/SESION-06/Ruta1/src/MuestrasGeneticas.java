import java.util.*;

public class MuestrasGeneticas {
    public static void main(String[] args) {
        // Lista de muestras (puede haber repetidos)
        ArrayList<String> muestras = new ArrayList<>();
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");

        // HashSet: registrar especies únicas
        HashSet<String> especiesUnicas= new HashSet<>(muestras); // Elimina duplicados

        // HashMap: asociar  ID de muestra con el nombre del investigador.
        HashMap<String, String> lotesInvestigador = new HashMap<>();
        lotesInvestigador.put("M-001", "Dra. López");
        lotesInvestigador.put("M-002", "Dr. Hernández");

        //Mostrar resultados
        System.out.println("Lista de muestras de especies (con duplicados):\n");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.println(i + 1 + ". " + muestras.get(i));
        }
        System.out.println("\nEspecies únicas encontradas:\n");
        for (String unico : especiesUnicas) {
            System.out.println("- " + unico);
        }
        System.out.println("\nMuestras asociadas a los investigadores (ID → Investigador):");
        for (Map.Entry<String, String> entry : lotesInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        String idBuscar = "M-002";
        System.out.println("\n🔍 Investigador de la muestra " + idBuscar + ": " + lotesInvestigador.get(idBuscar));
    }
}
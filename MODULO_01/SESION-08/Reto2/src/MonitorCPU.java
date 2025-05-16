import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = null;
        Set<Integer> consumosRegistrados = new HashSet<>();

        try {
            scanner = new Scanner(System.in);
            System.out.println("🔍 MONITOREO DE CONSUMO DE CPU");


            while (true) {
                System.out.println("Ingresa valores de consumo (%) para varios servidores.");
                System.out.print("Escribe 'fin' para terminar: \n➡️");
                String entrada = scanner.nextLine();

                if (entrada.equalsIgnoreCase("fin")) {
                    break;
                }

                try {
                    int consumo = Integer.parseInt(entrada);

                    // Validaciones
                    if (consumo < 0 || consumo > 100) {
                        System.out.println("❌ Error: El consumo debe estar entre 0% y 100%.");
                        continue;
                    }

                    if (consumosRegistrados.contains(consumo)) {
                        System.out.println("⚠️ Advertencia: Este valor ya fue registrado.");
                        continue;
                    }

                    if (consumo > 95) {
                        throw new ConsumoCriticoException("🔥 Consumo crítico detectado: " + consumo + "%");
                    }

                    consumosRegistrados.add(consumo);
                    System.out.println("✅ Consumo registrado correctamente.\n");

                } catch (NumberFormatException e) {
                    System.out.println("❌ Error: Debes ingresar un número válido.");
                } catch (ConsumoCriticoException e) {
                    System.out.println("🚨 Excepción: " + e.getMessage());
                }
            }

            System.out.println("\n✅ Monitoreo finalizado.\nValores registrados: " + consumosRegistrados);

        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("🔒 Scanner cerrado.");
            }
        }
    }
}

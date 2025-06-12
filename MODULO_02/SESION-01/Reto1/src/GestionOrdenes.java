import java.util.List;

public class GestionOrdenes {

    // Método genérico para mostrar órdenes
    public static void mostrarOrdenes(List<? extends OrdenProduccion> lista) {
        System.out.println("Resumen de órdenes:");
        lista.forEach(OrdenProduccion::mostrarResumen);
    }

    // Método para procesar órdenes
    public static void procesarPersonalizadas(List<? super OrdenPersonalizada> lista, int costoAdicional) {
        System.out.println("Procesando órdenes personalizadas...");
        lista.forEach(o -> {
            if (o instanceof OrdenPersonalizada) {
                OrdenPersonalizada op = (OrdenPersonalizada) o;
                System.out.println("Orden personalizada "+op.getCodigo()+ " para "+ op.getCliente()+" ajustada con costo adicional de $" + costoAdicional);
            }
        });
    }
}

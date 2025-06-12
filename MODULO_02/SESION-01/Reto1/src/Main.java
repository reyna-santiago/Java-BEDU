import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OrdenProduccion> listaCombinada = new ArrayList<>();
        List<OrdenMasa> masa = Arrays.asList(
                new OrdenMasa("A053", 100),
                new OrdenMasa("A094", 300)
        );
        List<OrdenPersonalizada> personalizada = Arrays.asList(
                new OrdenPersonalizada("B318", 50, "Reyna"),
                new OrdenPersonalizada("B320", 200, "Manuel")
        );
        List<OrdenPrototipo> prototipo = Arrays.asList(
                new OrdenPrototipo("C029", 12, "Fase de diseño"),
                new OrdenPrototipo("C190", 2, "Fase de pruebas")
        );
        //todas las órdenes a la lista combinada
        listaCombinada.addAll(masa);
        listaCombinada.addAll(personalizada);
        listaCombinada.addAll(prototipo);
        //ordenes por tipo
        GestionOrdenes.mostrarOrdenes(masa);
        GestionOrdenes.mostrarOrdenes(personalizada);
        GestionOrdenes.mostrarOrdenes(prototipo);
        //Procesar órdenes personalizadas
        GestionOrdenes.procesarPersonalizadas(personalizada, 300);

        ContarOrdenes.contarOrdenesPorTipo(listaCombinada);
    }
}
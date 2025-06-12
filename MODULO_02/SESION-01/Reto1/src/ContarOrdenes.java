import java.util.List;

public class ContarOrdenes {
    //RETO ADICIONAL: Implementa una función que cuente el total de órdenes de cada tipo en la planta.

    public static void contarOrdenesPorTipo(List<? extends OrdenProduccion> lista) {
        long ordenMasa = lista.stream().filter(o -> o instanceof OrdenMasa).count();
        long ordenPersonalizada = lista.stream().filter(o -> o instanceof OrdenPersonalizada).count();
        long ordenPrototipo = lista.stream().filter(o -> o instanceof OrdenPrototipo).count();

        System.out.println("-Total de órdenes-");
        System.out.println("OrdenMasa: " + ordenMasa);
        System.out.println("OrdenPersonalizada: " + ordenPersonalizada);
        System.out.println("OrdenPrototipo: " + ordenPrototipo);
    }
}

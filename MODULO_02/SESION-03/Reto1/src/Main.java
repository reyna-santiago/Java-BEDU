import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = List.of(
                new Pedido("Luis", "Domicilio", "955-234-1023"),
                new Pedido("Lupita", "Domicilio", "955-452-2515"),
                new Pedido("María", "Domicilio", null),
                new Pedido("Manuel", "Local", "985-514-6325"),
                new Pedido("Jose", "Local", "551-525-9004"),
                new Pedido("Reyna", "Local", null)
        );

        List<String> confirmacion = pedidos.stream()
                .filter(p -> p.getTipoEntrega().equalsIgnoreCase("Domicilio")) //Filtrar por entrega a domicilio
                .map(Pedido::getTelefono) //Transformar Pedido → Optional<String>
                .filter(Optional::isPresent) //Filtrar los Optional con valor
                .map(Optional::get) //Extraer el número del Optional
                .map(telefono -> "\uD83D\uDCDE Confirmación enviada al número: " + telefono) //Transformar cada teléfono en un mensaje de confirmación
                .toList(); //En lista

        //Mostrar confirmaciones
        System.out.println("LISTA DE CONFIRMACIONES");
        confirmacion.forEach(System.out::println);
    }
}
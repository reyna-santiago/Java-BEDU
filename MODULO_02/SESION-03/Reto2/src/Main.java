import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Sucursales con encuesta
        List<Sucursal> sucursales = List.of(
                new Sucursal("Norte", List.of(
                        new Encuesta("Reyna", "La atención fue buena, pero la limpieza puede mejorar", 3),
                        new Encuesta("Manuel", null, 4)
                )),
                new Sucursal("Centro", List.of(
                        new Encuesta("José", null, 3),
                        new Encuesta("Luis", "El tiempo de espera fue largo", 2)
                ))
        );

        System.out.println("CALIFICACIONES IGUALES O MENORES A 3");

        sucursales.stream()
                .flatMap(sucursal ->
                        sucursal.getEncuestas().stream()
                                .filter(e -> e.getCalificacion() <= 3) //Filtrar encuestas con calificaciones iguales o menores a 3
                                .map(encuesta -> new Seguimiento(encuesta, sucursal.getNombre())) //combinar encuesta + sucursal
                )
                .filter(seguimiento -> seguimiento.encuesta().getComentario().isPresent()) //Filtrar encuestas con comentario
                .map(seguimiento -> {
                    String mensajeSeguimiento="Sucursal " + seguimiento.sucursal() + ": Seguimiento a paciente "+ seguimiento.encuesta().getPaciente()+" con comentario: \"" +seguimiento.encuesta().getComentario().get()+ "\"";
                    return mensajeSeguimiento;
                })
                .forEach(System.out::println);
    }

   
}
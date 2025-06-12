import java.util.*;

public class PlataformaEducativa {

    public static void main(String[] args) {
        // Crear materiales
        List<MaterialCurso> materiales = Arrays.asList(
                new Video("Introducción a Java", "Mario", 15),
                new Video("POO en Java", "Carlos", 20),
                new Articulo("Historia de Java", "Ana", 1200),
                new Articulo("Tipos de datos", "Luis", 800),
                new Ejercicio("Variables y tipos", "Luis",false),
                new Ejercicio("Condicionales", "Mario",false)
        );

        // Filtrar cada tipo (solo para videos y ejercicios)
        List<Video> videos = new ArrayList<>();
        List<Ejercicio> ejercicios = new ArrayList<>();
        for (MaterialCurso m : materiales) {
            if (m instanceof Video) {
                videos.add((Video) m);
            } else if (m instanceof Ejercicio) {
                ejercicios.add((Ejercicio) m);
            }
        }

        // Mostrar todos los materiales
        MetodosGenericos.mostrarMateriales(materiales);

        // Contar duración total de videos
        MetodosGenericos.contarDuracionVideos(videos);

        // Marcar ejercicios como revisados
        MetodosGenericos.marcarEjerciciosRevisados(ejercicios);

        //Filtrar materiales por autor
        MetodosGenericos.filtrarPorAutor(materiales, m -> m.getAutor().equals("Ana"));
    }
}
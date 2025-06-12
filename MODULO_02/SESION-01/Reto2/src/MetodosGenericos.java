import java.util.List;
import java.util.function.Predicate;

public class MetodosGenericos {

    // Método genérico para mostrar resumen de materiales de curso
    public static void mostrarMateriales(List<? extends MaterialCurso> lista) {
        System.out.println("\n\nResumen de materiales del curso:");
        for (MaterialCurso material : lista) {
            material.mostrarDetalle();
        }
    }

    public static void contarDuracionVideos(List<? extends Video> lista) {
        int total = 0;
        for (Video v : lista) {
            total += v.getDuracionMinutos(); //sumar la duración de cada video al total
        }
        System.out.println("\nDuración total de videos: " + total + " minutos");
    }

    public static void marcarEjerciciosRevisados(List<? super Ejercicio> lista) {
        lista.forEach(obj -> {
            if (obj instanceof Ejercicio e) {
                System.out.println("\nMarcando ejercicio " +e.getTitulo()+ "como revisado...");
                e.setRevisado(true);
            }
        });
    }

    //Filtrar materiales por autor
    public static void filtrarPorAutor(List<? extends MaterialCurso> lista, Predicate<MaterialCurso> filtro) {
        System.out.println("\n\nFiltrando materiales por autor:");
        for (MaterialCurso material : lista) {
            if (filtro.test(material)) {
                material.mostrarDetalle();
            }
        }
    }
}

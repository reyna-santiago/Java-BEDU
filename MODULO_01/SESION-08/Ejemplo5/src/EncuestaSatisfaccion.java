// Paso 2: Clase que lanza la excepción
public class EncuestaSatisfaccion {

    // Este método valida que la calificación esté entre 1 y 5
    public static void registrarCalificacion(int calificacion) throws CalificacionInvalidaException {
        if (calificacion < 1 || calificacion > 5) {
            throw new CalificacionInvalidaException("La calificación debe estar entre 1 y 5.");
        }

        System.out.println("✅ Calificación registrada: " + calificacion);
    }
}
// Paso 1: Crear la excepción personalizada
public class CalificacionInvalidaException extends Exception {
    public CalificacionInvalidaException(String mensaje) {
        super(mensaje);
    }
}
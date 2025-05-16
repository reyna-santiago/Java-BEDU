// Clase de servicio que aplica inversión de dependencias
public class ServicioEnvio {
    private EstrategiaCostoEnvio estrategia;

    public ServicioEnvio(EstrategiaCostoEnvio estrategia) {
        this.estrategia = estrategia;
    }

    public double obtenerCostoEnvio(PaqueteRefactorizado paquete) {
        return estrategia.calcularCosto(paquete);
    }
}
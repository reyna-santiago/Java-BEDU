// Implementación concreta de la estrategia estándar
public class CostoEnvioEstandar implements EstrategiaCostoEnvio {
    public double calcularCosto(PaqueteRefactorizado paquete) {
        return paquete.getPeso() * 10.5;
    }
}
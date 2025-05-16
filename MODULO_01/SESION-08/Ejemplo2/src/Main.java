public class Main {
    public static void main(String[] args) {
        PaqueteRefactorizado paquete = new PaqueteRefactorizado("Fernanda Loera", 2.5);


        Imprimible impresora = new ImpresoraEtiqueta();
        impresora.imprimirEtiqueta(paquete);

        EstrategiaCostoEnvio estrategia = new CostoEnvioEstandar();
        ServicioEnvio servicio = new ServicioEnvio(estrategia);

        double costo = servicio.obtenerCostoEnvio(paquete);
        System.out.println("💰 Costo de envío: $" + costo);
    }
}
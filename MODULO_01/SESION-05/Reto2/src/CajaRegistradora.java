public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] metodoPagos = {
                new PagoEfectivo(150.0),
                new PagoTarjeta(320.0, 500.0),
                new PagoTransferencia(250.0, false)
        };

        //Recorrer el arreglo de métodos de pagos
        for (MetodoPago metodoPago : metodoPagos) {
            if (metodoPago.autenticar()) {
                System.out.println("Autenticación exitosa.");
                metodoPago.procesarPago();
                metodoPago.mostrarResumen();
            }
            else {
                System.out.println("Error de autenticación. " + metodoPago.getClass().getName() + " no válido.");
            }
        }
    }
}
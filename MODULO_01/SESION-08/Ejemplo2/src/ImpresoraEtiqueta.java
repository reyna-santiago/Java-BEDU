// Clase que imprime el estado del paquete
public class ImpresoraEtiqueta implements Imprimible {
    public void imprimirEtiqueta(PaqueteRefactorizado paquete) {
        System.out.println("📦 Envío a: " + paquete.getDestinatario());
    }
}
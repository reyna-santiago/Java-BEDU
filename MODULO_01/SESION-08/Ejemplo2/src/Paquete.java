public class Paquete {
    private String destinatario;
    private double peso;

    public Paquete(String destinatario, double peso) {
        this.destinatario = destinatario;
        this.peso = peso;
    }

    public void imprimirEtiqueta() {
        System.out.println("Enviando a: " + destinatario);
    }

    public double calcularCostoEnvio() {
        return peso * 10.5; // tarifa fija por kilo
    }
}
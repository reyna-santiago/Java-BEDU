// SRP: Clase solo para datos
public class PaqueteRefactorizado {
    private String destinatario;
    private double peso;

    public PaqueteRefactorizado(String destinatario, double peso) {
        this.destinatario = destinatario;
        this.peso = peso;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public double getPeso() {
        return peso;
    }
}


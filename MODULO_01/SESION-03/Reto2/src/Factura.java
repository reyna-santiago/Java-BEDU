import java.util.Optional;

public class Factura {
    //Atributos privados
    double monto; //cantidad total de la factura 💵
    String descripcion; // breve concepto de lo facturado 🧾
    private Optional<String> rfc; // RFC del cliente (puede estar presente o no)

    //Métodos
    public Factura(double monto, String descripcion, String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }
    public String getResumen(){
        // orElse devuelve el valor si existe, o el alternativo si no
        String num_rfc = getRFC().orElse("No registrado");

        return "\n\uD83D\uDCC4 Factura generada::\n Monto"+monto+"\nDescripción: "+descripcion+"\nRFC: "+num_rfc+"\n";
    }
    private Optional<String> getRFC(){
        return rfc;
    }
}

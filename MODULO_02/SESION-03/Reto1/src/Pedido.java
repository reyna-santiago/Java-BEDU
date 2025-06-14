import java.util.Optional;

public class Pedido {
    /*cliente (String)
    tipoEntrega (String) → "domicilio" o "local"
    telefono (String, puede ser null)*/
    private String cliente;
    private String tipoEntrega;
    private String telefono;

    public Pedido(String cliente, String tipoEntrega, String telefono){
        this.cliente=cliente;
        this.tipoEntrega=tipoEntrega;
        this.telefono=telefono;
    }

    public String getCliente(){
        return cliente;
    }
    public String getTipoEntrega(){
        return tipoEntrega;
    }
    //getTelefono() que devuelve un Optional<String>.
    public Optional<String> getTelefono(){
        return Optional.ofNullable(telefono);
    }
}

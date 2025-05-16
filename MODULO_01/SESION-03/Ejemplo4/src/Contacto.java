import java.util.Optional;

public class Contacto {
    private Optional<String> telefono;

    public Contacto(String telefono) {
        this.telefono = Optional.ofNullable(telefono);
    }

    public Optional<String> getTelefono() {
        return telefono;
    }
}
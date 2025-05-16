public class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarNombre(Persona p) {
        p.nombre = "Nuevo nombre";
    }
}
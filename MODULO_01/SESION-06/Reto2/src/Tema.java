
public class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad; // (1 = urgente, 2 = importante, 3 = opcional)

    public Tema(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    // Orden natural: por nombre del tema (alfabético)
    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        return "Tema: " + titulo + " | Prioridad: " + prioridad;
    }

}

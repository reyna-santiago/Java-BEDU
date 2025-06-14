import java.util.concurrent.locks.ReentrantLock;

public class RecursoMedico {
    private String nombre;
    private final ReentrantLock lock = new ReentrantLock(); //Asegurar que solo un hilo acceda al recurso a la vez

    public RecursoMedico(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void usar(String profesional) {
        lock.lock(); //Solicita acceso exclusivo
        try {
            System.out.println(profesional + " ha ingresado a " + nombre);
            Thread.sleep(1000); //Simula el uso del recurso
            System.out.println(profesional + " ha salido de " + nombre);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock(); //Libera el recurso
        }
    }
}

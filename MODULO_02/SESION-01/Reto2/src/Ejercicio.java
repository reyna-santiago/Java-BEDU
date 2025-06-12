public class Ejercicio extends MaterialCurso{
    private boolean revisado; //agrega duracion en minutos

    public Ejercicio(String titulo, String autor, boolean revisado){
        super(titulo, autor);
        this.revisado = revisado;
    }

    public boolean getRevisado(){
        return revisado;
    }
    public void setRevisado(boolean revisado){
        this.revisado = revisado;
    }

    @Override
    public void mostrarDetalle(){
        System.out.println("\nEjercicio: "+getTitulo()+"\nAutor: "+getAutor()+"\nRevisado: "+getRevisado());
    }
}

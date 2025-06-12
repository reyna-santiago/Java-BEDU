public class Video extends  MaterialCurso{
    private int duracionMinutos; //agrega duracion en minutos
    public Video(String titulo, String autor, int duracionMinutos){
        super(titulo, autor);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos(){
        return duracionMinutos;
    }

    @Override
    public void mostrarDetalle(){
        System.out.println("\nVideo: "+getTitulo()+"\nAutor: "+getAutor()+"\nDuración: "+getDuracionMinutos()+" min");
    }
}

public abstract class MaterialCurso {
    private String titulo;
    private String autor;

    public MaterialCurso(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }

    public void mostrarDetalle(){

    }
}

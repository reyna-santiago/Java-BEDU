public class Articulo extends  MaterialCurso{
    private int palabras; //agrega palabras

    public Articulo (String titulo, String autor, int palabras){
        super(titulo, autor);
        this.palabras = palabras;
    }

    public int getPalabras(){
        return palabras;
    }

    @Override
    public void mostrarDetalle(){
        System.out.println("\nArtículo: "+getTitulo()+"\nAutor: "+getAutor()+"\nCantidad de palabras: "+getPalabras());
    }
}

public class OrdenMasa extends OrdenProduccion{

    public OrdenMasa (String codigo, int cantidad){
        super(codigo,cantidad);
    }

    @Override
    public void mostrarResumen() {
        System.out.println("OrdenMasa");
        System.out.println("Código: "+getCodigo()+"\nCantidad: "+getCantidad()+"\n");
    }
}

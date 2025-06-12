public class OrdenPersonalizada extends  OrdenProduccion{
    private String cliente;//Agregar cliente como atributo

    public OrdenPersonalizada(String codigo, int cantidad, String cliente){
        super(codigo, cantidad);
        this.cliente = cliente;
    }
    public String getCliente(){
        return cliente;
    }
    @Override
    public void mostrarResumen() {
        System.out.println("OrdenPersonalizada");
        System.out.println("Código: "+getCodigo()+"\nCantidad: "+getCantidad()+"\nCliente: "+getCliente()+"\n");
    }
}

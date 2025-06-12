public class OrdenPrototipo extends OrdenProduccion{
    private String faseDesarrollo; //agregar faseDesarrollo como atributo

    public OrdenPrototipo(String codigo, int cantidad, String faseDesarrolo){
        super(codigo, cantidad);
        this.faseDesarrollo = faseDesarrolo;
    }
    public String getFaseDesarrollo(){
        return faseDesarrollo;
    }
    @Override
    public void mostrarResumen() {
        System.out.println("OrdenPrototipo");
        System.out.println("Código: "+getCodigo()+"\nCantidad: "+getCantidad()+"\nFase de desarrollo: "+getFaseDesarrollo()+"\n");
    }
}

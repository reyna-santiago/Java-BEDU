public class Entrada {
    //Atributos
    String nombreEvento;
    double precioEntrada;

    public  Entrada(String nombreEvento, double precioEntrada){
        this.nombreEvento = nombreEvento;
        this.precioEntrada = precioEntrada;
    }

    public void mostrarInformacion(){
        System.out.println("Evento: "+nombreEvento+" | Precio: $"+precioEntrada);
    }
}

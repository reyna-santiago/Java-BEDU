public class Ambulancia extends UnidadEmergencia{
    //String nombre;
    String nombreOperador;
    SistemaGPS gps = new SistemaGPS();
    Sirena sirena = new Sirena();
    Operador operador = new Operador();

    public Ambulancia (String nombreAmbulancia, String nombreOperador){
        super(nombreAmbulancia);
        this.nombreOperador = nombreOperador;
    }
    public void iniciarOperacion(){
        activarUnidad(nombre); //El atributo nombre de la clase padre
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse(nombreOperador);
        responder();
    }
    @Override
    public void responder(){
        System.out.println("\uD83E\uDE7A Ambulancia en camino al hospital más cercano.\n");
    }
}

public class Patrulla extends UnidadEmergencia{
    String nombreOperador;
    SistemaGPS gps = new SistemaGPS();
    Sirena sirena = new Sirena();
    Operador operador = new Operador();

    public Patrulla (String nombrePatrulla, String nombreOperador){
        super(nombrePatrulla);
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
        System.out.println("\uD83D\uDE93 Patrulla atendiendo situación de seguridad ciudadana.\n");
    }
}

public class UnidadBomberos extends UnidadEmergencia{
    String nombreOperador;
    SistemaGPS gps = new SistemaGPS();
    Sirena sirena = new Sirena();
    Operador operador = new Operador();

    public UnidadBomberos (String nombreBomberos, String nombreOperador){
        super(nombreBomberos);
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
        System.out.println("\uD83D\uDD25 Unidad de bomberos respondiendo a incendio estructural.\n");
    }
}

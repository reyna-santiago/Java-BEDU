public class UnidadEmergencia {
    String nombre; //Atributo nombre

    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }


    //método responder
    public void responder(){
        System.out.println("Este mensaje va ser cambiado en cada unidad de emergencia");
    }

    //método activarUnidad
    public void activarUnidad(String nombre){
        System.out.println("\uD83D\uDEA8 Activando unidad: "+nombre);
    }

}

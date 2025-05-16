public class Vuelo {
    //🔐 Atributos:
    final String codigoVuelo; // código único del vuelo ✈️
    String destino;// ciudad destino del vuelo 🗺️
    String horaSalida; // hora de salida en formato 24h ⏰
    Pasajero asientoReservado; //referencia al pasajero que reservó el asiento (puede ser null)

    //Métodos:

    public Vuelo(String codigo, String destino, String horaSalida){ //constructor del vuelo
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;

    }
    public boolean reservarAsiento(Pasajero p) {
        //Asigna al pasajero si no hay reserva previa
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false;
        }

    }
    public boolean reservarAsiento(String nombre, String pasaporte){
        //Método sobrecargado
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);

    }
    void cancelarReserva() {
        //Elimina al pasajero asignado
        asientoReservado = null;
        //Mostrar mensaje
        System.out.println("Cancelando reserva...\n");
    }
    String obtenerItinerario() {
       // Muestra la información del vuelo y el pasajero
        String itenerario = "La información del vuelo "+codigoVuelo+" es la siguiente:\n";
        itenerario += "Destino: " + destino + "\n";
        itenerario += "Hora de salida: " + horaSalida + "\n";
        if (asientoReservado != null) {
            itenerario += "Nombre del pasajero: " + asientoReservado.nombre + "\n";
        } else {
            itenerario += "Sin asientos reservados\n";
        }
        return itenerario;

    }
}

public class Main {
    public static void main(String[] args) {
        //Crear al menos un pasajero y un vuelo
        Pasajero pasajero_1 = new Pasajero("Reyna","G12345678");
       // Pasajero pasajero_2 = new Pasajero("Emmanuel","P1234567");

        Vuelo vuelo_1 = new Vuelo("AM345","Madrid","16:15");
        //Reservar el asiento en el vuelo
        boolean reservar = vuelo_1.reservarAsiento(pasajero_1);
        if(reservar == true){
            System.out.println("Reserva realizada con éxito.");
        }else{
            System.out.println("La reserva no se pudo realizar");
        }
        //Mostrar el itinerario
        String intinerario = vuelo_1.obtenerItinerario();
        System.out.println(intinerario);
        //Cancelar la reserva
        vuelo_1.cancelarReserva();
        //Mostrar nuevamente el itinerario
        intinerario = vuelo_1.obtenerItinerario();
        System.out.println(intinerario);
        //Reservar un asiento en el vuelo usando un nombre y pasapor
        reservar = vuelo_1.reservarAsiento("Emmanuel", "P1234567");
        if(reservar == true){
            System.out.println("Reserva realizada con éxito.");
        }else{
            System.out.println("La reserva no se pudo realizar");
        }
        //Mostrar nuevamente el itinerario
        intinerario = vuelo_1.obtenerItinerario();
        System.out.println(intinerario);




    }
}
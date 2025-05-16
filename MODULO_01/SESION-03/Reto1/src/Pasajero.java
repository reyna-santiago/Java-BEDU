public class Pasajero {
    //📋 Atributos:
    String nombre; //nombre del pasajero 👤
    String pasaporte; // número de pasaporte ✈️
    //🛠️ Métodos:
    Pasajero(String nombre, String pasaporte){
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }
    String getNombre(){
        return nombre;
    }
    String getPasaporte(){
        return pasaporte;
    }
}

public class Simulador {
    public static void main(String[] args) {
        Autoautonomo tesla = new Autoautonomo("Tesla");

        tesla.encender();          // Método heredado de Vehiculo
        tesla.iniciarAutonomia();  // Método propio con composición
    }
}
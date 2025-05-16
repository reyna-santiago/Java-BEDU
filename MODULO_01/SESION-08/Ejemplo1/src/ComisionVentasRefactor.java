public class ComisionVentasRefactor {

    public static void main(String[] args) {
        String nombreAgente = "Carlos";
        double montoVentas = 30000;

        double comisionCalculada = calcularComision(montoVentas);
        mostrarComision(nombreAgente, comisionCalculada);

        if (estaCercaDelSiguienteNivel(montoVentas)) {
            System.out.println("¡" + nombreAgente + " está cerca del siguiente nivel!");
        }
    }

    // Esta función se encarga únicamente del cálculo de la comisión
    public static double calcularComision(double ventas) {
        if (ventas >= 20000 && ventas <= 40000) {
            return ventas * 0.10;
        } else if (ventas > 40000) {
            return ventas * 0.12;
        } else {
            return ventas * 0.05;
        }
    }

    // Esta función muestra la comisión
    public static void mostrarComision(String nombre, double comision) {
        System.out.println("Comisión de " + nombre + ": $" + comision);
    }

    // Verifica si el vendedor está cerca del siguiente nivel
    public static boolean estaCercaDelSiguienteNivel(double ventas) {
        return ventas > 25000 && ventas < 30000;
    }
}
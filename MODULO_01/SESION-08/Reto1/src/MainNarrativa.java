import java.util.Scanner;

public class MainNarrativa {
    public static void main(String[] args) {
        //clases concretas en las interfaces
        LogicaDecision decision = new DecisionBinaria();       // El usuario decide
        TransicionHistoria transicion = new TransicionSimple(); // Lógica de transición
        GestorDialogo dialogo = new DialogoTexto();

        // Mostrar escena inicial
        dialogo.mostrarDialogo(0);

        // Obtener decisión del usuario
        int decisionTomada = decision.obtenerDecision();
        System.out.println("✅ Decisión registrada ");

        // Transición a la siguiente escena
        int siguienteEscena = transicion.siguienteEscena(decisionTomada);

        // Mostrar diálogo de la siguiente escena
        dialogo.mostrarDialogo(siguienteEscena);


    }
}
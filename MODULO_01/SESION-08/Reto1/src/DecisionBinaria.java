import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision{
    @Override
    public int obtenerDecision() {
        // Mostrar diálogos
        Scanner scanner = new Scanner(System.in);
        System.out.print("👉 Escribe tu decisión (1. Seguir explorando o 2. Descansar): ");
        int decisionUsuario = scanner.nextInt();

        return decisionUsuario;
    }
}

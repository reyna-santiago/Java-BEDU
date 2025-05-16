public class DialogoTexto implements  GestorDialogo{
    @Override
    public void mostrarDialogo(int escena) {
        switch (escena) {
            case 0:
                System.out.println("🌙 Imagina que eres un explorador y la noche ha caído, debes decidir tu próximo paso...");
                break;
            case 1:
                System.out.println("🌲 Te adentras en el bosque oscuro lleno de misterios.");
                break;
            case 2:
                System.out.println("🔥 Decides descansar en el campamento, recuperando energías.");
                break;
            default:
                System.out.println("❓ Decisión no válida...");
        }
    }
}

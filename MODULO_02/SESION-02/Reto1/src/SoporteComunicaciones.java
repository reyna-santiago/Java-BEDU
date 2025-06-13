import java.util.concurrent.Callable;

public class SoporteComunicaciones implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "\uD83D\uDCE1 Comunicaciones: enlace con estación terrestre establecido.";
    }
}

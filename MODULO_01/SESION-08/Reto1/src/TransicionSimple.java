public class TransicionSimple implements TransicionHistoria{
    @Override
    public int siguienteEscena(int decision) {
        if (decision==1) {
            return 1;
        } else if (decision==2) {
            return 2;
        } else {
            return 3;
        }
    }
}

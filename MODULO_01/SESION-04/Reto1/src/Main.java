
public class Main {
    public static void main(String[] args) {

        Factura factura_1 = new Factura("0001", "Reyna", 1250.0);
        Factura factura_2 = new Factura("0001", "Reyna", 229.0);

        //Mostrar facturas
        System.out.println(factura_1);
        System.out.println(factura_2);

        //Comparar facturas
        boolean comparar = factura_1.equals(factura_2);
        System.out.println("¿Las facturas son iguales? "+comparar);
    }
}
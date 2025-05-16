public class Main {
    public static void main(String[] args) {
        Factura factura_1 = new Factura(1500.75,"Servicio de mantenimiento de servidores", "ABC123456T89");
        Factura factura_2 = new Factura(249.99,"Venta de teclado",null);

        //Imprimir resumen de cada factura
        String resumenFactura1 = factura_1.getResumen();
        String resumenFactura2 = factura_2.getResumen();

        System.out.println(resumenFactura1);
        System.out.println(resumenFactura2);
    }
}
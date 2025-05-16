import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args){
        //Atributos del medicamento
        String medicamento; //Nombre del medicamento (tipo String)
        double precioUnitario; //Precio unitario (tipo double)
        var cantidad=0; //Cantidad de piezas (tipo int)
        //Variables para calcular descuento
        double totalSinDescuento;
        double descuento;
        double totalAPagar;
        boolean aplicarDescuento;
        //Objeto Scanner
        Scanner leer = new Scanner(System.in);

        //Pedir datos
        System.out.println("Ingrese la información");
        System.out.print("Nombre del medicamento: ");
        medicamento = leer.nextLine();
        System.out.print("Cantidad: ");
        cantidad = leer.nextInt();
        System.out.print("Precio: $");
        precioUnitario = leer.nextDouble();

        //Calcular el total sin descuento
        totalSinDescuento = precioUnitario * cantidad;
        //Descuento si el total supera $500
        aplicarDescuento = totalSinDescuento > 500;
        //Asignación del descuento (15%)
        descuento = aplicarDescuento ? totalSinDescuento * 0.15 : 0;
        //Total a pagar final
        totalAPagar = totalSinDescuento - descuento;
        //Salida
        System.out.println("---------------------------------------");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento? " + aplicarDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalAPagar);

    }
}

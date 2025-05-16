import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        int opcion;
        var saldo = 1000.0;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.printf("\n\nBienvenido al cajero automático\n" +
                    "1. Consultar saldo\n" +
                    "2. Depositar dinero\n" +
                    "3. Retirar dinero\n" +
                    "4. Salir\n" +
                    "Ingresa tu opción: ");
            opcion=leer.nextInt(); //Variable para leer la opción

            switch (opcion){
                case 1 -> {
                    //CONSULTAR SALDO
                    System.out.println("Tu saldo actual es: $"+saldo);
                }
                case 2 -> {
                    //DEPOSITAR DINERO
                    System.out.print("Ingresa el monto que deseas depositar: $");
                    double dinero = leer.nextDouble(); //Variable para leer el dinero ingresado
                    if (dinero < 1) {
                        System.out.println("El monto ingresado debe ser mayor a $0.");
                        continue; // Volver al menú
                    }
                    else{
                        saldo += dinero; // Aumentar el saldo actual
                        System.out.println("Depósito realizado con éxito. Selecciona la opción 1 para consultar tu saldo.");
                    }
                }
                case 3 -> {
                    //RETIRAR DINERO
                    System.out.print("Ingresa el monto reque deseas tirar: $");
                    double dinero = leer.nextDouble();

                    if (dinero < 1) {
                        System.out.println("El monto ingresado debe ser mayor a $0.");
                        continue; // Volver al menú sin
                    }
                    else{
                        if (dinero > saldo) {
                            System.out.println("Tu saldo es menor a $" + dinero+".");
                        } else {
                            saldo -= dinero; // Restar el dinero retirado al saldo actual
                            System.out.println("Retiro realizado con éxito. Selecciona la opción 1 para consultar tu saldo.");
                        }
                    }

                }
                case 4 -> {
                    //SALIR
                    System.out.println("Gracias. Vuelva pronto.");
                }
                default -> {
                    //OPCIÓN NO VÁLIDA
                    System.out.println("Opción NO válida.");
                }
            }
        }while(opcion!=4);

    }
}